package fr.lesboutsdchou.reservations.services.planning;

import java.util.Date;
import java.util.List;

import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;
import fr.lesboutsdchou.reservations.model.planning.CreneauReserve;

/**
 * ReservationServices
 * @author anadot
 *
 */
/**
 * @author anadot
 *
 */
public interface ReservationServices {

	/**
	 * addReservation
	 * @param creneau
	 */
	void addReservation(CreneauReserve creneau);


	/**
	 * updateReservation
	 * @param creneau
	 */
	void updateReservation(CreneauReserve creneau);
	
	/**
	 * deleteReservation
	 * @param creneau
	 */
	void deleteReservation(CreneauReserve creneau);
	
	/**
	 * findAllReservations
	 * @return
	 */
	List<CreneauReserve> findAllReservations();
	
	/**
	 * findAllReservationsByDate
	 * @param date
	 * @return
	 */
	List<CreneauReserve> findAllReservationsByDate(Date date);
	
	/**
	 * findAllReservationsByFamille
	 * @param famille
	 * @return
	 */
	List<CreneauReserve> findAllReservationsByFamille(Famille famille);
	
	/**
	 * findAllReservationsByEnfant
	 * @param enfant
	 * @return
	 */
	List<CreneauReserve> findAllReservationsByEnfant(Enfant enfant);
	
	/**
	 * findReservationByEnfantAndByDate
	 * @param enfant
	 * @param date
	 * @return
	 */
	CreneauReserve findReservationByEnfantAndByDate(Enfant enfant, Date date);

}
