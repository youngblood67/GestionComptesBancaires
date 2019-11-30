package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Collection;

public class Client implements Serializable {
    private Long codeClient;
    private String nomClient;
    private String adresseClient;
    Collection<Compte> comptes;

    public Long getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Long codeClient) {
        this.codeClient = codeClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public Collection<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }

    public Client() {
    }

    public Client(String nomClient, String adresseClient) {
        this.nomClient = nomClient;
        this.adresseClient = adresseClient;
    }
}
