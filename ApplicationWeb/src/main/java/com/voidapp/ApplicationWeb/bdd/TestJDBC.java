package com.voidapp.ApplicationWeb.bdd;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

public class TestJDBC {
    /* La liste qui contiendra tous les résultats de nos essais */
    private List<String> messages = new ArrayList<String>();
    private ResourceBundle properties;
    private static String resourceBundle = "config";
    public List<String> executerTests( HttpServletRequest request ) {
        properties = ResourceBundle.getBundle(resourceBundle);
        /*   Chargement du driver JDBC pour MySQL */
        try {
            messages.add( "Chargement du driver..." );
            Class.forName( properties.getString("DB_DRIVER") );
            messages.add( "Driver chargé !" );
        } catch ( ClassNotFoundException e ) {
            messages.add( "Erreur lors du chargement : le driver n'a pas été trouvé dans le classpath ! <br/>"
                        + e.getMessage() );
        }

        /* Connexion à la base de données */
        String url = properties.getString("JDBC_URL");
        String utilisateur = properties.getString("DB_LOGIN");
        String motDePasse = properties.getString("DB_PASSWORD");
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;
        try {
            messages.add( "Connexion à la base de données..." );
            connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
            messages.add( "Connexion réussie !" );

            /* Création de l'objet gérant les requêtes */
           /* statement = connexion.createStatement();*/
            /*messages.add( "Objet requête créé !" );*/

            /* Exécution d'une requête d'écriture*/

           /* int statut = statement.executeUpdate( "INSERT INTO Utilisateur (id,email, prenom, nom, adressefacturation) VALUES ('1','jmarc@mail.fr', 'jean', 'marc', '01 Rue du Test');" );*/

        } catch ( SQLException e ) {
            messages.add( "Erreur lors de la connexion : <br/>"
                        + e.getMessage() );
        } finally {
            messages.add( "Fermeture de l'objet ResultSet." );
            if ( resultat != null ) {
                try {
                    resultat.close();
                } catch ( SQLException ignore ) {
                }
            }
            messages.add( "Fermeture de l'objet Statement." );
            if ( statement != null ) {
                try {
                    statement.close();
                } catch ( SQLException ignore ) {
                }
            }
            messages.add( "Fermeture de l'objet Connection." );
            if ( connexion != null ) {
                try {
                    connexion.close();
                } catch ( SQLException ignore ) {
                }
            }
        }
        return messages;
    }
}