package fr.lesboutsdchou.reservations.model.personnes;

/**
 * @author anadot
 *
 */
public class Adresse {

	/**
	 * id long
	 */
	private long id;
	/**
	 * voie String
	 */
	private String voie;
	/**
	 * numVoie String
	 */
	private String numVoie;
	/**
	 * codePostal String
	 */
	private String codePostal;
	/**
	 * localite String
	 */
	private String localite;
	/**
	 * getId
	 * @return long
	 */
	public long getId() {
		return id;
	}
	/**
	 * setId
	 * @param id void
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * getVoie
	 * @return String
	 */
	public String getVoie() {
		return voie;
	}
	/**
	 * setVoie
	 * @param voie void
	 */
	public void setVoie(String voie) {
		this.voie = voie;
	}
	/**
	 * getNumVoie
	 * @return String
	 */
	public String getNumVoie() {
		return numVoie;
	}
	/**
	 * setNumVoie
	 * @param numVoie void
	 */
	public void setNumVoie(String numVoie) {
		this.numVoie = numVoie;
	}
	/**
	 * getCodePostal
	 * @return String
	 */
	public String getCodePostal() {
		return codePostal;
	}
	/**
	 * setCodePostal
	 * @param codePostal void
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	/**
	 * getLocalite
	 * @return String
	 */
	public String getLocalite() {
		return localite;
	}
	/**
	 * setLocalite
	 * @param localite void
	 */
	public void setLocalite(String localite) {
		this.localite = localite;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adresse [voie=" + voie + ", numVoie=" + numVoie
				+ ", codePostal=" + codePostal + ", localite=" + localite + "]";
	}
	
	

}
