package com.gca.Models.Departement;

import com.gca.Models.Personne.Personne;

import java.util.List;

public class DepartementLaboratoire extends Departement {
    private List<Test> tests;

    // Constructeur
    public DepartementLaboratoire(String nom, Personne responsable, List<Test> tests) {
        super(nom, responsable);
        this.tests = tests;
    }

    // Getters et setters
    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

    // Méthode pour générer un rapport des résultats des tests
    public void genererRapportResultats() {
        System.out.println("Génération du rapport de résultats des tests...");
        for (Test test : tests) {
            System.out.println("Test ID: " + test.getId());
            System.out.println("Nom: " + test.getNom());
            System.out.println("Date: " + test.getDate());
            System.out.println("Résultat: " + test.getResultat());
            System.out.println("------------------------");
        }
    }

    // Méthode pour effectuer un test
    public void effectuerTest(Test test) {
        System.out.println("Effectuer le test: " + test.getNom());
        tests.add(test);
        System.out.println("Test ajouté à la liste des tests du département.");
    }

    // Méthode pour afficher les informations du département
    @Override
    public void afficherDepartement() {
        super.afficherDepartement();
        System.out.println("Nombre de tests: " + tests.size());
    }
}