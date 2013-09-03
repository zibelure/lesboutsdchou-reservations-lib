package fr.lesboutsdchou.reservations.model.planning;

import java.util.Date;
import java.util.GregorianCalendar;

import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;

/**
 * @author anadot
 *
 */
public abstract class Creneau {
	
	/**
	 * id long
	 */
	private long id;
	/**
	 * enfant Enfant
	 */
	private Enfant enfant;
	/**
	 * famille Famille
	 */
	private Famille famille;
	/**
	 * dateHeureDebut Date
	 */
	private Date dateHeureDebut;
	/**
	 * dateHeureFin Date
	 */
	private Date dateHeureFin;
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
	 * getEnfant
	 * @return Enfant
	 */
	public Enfant getEnfant() {
		return enfant;
	}
	/**
	 * setEnfant
	 * @param enfant void
	 */
	public void setEnfant(Enfant enfant) {
		this.enfant = enfant;
	}
	/**
	 * getFamille
	 * @return Famille
	 */
	public Famille getFamille() {
		return famille;
	}
	/**
	 * setFamille
	 * @param famille void
	 */
	public void setFamille(Famille famille) {
		this.famille = famille;
	}
	/**
	 * getDateHeureDebut
	 * @return Date
	 */
	public Date getDateHeureDebut() {
		return dateHeureDebut;
	}
	/**
	 * setDateHeureDebut
	 * @param dateHeureDebut void
	 */
	public void setDateHeureDebut(Date dateHeureDebut) {
		this.dateHeureDebut = dateHeureDebut;
	}
	/**
	 * getDateHeureFin
	 * @return Date
	 */
	public Date getDateHeureFin() {
		return dateHeureFin;
	}
	/**
	 * setDateHeureFin
	 * @param dateHeureFin void
	 */
	public void setDateHeureFin(Date dateHeureFin) {
		this.dateHeureFin = dateHeureFin;
	}
	
	/**
	 * getDateReservation
	 * @return Date
	 */
	public Date getDateReservation() {
		return this.dateHeureDebut;
	}
	
	/**
	 * getSemaineReservation
	 * @return int
	 */
	public int getSemaineReservation() {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setGregorianChange(dateHeureDebut);
		return gc.getWeekYear();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReservationBusiness [id=" + id + ", enfant=" + enfant
				+ ", dateHeureDebut=" + dateHeureDebut + ", dateHeureFin="
				+ dateHeureFin + "]";
	}
	
}
