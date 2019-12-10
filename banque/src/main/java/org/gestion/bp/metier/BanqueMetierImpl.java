package org.gestion.bp.metier;

import org.gestion.bp.entities.Client;
import org.gestion.bp.entities.Compte;
import org.gestion.bp.entities.Employe;
import org.gestion.bp.entities.Groupe;
import org.gestion.bp.entities.Operation;

import java.util.List;

public class BanqueMetierImpl implements IBanqueMetier {
    @Override
    public Client addClient(Client c) {
        return null;
    }

    @Override
    public Employe addEmployeSup(Employe e, Long codeSup) {
        return null;
    }

    @Override
    public Groupe addGroupe(Groupe g) {
        return null;
    }

    @Override
    public void addEmployeToGroupe(Long codeEmp, Long codeGr) {

    }

    @Override
    public Compte addCompte(Compte cp, Long codeCli, Long codeEmp) {
        return null;
    }

    @Override
    public void verser(double mt, String cpte, Long codeEmp) {

    }

    @Override
    public void retirer(double mt, String cpte, Long codeEmp) {

    }

    @Override
    public void virement(double mt, String cpte1, String cpte2, Long codeEmp) {

    }

    @Override
    public Compte consulterCompte(String codeCpte) {
        return null;
    }

    @Override
    public List<Operation> consulterOperations(String codeCpte) {
        return null;
    }

    @Override
    public Client consulterClient(Long codeCli) {
        return null;
    }

    @Override
    public List<Client> consulterClients(String mc) {
        return null;
    }

    @Override
    public List<Compte> getComptesByClient(Long codeCli) {
        return null;
    }

    @Override
    public List<Compte> getComptesByEmploye(Long codeEmp) {
        return null;
    }

    @Override
    public List<Employe> getEmployes() {
        return null;
    }

    @Override
    public List<Employe> getGroupes() {
        return null;
    }

    @Override
    public List<Employe> getEmployesByGroupe(Long codeGr) {
        return null;
    }
}
