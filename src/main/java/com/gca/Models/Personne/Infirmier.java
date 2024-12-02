package com.gca.Models.Personne;

import com.gca.Models.Enumeration.Shift;

public class Infirmier extends Collaborateur {
    private Patient patient;

    // Constructeur
    public Infirmier(Personne personne, String nomUtilisateur, String motDePasse, String email, String photoProfil, String departement, String poste, Shift shift, Patient patient) {
        super(personne, nomUtilisateur, motDePasse, email, photoProfil, departement, poste, shift);
        this.patient = patient;
    }

    // Getters et setters
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    // Méthode pour afficher les détails de l'infirmier
    public void afficherDetailsInfirmier() {
        System.out.println("Nom: " + getPersonne().getNom());
        System.out.println("Département: " + getDepartement());
        System.out.println("Poste: " + getPoste());
        System.out.println("Patient: " + patient.getPersonne().getNom());
    }
}