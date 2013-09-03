package fr.lesboutsdchou.reservations.dao.personnes;

import java.util.List;

import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;
import fr.lesboutsdchou.reservations.model.personnes.Parent;

/**
 * @author anadot
 *
 */
public interface ParentDao {
		
		/**
		 * addParent
		 * @param parent void
		 */
		void addParent(Parent parent);
		
		/**
		 * updateParent
		 * @param parent void
		 */
		void updateParent(Parent parent);
		
		/**
		 * deleteParent
		 * @param parent void
		 */
		void deleteParent(Parent parent);
		
		/**
		 * findAllParents
		 * @return List<Parent>
		 */
		List<Parent> findAllParents();
		
		/**
		 * findAllParentsByEnfant
		 * @param enfant
		 * @return List<Parent>
		 */
		List<Parent> findAllParentsByEnfant(Enfant enfant);
		
		/**
		 * findAllParentsByFamille
		 * @param famille
		 * @return List<Parent>
		 */
		List<Parent> findAllParentsByFamille(Famille famille);
		
		/**
		 * findParentByNomPrenom
		 * @param nom
		 * @param prenom
		 * @return List<Parent>
		 */
		List<Parent> findParentByNomPrenom(String nom, String prenom);

}
