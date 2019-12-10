package org.gestion.bp.dao;

import org.gestion.bp.entities.Client;
import org.gestion.bp.entities.Compte;
import org.gestion.bp.entities.Employe;
import org.gestion.bp.entities.Groupe;
import org.gestion.bp.entities.Operation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class BanqueDaoImpl implements IBanqueDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Client addClient(Client c) {
        em.persist(c);
        return c;
    }

    @Override
    public Employe addEmployeSup(Employe e, Long codeSup) {
        if (codeSup != null) {
            Employe sup = em.find(Employe.class, codeSup);
            e.setEmployeSup(sup);
        }
        em.persist(e);
        return e;

    }

    @Override
    public Groupe addGroupe(Groupe g) {
        em.persist(g);
        return g;
    }

    @Override
    public void addEmployeToGroupe(Long codeEmp, Long codeGr) {
        if (codeEmp != null && codeGr != null) {
            Groupe groupe = em.find(Groupe.class, codeGr);
            Employe employe = em.find(Employe.class, codeEmp);
            employe.getGroupes().add(groupe);
            groupe.getEmployes().add(employe);
        }
    }

    @Override
    public Compte addCompte(Compte cp, Long codeCli, Long codeEmp) {
        Client client = em.find(Client.class, codeCli);
        Employe employe = em.find(Employe.class, codeEmp);
        cp.setClient(client);
        cp.setEmploye(employe);
        em.persist(cp);
        return cp;
    }

    @Override
    public Operation addOperation(Operation op, String codeCpte, String codeEmp) {
        Compte compte = em.find(Compte.class, codeCpte);
        Employe employe = em.find(Employe.class, codeEmp);
        op.setCompte(compte);
        op.setEmploye(employe);
        em.persist(op);
        return op;
    }

    @Override
    public Compte consulterCompte(String codeCpte) {
        Compte compte = em.find(Compte.class, codeCpte);
        if (compte == null) throw new RuntimeException("Compte introuvable!");
        return compte;
    }

    @Override
    public List<Operation> consulterOperations(String codeCpte) {
        Query query = em.createQuery("select o from Operation o where o.compte.codeCompte=:x ");
        query.setParameter("x", codeCpte);
        return query.getResultList();
    }

    @Override
    public Client consulterClient(Long codeCli) {
        Client client = em.find(Client.class, codeCli);
        if (client == null) throw new RuntimeException("Client introuvable!");
        return client;
    }

    @Override
    public List<Client> consulterClients(String mc) {
        Query query = em.createQuery(" select c from Client c where c.nomClient like :x ");
        query.setParameter("x", "%" + mc + "%");
        return query.getResultList();
    }

    @Override
    public List<Compte> getComptesByClient(Long codeCli) {
        Query query = em.createQuery("select c from Compte c where c.client.codeClient like :x");
        query.setParameter("x", codeCli);
        return query.getResultList();
    }

    @Override
    public List<Compte> getComptesByEmploye(Long codeEmp) {
        Query query = em.createQuery("select c from Compte c where c.employe.codeEmploye like :x");
        query.setParameter("x", codeEmp);
        return query.getResultList();
    }

    @Override
    public List<Employe> getEmployes() {
        Query query = em.createQuery("select e from Employe e");
        return query.getResultList();
    }

    @Override
    public List<Employe> getGroupes() {
        Query query = em.createQuery("select g from Groupe g");
        return query.getResultList();
    }

    @Override
    public List<Employe> getEmployesByGroupe(Long codeGr) {
        Query query = em.createQuery("select e from Employe e where e.groupe.codeGroupe like :x");
        query.setParameter("x", codeGr);
        return query.getResultList();
    }
}
