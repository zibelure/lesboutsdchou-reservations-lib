package fr.lesboutsdchou.reservations.dao.personnes;

import java.util.List;

import org.springframework.dao.DataIntegrityViolationException;

import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;
import fr.lesboutsdchou.reservations.model.personnes.Parent;

/**
 * @author anadot
 *
 */
public interface FamilleDao {
	
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
	 * findAllFamilles
	 * @return List<Famille>
	 */
	List<Famille> findAllFamilles();
	
	/**
	 * findFamilleByNumcaf
	 * @param numCaf
	 * @return Famille
	 */
	Famille findFamilleByNumcaf(String numCaf);
	
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
