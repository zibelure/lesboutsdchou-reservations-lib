package fr.lesboutsdchou.reservations.model.personnes;

/**
 * @author anadot
 *
 */
public class Parent extends Personne {

	/* (non-Javadoc)
	 * @see fr.lesboutsdchou.reservations.model.personnes.Personne#toString()
	 */
	@Override
	public String toString() {
		return "Parent [getDateCreation()=" + getDateCreation()
				+ ", getAdresse()=" + getAdresse() + ", getId()=" + getId()
				+ ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", getDateNaissance()=" + getDateNaissance()
				+ ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}	
	
}
