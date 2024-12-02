package com.gca.Models.Departement;

import com.gca.Models.Personne.Infirmier;
import com.gca.Models.Personne.Medecin;
import com.gca.Models.Personne.Patient;
import com.gca.Models.Personne.Personne;

import java.util.List;

public class DepartementUrgences extends Departement {
    private List<Medecin> medecins;
    private List<Infirmier> infirmiers;
    private List<Lit> lits;

    // Constructeur
    public DepartementUrgences(String nom, Personne responsable,  List<Medecin> medecins, List<Infirmier> infirmiers, List<Lit> lits) {
        super(nom, responsable);
        this.medecins = medecins;
        this.infirmiers = infirmiers;
        this.lits = lits;
    }

    // Getters et setters


    public List<Medecin> getMedecins() {
        return medecins;
    }

    public void setMedecins(List<Medecin> medecins) {
        this.medecins = medecins;
    }

    public List<Infirmier> getInfirmiers() {
        return infirmiers;
    }

    public void setInfirmiers(List<Infirmier> infirmiers) {
        this.infirmiers = infirmiers;
    }

    public List<Lit> getLits() {
        return lits;
    }

    public void setLits(List<Lit> lits) {
        this.lits = lits;
    }

    // Méthode pour transférer un patient vers un autre département
    public void transfererPatientVersDepartement(Patient patient, Departement departement) {
        this.getPatients().remove(patient);
        if (departement instanceof DepartementUrgences) {
            ((DepartementUrgences) departement).ajouterPatient(patient);
        } else {
            System.out.println("Transfert vers un autre type de département non pris en charge.");
        }
    }

    // Méthode pour ajouter un patient
    public void ajouterPatient(Patient patient) {
        this.getPatients().add(patient);
    }

    // Méthode pour accorder un lit à un patient
    public void accorderLit(Patient patient, Lit lit) {
        if (this.lits.contains(lit) && lit.Disponibilite()) {
            lit.setPatient(patient);
            patient.setLit(lit);
            System.out.println("Lit accordé à " + patient.getPersonne().getNom());
        } else {
            System.out.println("Le lit n'est pas disponible.");
        }
    }
}