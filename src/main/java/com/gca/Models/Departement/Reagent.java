package com.gca.Models.Departement;

public class Reagent {
    private int id;
    private String nom;
    private float stock;

    // Constructeur
    public Reagent(int id, String nom, float stock) {
        this.id = id;
        this.nom = nom;
        this.stock = stock;
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

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    // Méthode pour vérifier si le réactif est en stock
    public boolean estEnStock(String nomReactif) {
        return this.nom.equals(nomReactif) && this.stock > 0;
    }

    // Méthode pour ajouter au stock
    public void ajouterAuStock(float quantite) {
        if (quantite > 0) {
            this.stock += quantite;
            System.out.println("Ajouté " + quantite + " au stock. Nouveau stock: " + this.stock);
        } else {
            System.out.println("Quantité invalide.");
        }
    }

    // Méthode pour consommer du stock
    public void consommer(float quantite) {
        if (quantite > 0 && this.stock >= quantite) {
            this.stock -= quantite;
            System.out.println("Consommé " + quantite + " du stock. Nouveau stock: " + this.stock);
        } else {
            System.out.println("Quantité invalide ou stock insuffisant.");
        }
    }
}