package fr.lesboutsdchou.reservations.dao.personnes;

import java.util.Date;
import java.util.List;

import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;
import fr.lesboutsdchou.reservations.model.personnes.Parent;


/**
 * @author anadot
 *
 */
public interface EnfantDao {
	
	/**
	 * addEnfant
	 * @param enfant void
	 */
	void addEnfant(Enfant enfant);
	
	/**
	 * updateEnfant
	 * @param enfant void
	 */
	void updateEnfant(Enfant enfant);
	
	/**
	 * deleteEnfant
	 * @param enfant void
	 */
	void deleteEnfant(Enfant enfant);
	
	/**
	 * findAllEnfants
	 * @return List<Enfant>
	 */
	List<Enfant> findAllEnfants();
	
	/**
	 * findAllEnfantsByDate
	 * @param date
	 * @return List<Enfant>
	 */
	List<Enfant> findAllEnfantsByDate(Date date);
	
	/**
	 * findAllEnfantsByFamille
	 * @param famille
	 * @return List<Enfant>
	 */
	List<Enfant> findAllEnfantsByFamille(Famille famille);
	
	/**
	 * findEnfantByNomPrenom
	 * @param nom
	 * @param prenom
	 * @return List<Enfant>
	 */
	List<Enfant> findEnfantByNomPrenom(String nom, String prenom);

}
