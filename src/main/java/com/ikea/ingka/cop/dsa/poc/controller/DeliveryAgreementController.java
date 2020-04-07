package com.ikea.ingka.cop.dsa.poc.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.ikea.ingka.cop.dsa.poc.domain.DeliveryAgreementSolution;
import com.ikea.ingka.cop.dsa.poc.service.DeliveryAgreementService;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.apache.commons.lang3.StringEscapeUtils;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

@Controller
public class DeliveryAgreementController {

    private DeliveryAgreementService deliveryService;

    @Autowired
    public void setDeliveryService(DeliveryAgreementService deliveryAgreementService) {
        this.deliveryService = deliveryAgreementService;
    }


    @ResponseBody
    @RequestMapping(value = "/delivery", method = RequestMethod.POST)
    public String writeDeliverySolution(@RequestBody DeliveryAgreementSolution deliveryAgreementSolution) {
        return deliveryService.saveDeliveryAgreementSolution(deliveryAgreementSolution);
    }

    @ResponseBody
    @RequestMapping(value = "/delivery/{id}")
    public String getDocumentById(@PathVariable String id) throws IOException, TransformerException {
        String jsonString = deliveryService.getDeliveryAgreementSolutionById(id);
        jsonString = StringEscapeUtils.unescapeJava(jsonString);
        JSONObject jsonObject = new JSONObject(jsonString);
        String xmlString = XML.toString(jsonObject);
        xmlString = xmlString.replaceAll("-", "");
        System.out.println(xmlString);
        xmlString = StringEscapeUtils.escapeXml(xmlString);
        return xmlString;

    }


}
