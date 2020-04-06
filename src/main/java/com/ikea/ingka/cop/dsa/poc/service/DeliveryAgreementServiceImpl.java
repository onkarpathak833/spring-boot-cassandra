package com.ikea.ingka.cop.dsa.poc.service;

import com.ikea.ingka.cop.dsa.poc.domain.DeliveryAgreementSolution;
import com.ikea.ingka.cop.dsa.poc.repository.CassandraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryAgreementServiceImpl implements DeliveryAgreementService {

    private CassandraRepository cassandraRepository;

    @Autowired
    public DeliveryAgreementServiceImpl(CassandraRepository cassandraRepository) {
        this.cassandraRepository = cassandraRepository;

    }

    @Override
    public String saveDeliveryAgreementSolution(DeliveryAgreementSolution deliveryAgreementSolution) {
        cassandraRepository.save(deliveryAgreementSolution);
        return "delivery/" + deliveryAgreementSolution.getDeliveryAgreementId();
    }

    @Override
    public String getDeliveryAgreementSolutionById(String id) {
        return cassandraRepository.findById(id).get().getDeliverySolutionXML();

    }
}
