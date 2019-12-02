package org.gestion.bp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue(value = "V")
public class Versement extends Operation {

    public Versement() {
        super();
    }

    public Versement(Date dateOperation, double montant) {
        super(dateOperation, montant);
    }
}
