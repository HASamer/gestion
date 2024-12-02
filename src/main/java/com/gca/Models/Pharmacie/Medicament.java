
package com.gca.Models.Pharmacie;
public class Medicament {
    private int id;
    private String nom;
    private int quantiteStock;
    private double prix;

    // Constructeur
    public Medicament(int id, String nom, int quantiteStock, double prix) {
        this.id = id;
        this.nom = nom;
        this.quantiteStock = quantiteStock;
        this.prix = prix;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // Méthode pour vérifier si le médicament est en stock
    public boolean estEnStock() {
        return quantiteStock > 0;
    }

    // Méthode pour afficher les détails du médicament
    public String afficherDetails() {
        return "ID: " + id + ", Nom: " + nom + ", Quantité en stock: " + quantiteStock + ", Prix: " + prix + ", En stock: " + estEnStock();
    }
}