package com.gca.Models.Pharmacie;

import java.util.Date;

public class LigneMedicament {
    private Medicament medicament;
    private int quantite;
    private double prix;
    private String note;
    private Date dateUtilisation;

    // Constructeur
    public LigneMedicament(Medicament medicament, int quantite, double prix, String note, Date dateUtilisation) {
        this.medicament = medicament;
        this.quantite = quantite;
        this.prix = prix;
        this.note = note;
        this.dateUtilisation = dateUtilisation;
    }

    // Getters et setters
    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDateUtilisation() {
        return dateUtilisation;
    }

    public void setDateUtilisation(Date dateUtilisation) {
        this.dateUtilisation = dateUtilisation;
    }

    // Méthode pour afficher les détails du médicament
    public String afficherDetails() {
        return "Médicament: " + medicament.getNom() + ", Quantité: " + quantite + ", Prix: " + prix + ", Note: " + note + ", Date d'utilisation: " + dateUtilisation;
    }
}