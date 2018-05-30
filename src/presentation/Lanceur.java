package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import domaine.Compte;
import domaine.MontantNegatifException;
import domaine.SoldeNegatifException;

/**
 * methode main
 * @author Badr
 * args paramrétre principal
 *
 */

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compte cp = new Compte(1,500);
		System.out.println("votre solde = " + cp.getSolde() + " Euros");
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("MONTANT A VERSER EN EUROS");
			double mt = sc.nextDouble();
			cp.verser(mt);
		} catch (MontantNegatifException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("SESAIE INCORRECTE");
		}
		System.out.println("SOLDE APRES VERSEMENT");
		System.out.println(cp);
		
		
				
		try {
			System.out.println("MONTANT DE RETRAIT EN EUROS");
			double mt = sc.nextDouble();
			cp.retirer(mt);
		} catch (SoldeNegatifException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("SESAIE INCORRECTE");
		}
		catch (MontantNegatifException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		System.out.println("SOLDE APRES RETRAIT");
		System.out.println(cp );
		
		}
		
		sc.close();
		
	}
}
