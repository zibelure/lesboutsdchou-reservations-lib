package fr.lesboutsdchou.reservations.dao.planning;

import java.util.Date;
import java.util.List;

import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;
import fr.lesboutsdchou.reservations.model.planning.CreneauReserve;


/**
 * @author anadot
 *
 */
public interface ReservationDao {
	
	/**
	 * addReservation
	 * @param creneau void
	 */
	void addReservation(CreneauReserve creneau);
	
	/**
	 * updateReservation
	 * @param creneau void
	 */
	void updateReservation(CreneauReserve creneau);
	
	/**
	 * deleteReservation
	 * @param creneau void
	 */
	void deleteReservation(CreneauReserve creneau);

	/**
	 * findReservationByEnfantAndByDate
	 * @param enfant
	 * @param date
	 * @return CreneauReserve
	 */
	CreneauReserve findReservationByEnfantAndByDate(Enfant enfant, Date date);
	
	/**
	 * findAllReservations
	 * @return List<CreneauReserve>
	 */
	List<CreneauReserve> findAllReservations();
	
	/**
	 * findAllReservationsByDate
	 * @param date
	 * @return List<CreneauReserve>
	 */
	List<CreneauReserve> findAllReservationsByDate(Date date);
	
	/**
	 * findAllReservationsByFamille
	 * @param famille
	 * @return List<CreneauReserve>
	 */
	List<CreneauReserve> findAllReservationsByFamille(Famille famille);
	
	/**
	 * findAllReservationsByEnfants
	 * @param enfant
	 * @return List<CreneauReserve>
	 */
	List<CreneauReserve> findAllReservationsByEnfants(Enfant enfant);
	
	/**
	 * findReservationsByEnfantAndBetweenDates
	 * @param enfant
	 * @param dateDebut
	 * @param dateFin
	 * @return List<CreneauReserve>
	 */
	List<CreneauReserve> findReservationsByEnfantAndBetweenDates(Enfant enfant, Date dateDebut, Date dateFin);

}
