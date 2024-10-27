package org.example.ateliercouplage.presentation;

import org.example.ateliercouplage.dao.Etudiant;
import org.example.ateliercouplage.dao.EtudiantDAODictionary;
import org.example.ateliercouplage.metier.EtudiantManager;

public class Presentation {
    public static void main(String [] args){
        EtudiantDAODictionary etudiantDAO = new EtudiantDAODictionary();
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);

        Etudiant e1 = new Etudiant(1,"EL MAOUDDA","Hind","hind@gmail.com");
        Etudiant e2 = new Etudiant(2,"BENANI","Karima","karima@gmail.com");
        Etudiant e3 = new Etudiant(3,"NOURIA","Sanae","sanae@gmail.com");
        Etudiant e4 = new Etudiant( 4,"EL MAOUDDA","Meryem","meryem@gmail.com");

        etudiantManager.addEtudiant(e1);
        etudiantManager.addEtudiant(e2);
        etudiantManager.addEtudiant(e3);
        etudiantManager.addEtudiant(e4);

        System.out.println("Avant mise à jour : ");
        for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
            System.out.println(etudiant);
        }

        Etudiant etudiantModifie = new Etudiant(2, "BENANI", "Karima", "karima0100@gmail.com");
        etudiantManager.updateEtudiant(etudiantModifie);

        System.out.println("Après mise à jour : ");
        for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
            System.out.println(etudiant);
        }

    }
}
