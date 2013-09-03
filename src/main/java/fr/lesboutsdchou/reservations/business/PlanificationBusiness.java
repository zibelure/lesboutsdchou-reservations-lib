package fr.lesboutsdchou.reservations.business;

import java.util.Date;
import java.util.List;

import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;
import fr.lesboutsdchou.reservations.model.planning.CreneauPlanifie;

public interface PlanificationBusiness {
	
	/**
	 * planifier
	 * @param famille
	 * @param enfant
	 * @param dateHeureDebut
	 * @param dateHeureFin
	 */
	public void planifier(Famille famille, Enfant enfant, Date dateHeureDebut, Date dateHeureFin);
	
	/**
	 * rechercherPlanification
	 * @param famille
	 * @param enfant
	 * @param date
	 * @return
	 */
	public CreneauPlanifie rechercherPlanification(Famille famille, Enfant enfant, Date date);
	
	/**
	 * rechercherPlanificationsParEnfant
	 * @param famille
	 * @param enfant
	 * @return
	 */
	public List<CreneauPlanifie> rechercherPlanificationsParEnfant(Famille famille, Enfant enfant);
	
	/**
	 * rechercherPlanificationsParSemaine
	 * @param semaine
	 * @return
	 */
	public List<CreneauPlanifie> rechercherPlanificationsParSemaine(int semaine);
	
	/**
	 * rechercherPlanificationsParJour
	 * @param date
	 * @return
	 */
	public List<CreneauPlanifie> rechercherPlanificationsParJour(Date date);	

}