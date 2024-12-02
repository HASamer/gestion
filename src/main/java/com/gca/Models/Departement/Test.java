package com.gca.Models.Departement;

import java.util.Date;
import java.util.Map;

public class Test {
    private int id;
    private String nom;
    private Date date;
    private Map<Integer, Float> reagents; // Clé: ID du réactif, Valeur: Quantité
    private String resultat;

    // Constructeur
    public Test(int id, String nom, Date date, Map<Integer, Float> reagents, String resultat) {
        this.id = id;
        this.nom = nom;
        this.date = date;
        this.reagents = reagents;
        this.resultat = resultat;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<Integer, Float> getReagents() {
        return reagents;
    }

    public void setReagents(Map<Integer, Float> reagents) {
        this.reagents = reagents;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    // Méthode pour vérifier si le test est positif
    public boolean estPositif() {
        return "positif".equalsIgnoreCase(resultat);
    }

    // Méthode pour annuler le test
    public void annulerTest() {
        this.resultat = "annulé";
        System.out.println("Le test a été annulé.");
    }

    // Méthode pour afficher les détails du test
    public void afficherDetailsTest() {
        System.out.println("ID: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Date: " + date);
        System.out.println("Réactifs: " + reagents);
        System.out.println("Résultat: " + resultat);
    }
}