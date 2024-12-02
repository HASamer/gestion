package com.gca.Models.Personne;

import com.gca.Models.Enumeration.Shift;
import com.gca.Models.Enumeration.Specialite;

public class Medecin extends Collaborateur {
    private Specialite specialite;

    // Constructeur
    public Medecin(Personne personne, String nomUtilisateur, String motDePasse, String email, String photoProfil, String departement, String poste, Shift shift, Specialite specialite) {
        super(personne, nomUtilisateur, motDePasse, email, photoProfil, departement, poste, shift);
        this.specialite = specialite;
    }

    // Getters et setters
    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    // Méthode pour vérifier si le médecin est un chirurgien
    public boolean estChirurgien() {
        return specialite == Specialite.CHIRURGIE_GENERALE || specialite == Specialite.CHIRURGIE_ORTHOPEDIQUE || specialite == Specialite.CHIRURGIE_CARDIAQUE || specialite == Specialite.NEUROCHIRURGIE;
    }

    // Méthode pour afficher les détails du médecin
    public void afficherDetailsMedecin() {
        System.out.println("Nom: " + getPersonne().getNom());
        System.out.println("Département: " + getDepartement());
        System.out.println("Poste: " + getPoste());
        System.out.println("Spécialité: " + specialite);
        System.out.println("Chirurgien: " + (estChirurgien() ? "Oui" : "Non"));
    }
}