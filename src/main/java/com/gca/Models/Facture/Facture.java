package com.gca.Models.Facture;

import com.gca.Models.Enumeration.StatusFacture;
import com.gca.Models.Personne.Patient;
import com.gca.Models.Pharmacie.LigneMedicament;

import java.time.LocalDate;
import java.util.List;

public class Facture {
    private int idFacture;
    private LocalDate dateEmission;
    private double montantTotal;
    private double montantPaye;
    private Patient patient;
    private StatusFacture statut;
    private List<LigneMedicament> medicaments;
    private List<LigneService> services;

    // Constructeur
    public Facture(int idFacture, LocalDate dateEmission, double montantTotal, double montantPaye, Patient patient, StatusFacture statut , List<LigneMedicament> medicaments, List<LigneService> services) {
        this.idFacture = idFacture;
        this.dateEmission = dateEmission;
        this.montantTotal = calculerMontantTotal(medicaments, services);
        this.montantPaye = montantPaye;
        this.patient = patient;
        this.medicaments = medicaments;
        this.services = services;
        this.statut = statut;
    }

    // Getters et setters
    public int getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(int idFacture) {
        this.idFacture = idFacture;
    }

    public LocalDate getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(LocalDate dateEmission) {
        this.dateEmission = dateEmission;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public double getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(double montantPaye) {
        this.montantPaye = montantPaye;
    }

    public Patient getPatient() {
        return patient;
    }

    public StatusFacture getStatut() {
        return statut;
    }
    public void setStatut(StatusFacture statut) {
        this.statut = statut;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<LigneMedicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(List<LigneMedicament> medicaments) {
        this.medicaments = medicaments;
    }

    public List<LigneService> getServices() {
        return services;
    }

    public void setServices(List<LigneService> services) {
        this.services = services;
    }

    // Méthode pour calculer le montant total
    private double calculerMontantTotal(List<LigneMedicament> medicaments, List<LigneService> services) {
        double total = 0.0;
        for (LigneMedicament medicament : medicaments) {
            total += medicament.getPrix();
        }
        for (LigneService service : services) {
            total += service.getPrix();
        }
        return total;
    }

    // Méthode pour afficher les détails de la facture
    public String afficherDetailFact() {
        StringBuilder details = new StringBuilder();
        details.append("ID Facture: ").append(idFacture).append("\n");
        details.append("Date d'émission: ").append(dateEmission).append("\n");
        details.append("Montant total: ").append(montantTotal).append("\n");
        details.append("Montant payé: ").append(montantPaye).append("\n");
        details.append("Patient: ").append(patient.getPersonne().getNom()).append("\n");
        details.append("Médicaments: ").append(medicaments).append("\n");
        details.append("Services: ").append(services).append("\n");
        return details.toString();
    }
}