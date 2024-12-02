package com.gca.Models.Departement;

import com.gca.Models.Personne.Patient;
import com.gca.Models.Personne.Personne;

import java.util.ArrayList;
import java.util.List;

public class Departement {
    private String nom;
    private Personne responsable;
    private List<Patient> patients;
    // Constructeur
    public Departement(String nom, Personne responsable) {
        this.nom = nom;
        this.responsable = responsable;
        this.patients = new ArrayList<>();
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Personne getResponsable() {
        return responsable;
    }

    public void setResponsable(Personne responsable) {
        this.responsable = responsable;
    }
    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    // Méthode pour afficher les informations du département
    public void afficherDepartement() {
        System.out.println("Nom du département: " + nom);
        System.out.println("Responsable: ");
        responsable.afficherInformations();
    }
}