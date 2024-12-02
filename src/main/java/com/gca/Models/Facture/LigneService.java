package com.gca.Models.Facture;

import java.util.Date;

public class LigneService {
    private String nom;
    private String type;
    private String note;
    private Date date;
    private Float prix;

    // Constructeur
    public LigneService(String nom, String type, String note, Date date, Float prix) {
        this.nom = nom;
        this.type = type;
        this.note = note;
        this.date = date;
        this.prix = prix;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getPrix() {
        return prix;
    }

    public void setDate(Float prix) {
        this.prix = prix;
    }

    // Méthode pour afficher les détails du service
    public String afficherDetails() {
        return "Nom: " + nom + ", Type: " + type + ", Note: " + note + ", Date: " + date;
    }
}