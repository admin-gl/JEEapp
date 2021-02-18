package com.voidapp.ApplicationWeb.compteUtilisateur;


public class Utilisateur {

    /* Caractéristiques inconnues des autres utilisateurs */
    int id;
    String mail;

    /* Caractéristiques connues des autres utilisateurs */
    String statut;
    String nom;

    /* Constructeur */
    public Utilisateur(int pId) {
        this.id = pId;
        this.statut = "Utilisateur";
        this.nom = "Non Renseigné";
        this.mail = "Non Renseigné";
    }

    /* Constructeur avec paramètres*/
    public Utilisateur(int pId, String pStatut, String pNom, String pMail) {
        this.id = pId;
        this.statut = pStatut;
        this.nom = pNom;
        this.mail = pMail;
    }

}
