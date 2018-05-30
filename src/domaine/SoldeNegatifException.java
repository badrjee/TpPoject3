package domaine;
/**
 * clsee d'exception de saisie d'un montant superieur au solde
 * @author Badr
 *
 */

public class SoldeNegatifException extends Exception{
	public SoldeNegatifException(String message) {
		super(message);
		// TODO Auto-generated constructor stub

}
}
