package com.gca.Models.Departement;

import com.gca.Models.Enumeration.EtatOperation;
import com.gca.Models.Enumeration.TypeOperation;
import com.gca.Models.Personne.Medecin;
import com.gca.Models.Personne.Personne;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Operation {
    private Medecin chefOperation;
    private List<Personne> staffMedicale;
    private TypeOperation type;
    private Date dateOp;
    private EtatOperation etatOp;

    // Constructeur
    public Operation(Medecin chefOperation, TypeOperation type, Date dateOp) {
        this.chefOperation = chefOperation;
        this.staffMedicale = new ArrayList<>();
        this.type = type;
        this.dateOp = dateOp;
        this.etatOp = EtatOperation.EN_ATTENTE; // Initialisation de l'état
    }

    // Getters et setters
    public Medecin getChefOperation() {
        return chefOperation;
    }

    public void setChefOperation(Medecin chefOperation) {
        this.chefOperation = chefOperation;
    }

    public List<Personne> getStaffMedicale() {
        return staffMedicale;
    }

    public void setStaffMedicale(List<Personne> staffMedicale) {
        this.staffMedicale = staffMedicale;
    }

    public TypeOperation getType() {
        return type;
    }

    public void setType(TypeOperation type) {
        this.type = type;
    }

    public Date getDateOp() {
        return dateOp;
    }

    public void setDateOp(Date dateOp) {
        this.dateOp = dateOp;
    }

    public EtatOperation getEtatOp() {
        return etatOp;
    }

    public void setEtatOp(EtatOperation etatOp) {
        this.etatOp = etatOp;
    }

    // Méthode pour démarrer l'opération
    public void demarrerOperation() {
        if (etatOp == EtatOperation.EN_ATTENTE) {
            this.etatOp = EtatOperation.EN_COURS;
            System.out.println("L'opération a commencé.");
        } else {
            System.out.println("L'opération ne peut pas être démarrée dans l'état actuel.");
        }
    }

    // Méthode pour terminer l'opération
    public void terminerOperation() {
        if (etatOp == EtatOperation.EN_COURS) {
            this.etatOp = EtatOperation.TERMINE;
            System.out.println("L'opération est terminée.");
        } else {
            System.out.println("L'opération ne peut pas être terminée dans l'état actuel.");
        }
    }

    // Méthode pour annuler l'opération
    public void annulerOperation() {
        if (etatOp == EtatOperation.EN_ATTENTE || etatOp == EtatOperation.EN_COURS) {
            this.etatOp = EtatOperation.ANNULE;
            System.out.println("L'opération a été annulée.");
        } else {
            System.out.println("L'opération ne peut pas être annulée dans l'état actuel.");
        }
    }

    // Méthode pour afficher les membres du staff
    public void afficherMembresStaff() {
        System.out.println("Chef d'opération: " + chefOperation.getPersonne().getNom());
        System.out.println("Staff médical:");
        for (Personne personne : staffMedicale) {
            System.out.println(" - " + personne.getNom());
        }
    }

    // Méthode pour ajouter un membre au staff
    public void ajouterMembreStaff(Personne personne) {
        this.staffMedicale.add(personne);
        System.out.println(personne.getNom() + " a été ajouté au staff médical.");
    }

    // Méthode pour retirer un membre du staff
    public void retirerMembreStaff(Personne personne) {
        if (this.staffMedicale.remove(personne)) {
            System.out.println(personne.getNom() + " a été retiré du staff médical.");
        } else {
            System.out.println(personne.getNom() + " n'est pas trouvé dans le staff médical.");
        }
    }
}