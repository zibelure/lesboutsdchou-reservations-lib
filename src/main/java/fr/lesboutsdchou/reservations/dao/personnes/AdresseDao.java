package fr.lesboutsdchou.reservations.dao.personnes;

import fr.lesboutsdchou.reservations.model.personnes.Adresse;
import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;

/**
 * @author anadot
 *
 */
public interface AdresseDao {
	
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
	 * findAdresseByFamille
	 * @param famille
	 * @return Adresse
	 */
	Adresse findAdresseByFamille(Famille famille);
	
}
