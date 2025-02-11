package tn.esprit.test;

import tn.esprit.models.Utilisateur;
import tn.esprit.services.ServiceUtilisateur;

public class Main {
    public static void main(String[] args) {
        ServiceUtilisateur su = new ServiceUtilisateur();

        // Ajouter un utilisateur
        /*
        su.add(new Utilisateur("Ali", "Ben Salah", "ali@gmail.com", "pass123", "avatar1.png", 5, "Utilisateur"));
        su.add(new Utilisateur("Admin", "Super", "admin@gmail.com", "adminpass", "avatar2.png", 10, "Admin"));
        */
/*
        //  Afficher les utilisateurs
        System.out.println("📌 Liste des utilisateurs :");
        System.out.println(su.getAll());
        */

        //  Mettre à jour un utilisateur
        /*
        Utilisateur u = new Utilisateur(1, "izzat", "amri", "ali_updated@gmail.com", "newpass", "avatar1.png", 6, "Utilisateur");
        su.update(u);
        */

        //  Supprimer un utilisateur

        su.delete(2);

    }
}
