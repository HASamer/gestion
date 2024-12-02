package com.gca.Models.Personne;

import java.util.Date;

public class Personne {
    private int id;
    private Date dateNaissance;
    private String adresse;
    private String nom;
    private String telephone;

    // Constructeur
    public Personne(int id, Date dateNaissance, String adresse, String nom, String telephone) {
        this.id = id;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.nom = nom;
        this.telephone = telephone;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    // afficher les informations de la personne
    public void afficherInformations() {
        System.out.println("ID: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Date de naissance: " + dateNaissance);
        System.out.println("Adresse: " + adresse);
        System.out.println("Téléphone: " + telephone);
    }
}