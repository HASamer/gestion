package com.gca.Models.Departement;

import com.gca.Models.Personne.Patient;

public class Lit {
    private String code;
    private String type;
    private boolean disponible;
    private Patient patient;

    // Constructeur
    public Lit(String code, String type, boolean disponible, Patient patient) {
        this.code = code;
        this.type = type;
        this.disponible = disponible;
        this.patient = patient;
    }

    // Getters et setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    // Méthode pour modifier l'état de disponibilité du lit
    public void modifierEtat(boolean etat) {
        this.disponible = etat;
    }

    // Méthode pour vérifier la disponibilité du lit
    public boolean Disponibilite() {
        return this.disponible;
    }

    // Méthode pour afficher les détails du lit
    public void afficherDetailsLit() {
        System.out.println("Code: " + code);
        System.out.println("Type: " + type);
        System.out.println("Disponible: " + (disponible ? "Oui" : "Non"));
        if (patient != null) {
            System.out.println("Patient: " + patient.getPersonne().getNom());
        } else {
            System.out.println("Patient: Aucun");
        }
    }
}