package fr.lesboutsdchou.reservations.model.personnes;

import java.util.Date;

/**
 * @author anadot
 *
 */
public abstract class Personne {
	
	/**
	 * id long
	 */
	private long id;
	/**
	 * nom String
	 */
	private String nom;
	/**
	 * prenom String
	 */
	private String prenom;
	/**
	 * dateNaissance Date
	 */
	private Date dateNaissance;
	/**
	 * adresse Adresse
	 */
	private Adresse adresse;
	/**
	 * dateCreation Date
	 */
	private Date dateCreation;
	
	/**
	 * getDateCreation
	 * @return Date
	 */
	public Date getDateCreation() {
		return dateCreation;
	}
	/**
	 * setDateCreation
	 * @param dateCreation void
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
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
	 * getNom
	 * @return String
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * setNom
	 * @param nom void
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * getPrenom
	 * @return String
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * setPrenom
	 * @param prenom void
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * getDateNaissance
	 * @return Date
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * setDateNaissance
	 * @param dateNaissance void
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", dateNaissance=" + dateNaissance + "]";
	}
	
}
