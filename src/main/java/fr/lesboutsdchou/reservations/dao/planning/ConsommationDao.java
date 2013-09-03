package fr.lesboutsdchou.reservations.dao.planning;

import java.util.Date;
import java.util.List;

import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;
import fr.lesboutsdchou.reservations.model.planning.CreneauConsomme;

/**
 * @author anadot
 * 
 */
public interface ConsommationDao {
	
	/**
	 * addPlanification
	 * 
	 * @param enfant
	 * @param dateHeureDebut
	 * @param dateHeureFin
	 *            void
	 */
	void addPlanification(Enfant enfant, Date dateHeureDebut, Date dateHeureFin);

	/**
	 * findAllConsommations
	 * 
	 * @return List<CreneauConsomme>
	 */
	List<CreneauConsomme> findAllConsommations();

	/**
	 * findAllConsommationsByDate
	 * 
	 * @param date
	 * @return List<CreneauConsomme>
	 */
	List<CreneauConsomme> findAllConsommationsByDate(Date date);

	/**
	 * findAllConsommationsByFamille
	 * 
	 * @param famille
	 * @return List<CreneauConsomme>
	 */
	List<CreneauConsomme> findAllConsommationsByFamille(Famille famille);

	/**
	 * findConsommationByEnfantAndByDate
	 * 
	 * @param enfant
	 * @param date
	 * @return CreneauConsomme
	 */
	CreneauConsomme findConsommationByEnfantAndByDate(Enfant enfant, Date date);
}
