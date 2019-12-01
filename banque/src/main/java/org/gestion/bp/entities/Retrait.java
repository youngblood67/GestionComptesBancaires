package org.gestion.bp.entities;

import java.util.Date;

public class Retrait extends Operation {
    public Retrait() {
        super();
    }

    public Retrait(Date dateOperation, double montant) {
        super(dateOperation, montant);
    }
}
