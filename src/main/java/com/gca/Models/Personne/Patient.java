package com.gca.Models.Personne;

import com.gca.Models.Departement.Lit;
import com.gca.Models.Enumeration.StatusFacture;
import com.gca.Models.Facture.Facture;
import com.gca.Models.RendezVous.RendezVous;

import java.util.List;

public class Patient extends Profil {
    private List<RendezVous> rendezVous;
    private List<Facture> factures;
    private  Lit lit;

    // Constructeur
    public Patient(Personne personne, String nomUtilisateur, String motDePasse, String email, String photoProfil, List<RendezVous> rendezVous, List<Facture> factures) {
        super(personne, nomUtilisateur, motDePasse, email, photoProfil);
        this.rendezVous = rendezVous;
        this.factures = factures;
    }

    // Getters et setters
    public List<RendezVous> getRendezVous() {
        return rendezVous;
    }

    public void setRendezVous(List<RendezVous> rendezVous) {
        this.rendezVous = rendezVous;
    }

    public List<Facture> getFactures() {
        return factures;
    }

    public void setFactures(List<Facture> factures) {
        this.factures = factures;
    }

    public Lit getLit(Lit lit) {
        return lit;
    }
    public void setLit(Lit lit) {
        this.lit=lit;
    }

    // Méthode pour vérifier les factures impayées
    public boolean facturesImpayees() {
        for (Facture facture : factures) {
            if (facture.getStatut()== StatusFacture.OUVERT) {
                return true;
            }
        }
        return false;
    }

    // Méthode pour afficher les informations du patient
    public void afficherPatient() {
        afficherProfil(); // Appel de la méthode pour afficher les informations du profil
        System.out.println("Rendez-vous: " + rendezVous);
        System.out.println("Factures: " + factures);
    }


}