package com.gca.Models.RendezVous;

import com.gca.Models.Enumeration.Status;
import com.gca.Models.Personne.Medecin;
import com.gca.Models.Personne.Patient;

import java.util.Date;
import java.sql.Time;

public class RendezVous {
    private int idRdv;
    private Patient patient;
    private Medecin medecin;
    private Date dateRdv;
    private Time heureRdv;
    private Status status;

    // Constructeur
    public RendezVous(int idRdv, Patient patient, Medecin medecin, Date dateRdv, Time heureRdv, Status status) {
        this.idRdv = idRdv;
        this.patient = patient;
        this.medecin = medecin;
        this.dateRdv = dateRdv;
        this.heureRdv = heureRdv;
        this.status = status;
    }

    // Getters et setters
    public int getIdRdv() {
        return idRdv;
    }

    public void setIdRdv(int idRdv) {
        this.idRdv = idRdv;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Date getDateRdv() {
        return dateRdv;
    }

    public void setDateRdv(Date dateRdv) {
        this.dateRdv = dateRdv;
    }

    public Time getHeureRdv() {
        return heureRdv;
    }

    public void setHeureRdv(Time heureRdv) {
        this.heureRdv = heureRdv;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Méthode pour afficher les détails du rendez-vous
    public void afficherDetailsRdv() {
        System.out.println("ID Rendez-vous: " + idRdv);
        System.out.println("Patient: " + patient.getPersonne().getNom());
        System.out.println("Médecin: " + medecin.getPersonne().getNom());
        System.out.println("Date: " + dateRdv);
        System.out.println("Heure: " + heureRdv);
        System.out.println("Statut: " + status);
    }

    // Méthode pour ajouter un rendez-vous
    public void ajouterRendezVous() {
        // Logique pour ajouter un rendez-vous
        System.out.println("Rendez-vous ajouté avec succès.");
    }

    // Méthode pour confirmer un rendez-vous
    public void confirmerRendezVous() {
        this.status = Status.CONFIRMED;
        System.out.println("Rendez-vous confirmé.");
    }

    // Méthode pour annuler un rendez-vous
    public void annulerRendezVous() {
        this.status = Status.MISSED;
        System.out.println("Rendez-vous annulé.");
    }
}