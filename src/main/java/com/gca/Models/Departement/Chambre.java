package com.gca.Models.Departement;

import com.gca.Models.Personne.Personne;

import java.util.List;

public class Chambre {
    private int numero;
    private List<Personne> patients;
    private boolean disponibilite;

    // Constructeur
    public Chambre(int numero, List<Personne> patients, boolean disponibilite) {
        this.numero = numero;
        this.patients = patients;
        this.disponibilite = disponibilite;
    }

    // Getters et setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Personne> getPatients() {
        return patients;
    }

    public void setPatients(List<Personne> patients) {
        this.patients = patients;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    // Méthode pour vérifier si la chambre est disponible
    public boolean estDisponible() {
        return disponibilite;
    }

    // Méthode pour afficher les détails de la chambre
    public void afficherDetailsChambre() {
        System.out.println("Numéro de la chambre: " + numero);
        System.out.println("Disponible: " + (disponibilite ? "Oui" : "Non"));
        System.out.print("Patients: ");
        for (Personne patient : patients) {
            System.out.print(patient.getNom() + " ");
        }
        System.out.println();
    }
}