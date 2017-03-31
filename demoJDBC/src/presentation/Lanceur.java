package presentation;

import java.util.ArrayList;
import java.util.Collection;

import metier.Client;
import service.ClientService;
import service.IClientService;
import service.IClientServiceVip;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// déclaration de l'interface
		IClientService s = new ClientService();
		IClientServiceVip sv = new ClientService();
		Collection<Client> col = new ArrayList<Client>();
		
		Client c = new Client();
		//declaration de la classe;
		ClientService cs = new ClientService();
		System.out.println("--------------CLIENT NORMAL-------------------------------");		
		// utilisation de l'interface
		s.direAurevoir();
		s.direBonjour();
		//s.jesuisVip();
		System.out.println("--------------CLIENT VIP---------------------------------");
		sv.direBonjour();
		sv.direAurevoir();
		sv.jesuisVip();
		
		//utilisation de la classe
		/*cs.direAurevoir();
		cs.direBonjour();
		cs.jesuisVip();*/
		//System.out.println("--------------AJOUTER UN CLIENT---------------------------------");
		c.setNom("blablatestet");c.setPrenom("testblazzz");
		c.setCouleurYeux("orange");
		s.ajouterClient(c);
		System.out.println("--------------LISTER TOUS LES CLIENTS---------------------------------");
		col = s.listerClients();
		for(Client cli : col)
		{
			System.out.println(cli);
		}
		/*System.out.println("--------------MAJ CLIENT---------------------------------");
		s.modifierClient(1, "zzzzzz", "zzzzzzzzz");
		System.out.println("--------------RECHERCHER CLIENT---------------------------------");
		Client cli = s.chercherClient(1);
		System.out.println(cli);
		System.out.println("--------------SUPPRIMER CLIENT---------------------------------");
		s.supprimerClient(1);*/
		System.out.println("--------------RECHERCHER CLIENT PAR MC---------------------------------");
		Collection<Client> col2 = s.chercherParMC("t");
		for(Client client : col2)
		{
			System.out.println(client);
		}
	}

}
