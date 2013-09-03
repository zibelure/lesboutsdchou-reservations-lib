package fr.lesboutsdchou.reservations.services.personnes;

import java.util.Date;
import java.util.List;

import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;


/**
 * @author anadot
 *
 */
public interface EnfantServices {
	
	/**
	 * addEnfant
	 * @param enfant
	 */
	void addEnfant(Enfant enfant);
	
	/**
	 * updateEnfant
	 * @param enfant
	 */
	void updateEnfant(Enfant enfant);
	
	/**
	 * deleteEnfant
	 * @param enfant
	 */
	void deleteEnfant(Enfant enfant);
	
	/**
	 * findAllEnfants
	 * @return
	 */
	List<Enfant> findAllEnfants();
	
	/**
	 * findAllEnfantsByDate
	 * @param date
	 * @return
	 */
	List<Enfant> findAllEnfantsByDate(Date date);
	
	/**
	 * findAllEnfantsByFamille
	 * @param famille
	 * @return
	 */
	List<Enfant> findAllEnfantsByFamille(Famille famille);
	
	/**
	 * findEnfantByNomPrenom
	 * @param nom
	 * @param prenom
	 * @return
	 */
	List<Enfant> findEnfantByNomPrenom(String nom, String prenom);

}
