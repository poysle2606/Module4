package com.codegym.model.contract;

import javax.persistence.*;

@Entity
public class ContractDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "contractId", referencedColumnName = "id")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "attachFacilityId", referencedColumnName = "id")
    private AttachFacility facility;

    public ContractDetail() {
    }

    public ContractDetail(int id, int quantity, Contract contract, AttachFacility facility) {
        this.id = id;
        this.quantity = quantity;
        this.contract = contract;
        this.facility = facility;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachFacility getFacility() {
        return facility;
    }

    public void setFacility(AttachFacility facility) {
        this.facility = facility;
    }
}
