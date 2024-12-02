package com.gca.Models.Personne;

import com.gca.Models.Enumeration.Shift;
import com.gca.Models.Pharmacie.Pharmacie;

public class Pharmacien extends Collaborateur {

    // Constructeur
    public Pharmacien(Personne personne, String nomUtilisateur, String motDePasse, String email, String photoProfil, String departement, String poste, Shift shift) {
        super(personne, nomUtilisateur, motDePasse, email, photoProfil, departement, poste, shift);
    }

    // Méthode pour vérifier le stock de médicaments
    public void verifierStockMedicament(Pharmacie pharmacie, String nomMedicament) {
        int quantite = pharmacie.verifierStock(nomMedicament);
        if (quantite > 0) {
            System.out.println("Le médicament " + nomMedicament + " est en stock avec une quantité de " + quantite + ".");
        } else {
            System.out.println("Le médicament " + nomMedicament + " n'est pas en stock.");
        }
    }
}