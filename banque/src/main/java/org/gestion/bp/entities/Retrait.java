package org.gestion.bp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue(value = "R")
public class Retrait extends Operation {
    public Retrait() {
        super();
    }

    public Retrait(Date dateOperation, double montant) {
        super(dateOperation, montant);
    }
}
