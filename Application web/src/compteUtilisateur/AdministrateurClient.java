package compteUtilisateur;

public class AdministrateurClient extends Administrateur {

	/* Constructeur */
	public AdministrateurClient(int pId, String pNom, String pMail) {
		super(pId, "Administrateur client", pNom, pMail);
	}
	
	private int ajouterUtilisateur() {
		int status = Système.ajouterUtilisateur();
		return status;
	}
	
}
