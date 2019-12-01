package org.gestion.bp.entities;

import java.util.Date;

public class Versement extends Operation {

    public Versement() {
        super();
    }

    public Versement(Date dateOperation, double montant) {
        super(dateOperation, montant);
    }
}
