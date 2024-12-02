package com.gca.Models.Pharmacie;

import com.gca.Models.Facture.Facture;
import com.gca.Models.Personne.Pharmacien;

import java.util.List;
import java.util.Map;

public class Pharmacie {
    private List<Medicament> medicaments;
    private List<Pharmacien> pharmaciens;
    private Map<String, Integer> stockMinimaux;
    private List<Facture> historiqueVentes;

    // Constructeur
    public Pharmacie(List<Medicament> medicaments, List<Pharmacien> pharmaciens, Map<String, Integer> stockMinimaux, List<Facture> historiqueVentes) {
        this.medicaments = medicaments;
        this.pharmaciens = pharmaciens;
        this.stockMinimaux = stockMinimaux;
        this.historiqueVentes = historiqueVentes;
    }

    // Getters et setters
    public List<Medicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(List<Medicament> medicaments) {
        this.medicaments = medicaments;
    }

    public List<Pharmacien> getPharmaciens() {
        return pharmaciens;
    }

    public void setPharmaciens(List<Pharmacien> pharmaciens) {
        this.pharmaciens = pharmaciens;
    }

    public Map<String, Integer> getStockMinimaux() {
        return stockMinimaux;
    }

    public void setStockMinimaux(Map<String, Integer> stockMinimaux) {
        this.stockMinimaux = stockMinimaux;
    }

    public List<Facture> getHistoriqueVentes() {
        return historiqueVentes;
    }

    public void setHistoriqueVentes(List<Facture> historiqueVentes) {
        this.historiqueVentes = historiqueVentes;
    }

    // Méthode pour ajouter un médicament
    public void ajouterMedicament(Medicament medicament) {
        this.medicaments.add(medicament);
        System.out.println("Médicament ajouté : " + medicament.getNom());
    }

    // Méthode pour retirer un médicament
    public boolean retirerMedicament(Medicament medicament) {
        boolean removed = this.medicaments.remove(medicament);
        if (removed) {
            System.out.println("Médicament retiré : " + medicament.getNom());
        } else {
            System.out.println("Médicament non trouvé : " + medicament.getNom());
        }
        return removed;
    }

    // Méthode pour vérifier le stock
    public int verifierStock(String nom) {
        for (Medicament medicament : medicaments) {
            if (medicament.getNom().equals(nom)) {
                return medicament.getQuantiteStock();
            }
        }
        System.out.println("Médicament non trouvé : " + nom);
        return 0;
    }

    // Méthode pour générer un rapport des ventes
    public String genererRapportVentes() {
        StringBuilder rapport = new StringBuilder();
        rapport.append("Rapport des ventes :\n");
        for (Facture facture : historiqueVentes) {
            rapport.append("ID Facture : ").append(facture.getIdFacture()).append(", Montant Total : ").append(facture.getMontantTotal()).append("\n");
        }
        return rapport.toString();
    }

    // Méthode pour calculer une facture
    public double calculerFacture(Facture facture) {
        double montantTotal = facture.getMontantTotal();
        System.out.println("Montant total de la facture ID " + facture.getIdFacture() + " : " + montantTotal);
        return montantTotal;
    }

    // Méthode pour afficher les détails de la pharmacie
    public void afficherDetailsPharmacie() {
        System.out.println("Liste des médicaments :");
        for (Medicament medicament : medicaments) {
            System.out.println(" - " + medicament.getNom() + " : " + medicament.getQuantiteStock() + " en stock");
        }
        System.out.println("Liste des pharmaciens :");
        for (Pharmacien pharmacien : pharmaciens) {
            System.out.println(" - " + pharmacien.getPersonne().getNom());
        }
    }
}