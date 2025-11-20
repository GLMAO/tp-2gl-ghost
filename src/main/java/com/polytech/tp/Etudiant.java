package com.polytech.tp;

public class Etudiant {
    private String nom;

    public Etudiant(String nom) {
        this.nom = nom;
    }

    
    public void update(String message) {
        System.out.println("Notification pour l'étudiant " + nom + " : " + message);
    }
}