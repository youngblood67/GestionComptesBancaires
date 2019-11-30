package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class Compte implements Serializable {

    private String codeCompte;
    private Date dateCreation;
    private double Solde;
    private Client client;
    private Employe employe;
    private Collection<Operation> operations;

    public String getCodeCompte() {
        return codeCompte;
    }

    public void setCodeCompte(String codeCompte) {
        this.codeCompte = codeCompte;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return Solde;
    }

    public void setSolde(double solde) {
        Solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Collection<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Collection<Operation> operations) {
        this.operations = operations;
    }

    public Compte() {
    }

    public Compte(String codeCompte, Date dateCreation, double solde) {
        this.codeCompte = codeCompte;
        this.dateCreation = dateCreation;
        Solde = solde;
    }
}
