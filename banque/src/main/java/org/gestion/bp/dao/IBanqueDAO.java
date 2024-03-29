package org.gestion.bp.dao;

import org.gestion.bp.entities.Client;
import org.gestion.bp.entities.Compte;
import org.gestion.bp.entities.Employe;
import org.gestion.bp.entities.Groupe;
import org.gestion.bp.entities.Operation;

import java.util.List;

public interface IBanqueDAO {
    public Client addClient(Client c);

    public Employe addEmployeSup(Employe e, Long codeSup);

    public Groupe addGroupe(Groupe g);

    public void addEmployeToGroupe(Long codeEmp, Long codeGr);

    public Compte addCompte(Compte cp, Long codeCli, Long codeEmp);

    public Operation addOperation(Operation op, String codeCpte, String codeEmp);

    public Compte consulterCompte(String codeCpte);

    public List<Operation> consulterOperations(String codeCpte);

    public Client consulterClient(Long codeCli);

    public List<Client> consulterClients(String mc);

    public List<Compte> getComptesByClient(Long codeCli);

    public List<Compte> getComptesByEmploye(Long codeEmp);

    public List<Employe> getEmployes();

    public List<Employe> getGroupes();

    public List<Employe> getEmployesByGroupe(Long codeGr);
}
