package com.ikea.ingka.cop.dsa.poc.service;

import com.ikea.ingka.cop.dsa.poc.domain.DeliveryAgreementSolution;
import org.springframework.stereotype.Service;

public interface DeliveryAgreementService {

    String saveDeliveryAgreementSolution(DeliveryAgreementSolution deliveryAgreementSolution);
    String getDeliveryAgreementSolutionById(String id);
}
