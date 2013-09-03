package fr.lesboutsdchou.reservations.services.personnes;

import java.util.List;

import fr.lesboutsdchou.reservations.model.personnes.Adresse;
import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;

/**
 * @author anadot
 *
 */
public interface AdresseServices {
	
	/**
	 * addAdresse
	 * @param adresse void
	 */
	void addAdresse(Adresse adresse);
	
	/**
	 * updateAdresse
	 * @param adresse void
	 */
	void updateAdresse(Adresse adresse);
	
	/**
	 * deleteAdresse
	 * @param adresse void
	 */
	void deleteAdresse(Adresse adresse);
	
	/**
	 * findAllFamilles
	 * @return List<Famille>
	 */
	List<Famille> findAllFamilles();
	
	/**
	 * findAdressesByFamille
	 * @param famille
	 * @return Adresse
	 */
	Adresse findAdressesByFamille(Famille famille);
	
}
