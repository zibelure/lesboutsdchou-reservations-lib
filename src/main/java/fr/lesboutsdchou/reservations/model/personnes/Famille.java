package fr.lesboutsdchou.reservations.model.personnes;

import java.util.ArrayList;
import java.util.List;


/**
 * @author anadot
 *
 */
public class Famille {

	/**
	 * id long
	 */
	private long id;
	/**
	 * numCaf String
	 */
	private String numCaf;
	/**
	 * adresse Adresse
	 */
	private Adresse adresse;
	/**
	 * parents List<Parent>
	 */
	private List<Parent> parents;
	/**
	 * enfants List<Enfant>
	 */
	private List<Enfant> enfants;
	
	/**
	 * 
	 */
	public Famille() {
		if(parents == null) {
			parents = new ArrayList<Parent>();
		}
		if(enfants == null) {
			enfants = new ArrayList<Enfant>();
		}
	}
	
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
	 * getNumCaf
	 * @return String
	 */
	public String getNumCaf() {
		return numCaf;
	}
	/**
	 * setNumCaf
	 * @param numCaf void
	 */
	public void setNumCaf(String numCaf) {
		this.numCaf = numCaf;
	}
	/**
	 * getAdresse
	 * @return Adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * setAdresse
	 * @param adresse void
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	/**
	 * getParents
	 * @return List<Parent>
	 */
	public List<Parent> getParents() {
		return parents;
	}
	/**
	 * setParents
	 * @param parents void
	 */
	public void setParents(List<Parent> parents) {
		this.parents = parents;
	}
	/**
	 * getEnfants
	 * @return List<Enfant>
	 */
	public List<Enfant> getEnfants() {
		return enfants;
	}
	/**
	 * setEnfants
	 * @param enfants void
	 */
	public void setEnfants(List<Enfant> enfants) {
		this.enfants = enfants;
	}
	
	/**
	 * isHabitantLiffre
	 * @return boolean
	 */
	public boolean isHabitantLiffre() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Famille [id=" + id + ", numCaf=" + numCaf + ", adresse=" + adresse.toString()
		//		+ ", parents=" + parents.toString() + ", enfants=" + enfants.toString()
				+ "]";
	}
	
}
