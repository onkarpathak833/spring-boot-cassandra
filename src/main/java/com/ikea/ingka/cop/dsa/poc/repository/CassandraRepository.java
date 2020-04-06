package com.ikea.ingka.cop.dsa.poc.repository;

import com.ikea.ingka.cop.dsa.poc.domain.DeliveryAgreementSolution;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CassandraRepository extends CrudRepository<DeliveryAgreementSolution, String> {
}
