package com.gca.Models.Personne;

import com.gca.Models.Enumeration.Shift;
import com.gca.Models.Pharmacie.LigneMedicament;

public class Collaborateur extends Profil {
    private String departement;
    private String poste;
    private Shift shift;

    // Constructeur
    public Collaborateur(Personne personne, String nomUtilisateur, String motDePasse, String email, String photoProfil, String departement, String poste, Shift shift) {
        super(personne, nomUtilisateur, motDePasse, email, photoProfil);
        this.departement = departement;
        this.poste = poste;
        this.shift = shift;
    }

    // Getters et setters
    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    // Méthode pour consulter un patient
    public void consulterPatient(Patient patient) {
        System.out.println("Consultation avec le patient " + patient.getPersonne().getNom());
        // Logique pour consulter le patient
    }

    // Méthode pour prescrire une ordonnance
    public void prescrireOrdonnance(Patient patient, LigneMedicament medicament) {
        System.out.println("Prescription pour le patient " + patient.getPersonne().getNom());
        // Logique pour prescrire l'ordonnance
    }
}