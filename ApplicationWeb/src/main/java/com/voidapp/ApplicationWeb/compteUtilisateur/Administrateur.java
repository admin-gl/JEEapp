package com.voidapp.ApplicationWeb.compteUtilisateur;

public abstract class Administrateur extends Utilisateur {

    /* Constructeur */
    public Administrateur(int pId, String pStatut, String pNom, String pMail) {
        super(pId, pStatut, pNom, pMail);
    }

}
