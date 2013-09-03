package fr.lesboutsdchou.reservations.dao.planning;

import java.util.Date;
import java.util.List;

import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;
import fr.lesboutsdchou.reservations.model.planning.CreneauPlanifie;

/**
 * @author anadot
 *
 */
public interface PlanificationDao {
	
	/**
	 * addPlanification
	 * @param enfant
	 * @param dateHeureDebut
	 * @param dateHeureFin void
	 */
	void addPlanification(Enfant enfant, Date dateHeureDebut, Date dateHeureFin);
	
	/**
	 * findAllPlanifications
	 * @return List<CreneauPlanifie>
	 */
	List<CreneauPlanifie> findAllPlanifications();
	
	/**
	 * findAllPlanificationsByDate
	 * @param date
	 * @return List<CreneauPlanifie>
	 */
	List<CreneauPlanifie> findAllPlanificationsByDate(Date date);
	
	/**
	 * findAllPlanificationsByFamille
	 * @param famille
	 * @return List<CreneauPlanifie>
	 */
	List<CreneauPlanifie> findAllPlanificationsByFamille(Famille famille);
	
	/**
	 * findPlanificationByEnfantAndByDate
	 * @param enfant
	 * @param date
	 * @return CreneauPlanifie
	 */
	CreneauPlanifie findPlanificationByEnfantAndByDate(Enfant enfant, Date date);
}
