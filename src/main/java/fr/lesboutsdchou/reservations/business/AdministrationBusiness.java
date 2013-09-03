package fr.lesboutsdchou.reservations.business;

import java.util.List;

import fr.lesboutsdchou.reservations.model.personnes.Adresse;
import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;
import fr.lesboutsdchou.reservations.model.personnes.Parent;

public interface AdministrationBusiness {
	
	/**
	 * chercherFamille
	 * @param numCaf
	 * @return
	 */
	public Famille chercherFamille(String numCaf);
	
	/**
	 * chercherAdresse
	 * @param famille
	 * @return
	 */
	public Adresse chercherAdresse(Famille famille);
	
	/**
	 * chercherParents
	 * @param famille
	 * @return
	 */
	public List<Parent> chercherParents(Famille famille);
	
	/**
	 * chercherEnfants
	 * @param famille
	 * @return
	 */
	public List<Enfant> chercherEnfants(Famille famille);
	
	/**
	 * ajouterFamille
	 * @param famille
	 */
	public void ajouterFamille(Famille famille);
	
	/**
	 * ajouterAdresse
	 * @param famille
	 * @param adresse
	 */
	public void ajouterAdresse(Famille famille, Adresse adresse);
	
	/**
	 * ajouterParent
	 * @param famille
	 * @param parent
	 */
	public void ajouterParent(Famille famille, Parent parent);
	
	/**
	 * ajouterEnfant
	 * @param famille
	 * @param enfant
	 */
	public void ajouterEnfant(Famille famille, Enfant enfant);
	
	/**
	 * modifierFamille
	 * @param famille
	 */
	public void modifierFamille(Famille famille);
	
	/**
	 * modifierAdresse
	 * @param adresse
	 */
	public void modifierAdresse(Adresse adresse);
	
	/**
	 * modifierParent
	 * @param parent
	 */
	public void modifierParent(Parent parent);
	
	/**
	 * modifierEnfant
	 * @param enfant
	 */
	public void modifierEnfant(Enfant enfant);

	/**
	 * supprimerFamille
	 * @param famille
	 */
	public void supprimerFamille(Famille famille);
	
	/**
	 * supprimerAdresse
	 * @param famille
	 * @param adresse
	 */
	public void supprimerAdresse(Famille famille, Adresse adresse);
	
	/**
	 * supprimerParent
	 * @param famille
	 * @param parent
	 */
	public void supprimerParent(Famille famille, Parent parent);
	
	/**
	 * supprimerEnfant
	 * @param famille
	 * @param enfant
	 */
	public void supprimerEnfant(Famille famille, Enfant enfant);
}
