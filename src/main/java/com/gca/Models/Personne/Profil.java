package com.gca.Models.Personne;

public class Profil {
    private Personne personne;
    private String nomUtilisateur;
    private String motDePasse;
    private String email;
    private String photoProfil;

    // Constructeur
    public Profil(Personne personne, String nomUtilisateur, String motDePasse, String email, String photoProfil) {
        this.personne = personne;
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
        this.email = email;
        this.photoProfil = photoProfil;
    }

    // Getters et setters
    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoProfil() {
        return photoProfil;
    }

    public void setPhotoProfil(String photoProfil) {
        this.photoProfil = photoProfil;
    }

    // afficher les informations du profil
    public void afficherProfil() {
        System.out.println("Nom d'utilisateur: " + nomUtilisateur);
        System.out.println("Email: " + email);
        System.out.println("Photo de profil: " + photoProfil);
        personne.afficherInformations();
    }
}