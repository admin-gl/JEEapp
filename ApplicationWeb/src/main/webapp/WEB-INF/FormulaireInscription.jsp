<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Inscription</title>
    <link type="text/css" rel="stylesheet" href="../css/InsciptionCSS.css" />
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Montserrat">
</head>
<body>
<div id="wrapper">
    <div>
        <p>Inscrivez-vous gratuitement !</p>
    </div>
    <div class="form">
        <form method="post" action="inscription">
            <fieldset>
                <legend>Inscription</legend>

                <label style="font-family: 'Montserrat'" for="nom">Nom <span class="requis">*</span></label>
                <input type="text" id="nom" name="nom" value="${utilisateur.nom}" size="20" maxlength="60" />
                <span class="erreur">${formulaire.erreurs['nom']}</span>
                <br />

                <label style="font-family: 'Montserrat'" for="prenom">Prenom <span class="requis">*</span></label>
                <input type="text" id="prenom" name="prenom" value="${Utilisateur.prenom}" size="20" maxlength="60" />
                <span class="erreur">${formulaire.erreurs['prenom']}</span>
                <br />

                <label style="font-family: 'Montserrat" for="email">Adresse email <span class="requis">*</span></label>
                <input type="text" id="email" name="email" value="${Utilisateur.email}" size="20" maxlength="60" />
                <span class="erreur">${formulaire.erreurs['email']}</span>
                <br />

                <label  style="font-family: 'Montserrat'" for="motdepasse">Mot de passe <span class="requis">*</span></label>
                <input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" />
                <span class="erreur">${formulaire.erreurs['motdepasse']}</span>
                <br />

                <label  style="font-family: 'Montserrat'" for="confirmation">Confirmation du mot de passe <span class="requis">*</span></label>
                <input type="password" id="confirmation" name="confirmation" value="" size="20" maxlength="20" />
                <span class="erreur">${formulaire.erreurs['confirmation']}</span>
                <br />

                <label style="font-family: 'Montserrat'" for="adresse">Adresse de facturation <span class="requis">*</span></label>
                <input type="text" id="adresse" name="adresse" value=""${utilisateur.adressefacturation}" size="20" maxlength="60" />
                <span class="erreur">${formulaire.erreurs['adresse']}</span>
                <br />


                <input style="font-family: 'Montserrat'" type="submit" value="Inscription" class="sansLabel" />
                <br />

                <input style="font-family: 'Montserrat'" type="submit" value="Connexion" class="sansLabel" />
                <br />

                <p class="${empty formulaire.erreurs ? 'succes' : 'erreur'}">${formulaire.resultat}</p>
            </fieldset>
        </form>
    </div>
</div>

</body>
</html>