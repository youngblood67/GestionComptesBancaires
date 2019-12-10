package org.gestion.bp.metier;

import org.gestion.bp.entities.Client;
import org.gestion.bp.entities.Compte;
import org.gestion.bp.entities.Employe;
import org.gestion.bp.entities.Groupe;
import org.gestion.bp.entities.Operation;

import java.util.List;

public interface IBanqueMetier {
    public Client addClient(Client c);

    public Employe addEmployeSup(Employe e, Long codeSup);

    public Groupe addGroupe(Groupe g);

    public void addEmployeToGroupe(Long codeEmp, Long codeGr);

    public Compte addCompte(Compte cp, Long codeCli, Long codeEmp);

    /////
    public void verser(double mt, String cpte, Long codeEmp);

    public void retirer(double mt, String cpte, Long codeEmp);

    public void virement(double mt, String cpte1, String cpte2, Long codeEmp);
    /////

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
