package fr.lesboutsdchou.reservations.services.personnes;

import java.util.List;

import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;
import fr.lesboutsdchou.reservations.model.personnes.Parent;

/**
 * @author anadot
 *
 */
public interface FamilleServices {
	
	/**
	 * addFamille
	 * @param famille void
	 */
	void addFamille(Famille famille);
	
	/**
	 * updateFamille
	 * @param famille void
	 */
	void updateFamille(Famille famille);
	
	/**
	 * deleteFamille
	 * @param famille void
	 */
	void deleteFamille(Famille famille);

	/**
	 * findFamilleByNumcaf
	 * @param numCaf
	 * @return Famille
	 */
	Famille findFamilleByNumcaf(String numCaf);
	
	/**
	 * findAllFamilles
	 * @return List<Famille>
	 */
	List<Famille> findAllFamilles();
	
	/**
	 * findFamilleByEnfant
	 * @param enfant
	 * @return Famille
	 */
	Famille findFamilleByEnfant(Enfant enfant);
	
	/**
	 * findFamilleByParent
	 * @param parent
	 * @return Famille
	 */
	Famille findFamilleByParent(Parent parent);
	
}
