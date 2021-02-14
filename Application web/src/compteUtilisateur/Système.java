package compteUtilisateur;

import java.util.ArrayList;

public class Système {
	
	public ArrayList<Utilisateur> BdDClients;
	
	public lastId;
	
	public Système() {
		this.BdDClients = new ArrayList<Utilisateur>();
		this.lastId = 0;
	}
	
	public int ajouterUtilisateur() {
		
		if (this.status == "Administrateur Client") {
			
			Utilisateur nouvelUtilisateur = new Utilisateur(lastId);
			BdDClients.add(nouvelUtilisateur);
			
			lastId = lastId + 1;
			
			return lastId - 1;
			
		} else {
			System.out.println("Vous n'avez pas les droits d'ajouter un utilisateur");
			return -1;
		}
		
	}

}
