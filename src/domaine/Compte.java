package domaine;

public class Compte {
	// declarer les variables
	private int idCompte;
	private double solde;

	// Constructeur
	public Compte(int idCompte, double solde) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
	}

	public Compte() {
		super();

	}

	/**
	 * getter setter
	 * 
	 * @return the idCompte
	 */
	public int getIdCompte() {
		return idCompte;
	}

	/**
	 * /*@param idCompte the idCompte to set
	 */
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;

		/**
		 * @param solde
		 *            the solde to set
		 */
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	
	/**
	 * @param mt
	 * @throws MontantNegatifException capter une erreur dans le cans d'un versement negatif 
	 */
	public void verser(double mt) throws MontantNegatifException {
		if(mt<0) throw new MontantNegatifException("VERSER UN MONTANT NEGATIF => OPPERTATION IMPOSSIBLE");
		this.solde += mt;
	}
	
	/**
	 * @param mt
	 * @throws SoldeNegatifException  capter une erreur dans le cas d'un retrait inferieur au solde
	 * @throws MontantNegatifException  capter une erreur dans le cans d'un retrait negatif PUIS capter les deux erreurs a la fois 
	 */
	public void retirer(double mt) throws SoldeNegatifException, MontantNegatifException {
		if (solde<mt) throw new SoldeNegatifException("retatit impossible");
		if(mt<0) throw new MontantNegatifException("VERSER UN MONTANT NEGATIF => OPPERTATION IMPOSSIBLE");
		this.solde -= mt;
	}

	
	@Override
	public String toString() {
		return "Le Nouveau solde du compte " + idCompte + " est de "+ solde + " Euros";
	}

}
