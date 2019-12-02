package org.gestion.bp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue(value = "CE")
public class CompteEpargne extends Compte {
    private double taux;

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public CompteEpargne() {
        super();
    }

    public CompteEpargne(String codeCompte, Date dateCreation, double solde, double taux) {
        super(codeCompte, dateCreation, solde);
        this.taux = taux;
    }

}
