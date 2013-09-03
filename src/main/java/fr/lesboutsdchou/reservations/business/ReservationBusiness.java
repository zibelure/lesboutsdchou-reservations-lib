package fr.lesboutsdchou.reservations.business;

import java.util.Date;
import java.util.List;

import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;
import fr.lesboutsdchou.reservations.model.planning.CreneauReserve;

public interface ReservationBusiness {
	
	/**
	 * reserver
	 * @param creneau
	 */
	public void reserver(CreneauReserve creneau);
	
	/**
	 * modifierReservation
	 * @param creneau
	 */
	public void modifierReservation(CreneauReserve creneau);
	
	/**
	 * supprimerReservation
	 * @param creneau
	 */
	public void supprimerReservation(CreneauReserve creneau);
	
	/**
	 * rechercherReservationsParEnfant
	 * @param famille
	 * @param enfant
	 * @return
	 */
	public List<CreneauReserve> rechercherReservationsParEnfant(Famille famille, Enfant enfant);
	
	/**
	 * rechercherReservationsParEnfantParSemaine
	 * @param famille
	 * @param enfant
	 * @param date
	 * @return
	 */
	public List<CreneauReserve> rechercherReservationsParEnfantParSemaine(Famille famille, Enfant enfant, Date date);
	
	/**
	 * rechercherReservationsParSemaine
	 * @param date
	 * @return
	 */
	public List<CreneauReserve> rechercherReservationsParSemaine(Date date);
	
	/**
	 * rechercherReservationsParJour
	 * @param date
	 * @return
	 */
	public List<CreneauReserve> rechercherReservationsParJour(Date date);

	/**
	 * rechercherReservationsParEnfantParJour
	 * @param famille
	 * @param enfant
	 * @param date
	 * @return
	 */
	public CreneauReserve rechercherReservationsParEnfantParJour(Famille famille, Enfant enfant, Date date);
	
}
