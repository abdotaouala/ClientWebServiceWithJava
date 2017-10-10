package ws;

import java.rmi.RemoteException;
import java.util.List;

import metier.Compte;

public class ClientWS {
	public static void main(String[] args) {
		try {
			BanqueServiceProxy stub=new BanqueServiceProxy();
			Compte cp=stub.getCompte(12);
			System.out.println(cp.getCode());
			Compte[] cps=stub.getComptes();
			for(Compte c:cps){
				System.out.println("-------");
				System.out.println(c.getSolde());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
