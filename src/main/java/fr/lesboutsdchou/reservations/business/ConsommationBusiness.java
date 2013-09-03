package fr.lesboutsdchou.reservations.business;

import java.util.Date;
import java.util.List;

import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;
import fr.lesboutsdchou.reservations.model.planning.CreneauConsomme;

public interface ConsommationBusiness {
	
	/**
	 * consommer
	 * @param famille
	 * @param enfant
	 * @param dateHeureDebut
	 * @param dateHeureFin
	 */
	public void consommer(Famille famille, Enfant enfant, Date dateHeureDebut, Date dateHeureFin);
	
	/**
	 * rechercherConsommation
	 * @param famille
	 * @param enfant
	 * @param date
	 * @return
	 */
	public CreneauConsomme rechercherConsommation(Famille famille, Enfant enfant, Date date);
	
	/**
	 * rechercherConsommationsParEnfant
	 * @param famille
	 * @param enfant
	 * @return
	 */
	public List<CreneauConsomme> rechercherConsommationsParEnfant(Famille famille, Enfant enfant);
	
	/**
	 * rechercherConsommationsParSemaine
	 * @param semaine
	 * @return
	 */
	public List<CreneauConsomme> rechercherConsommationsParSemaine(int semaine);
	
	/**
	 * rechercherConsommationsParJour
	 * @param date
	 * @return
	 */
	public List<CreneauConsomme> rechercherConsommationsParJour(Date date);

}
