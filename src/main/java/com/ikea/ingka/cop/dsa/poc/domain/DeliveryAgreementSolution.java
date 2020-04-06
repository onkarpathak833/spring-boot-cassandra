package com.ikea.ingka.cop.dsa.poc.domain;

import com.datastax.driver.core.DataType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.validation.constraints.NotNull;

@Table("delivery_solution")
public class DeliveryAgreementSolution {

    @PrimaryKey
    @NotNull
    @CassandraType(type = DataType.Name.TEXT)
    String deliveryAgreementId;

    String deliverySolutionXML;

    public String getDeliveryAgreementId() {
        return deliveryAgreementId;
    }

    public void setDeliveryAgreementId(String deliveryAgreementId) {
        this.deliveryAgreementId = deliveryAgreementId;
    }

    public String getDeliverySolutionXML() {
        return deliverySolutionXML;
    }

    public void setDeliverySolutionXML(String deliverySolutionXML) {
        this.deliverySolutionXML = deliverySolutionXML;
    }

    @Override
    public String toString() {
        return "DeliveryAgreementSolution{" +
                "deliveryAgreementId='" + deliveryAgreementId + '\'' +
                '}';
    }
}
