<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Inscription</title>
    <link type="text/css" rel="stylesheet" href="form.css" />
</head>
<body>
<form method="post" action="inscription">
    <fieldset>
        <legend>Inscription</legend>
        <p>Formulaire à remplir pour s'inscrire en tant qu'utilisateur.</p>


        <label for="nom">Nom <span class="requis">*</span></label>
        <input type="text" id="nom" name="nom" value="${param.nom}" size="20" maxlength="60" />
        <span class="erreur">${erreurs['nom']}</span>
        <br />

        <label for="prenom">Prenom <span class="requis">*</span></label>
        <input type="text" id="prenom" name="prenom" value="${param.prenom}" size="20" maxlength="60" />
        <span class="erreur">${erreurs['prenom']}</span>
        <br />

        <label for="email">Adresse email <span class="requis">*</span></label>
        <input type="text" id="email" name="email" value="${param.email}" size="20" maxlength="60" />
        <span class="erreur">${erreurs['email']}</span>
        <br />

        <label for="motdepasse">Mot de passe <span class="requis">*</span></label>
        <input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" />
        <span class="erreur">${erreurs['motdepasse']}</span>
        <br />

        <label for="confirmation">Confirmation du mot de passe <span class="requis">*</span></label>
        <input type="password" id="confirmation" name="confirmation" value="" size="20" maxlength="20" />
        <span class="erreur">${erreurs['confirmation']}</span>
        <br />

        <label for="adresse">Adresse de facturation <span class="requis">*</span></label>
        <input type="text" id="adresse" name="adresse" value=""${param.adresse}" size="20" maxlength="60" />
        <span class="erreur">${erreurs['adresse']}</span>
        <br />


        <input type="submit" value="Inscription" class="sansLabel" />
        <br />

        <input type="submit" value="Connexion" class="sansLabel" />
        <br />

        <p class="${empty erreurs ? 'succes' : 'erreur'}">${resultat}</p>
    </fieldset>
</form>
</body>
</html>