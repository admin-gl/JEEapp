package com.voidapp.ApplicationWeb.compteUtilisateur;


import java.util.Date;

public class Utilisateur {

    /* Caractéristiques inconnues des autres utilisateurs */
    int id;
    String mail;
    String mdp;
    Civilite civilite;
    Statut statut;
    String nom;
    String prenom;
    Date dateadhesion;
    String adressefacturation;
    Genre genrepref;

    public Utilisateur(int id, String mail, String mdp, Civilite civilite,  String nom, String prenom, Date dateadhesion, String adressefacturation, Genre genrepref) {
        this.id = id;
        this.mail = mail;
        this.mdp = mdp;
        this.civilite = civilite;
        this.statut = Statut.Utilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.dateadhesion = dateadhesion;
        this.adressefacturation = adressefacturation;
        this.genrepref = genrepref;
    }

    public enum Statut{
        Utilisateur, AdministrateurClient, AdministrateurMusique
    }

    public enum Civilite {
        MADAME, MADEMOISELLE, MONSIEUR
    }

    public enum Genre {
        House, Pop, Classique, Jazz, Métal
    }


}
