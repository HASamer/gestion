package com.gca.Models.Departement;

import com.gca.Models.Personne.Personne;

import java.util.LinkedList;
import java.util.List;

public class DepartementChirugie extends Departement {
    private LinkedList<Operation> operations;
    private List<Chambre> chambres;

    // Constructeur
    public DepartementChirugie(String nom, Personne responsable, LinkedList<Operation> operations, List<Chambre> chambres) {
        super(nom, responsable);
        this.operations = operations;
        this.chambres = chambres;
    }

    // Getters et setters
    public LinkedList<Operation> getOperations() {
        return operations;
    }

    public void setOperations(LinkedList<Operation> operations) {
        this.operations = operations;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    // Méthode pour planifier une opération
    public void planifierOperation(Operation operation) {
        operations.add(operation);
        System.out.println("Opération planifiée : " + operation.getType() + " le " + operation.getDateOp());
    }

    // Méthode pour générer un bilan des opérations
    public void genererBilan() {
        System.out.println("Bilan des opérations :");
        for (Operation operation : operations) {
            System.out.println("Opération : " + operation.getType() + ", Date : " + operation.getDateOp() + ", État : " + operation.getEtatOp());
        }
        System.out.println("Nombre de chambres disponibles : " + getNombreChambresDisponibles());
    }

    // Méthode pour calculer le nombre de chambres disponibles
    private int getNombreChambresDisponibles() {
        int count = 0;
        for (Chambre chambre : chambres) {
            if (chambre.estDisponible()) {
                count++;
            }
        }
        return count;
    }

    // Méthode pour afficher les informations du département
    @Override
    public void afficherDepartement() {
        super.afficherDepartement();
        System.out.println("Nombre d'opérations : " + operations.size());
        System.out.println("Nombre de chambres : " + chambres.size());
    }
}