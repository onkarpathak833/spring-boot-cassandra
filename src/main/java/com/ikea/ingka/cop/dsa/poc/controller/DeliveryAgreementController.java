package com.ikea.ingka.cop.dsa.poc.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.ikea.ingka.cop.dsa.poc.domain.DeliveryAgreementSolution;
import com.ikea.ingka.cop.dsa.poc.service.DeliveryAgreementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public String getDocumentById(@PathVariable String id) {
        return deliveryService.getDeliveryAgreementSolutionById(id);
    }

}
