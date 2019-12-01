package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Collection;

public class Groupe implements Serializable {
    private Long codeGroupe;
    private String nomGroupe;
    private Collection<Employe> employes;

    public Long getCodeGroupe() {
        return codeGroupe;
    }

    public void setCodeGroupe(Long codeGroupe) {
        this.codeGroupe = codeGroupe;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public Groupe() {
    }

    public Groupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }
}
