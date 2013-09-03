package fr.lesboutsdchou.reservations.dao.planning.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fr.lesboutsdchou.reservations.dao.planning.ReservationDao;
import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;
import fr.lesboutsdchou.reservations.model.planning.CreneauReserve;

public class ReservationDaoImpl extends HibernateDaoSupport implements
		ReservationDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.lesboutsdchou.reservations.dao.planning.ReservationDao#addReservation
	 * (fr.lesboutsdchou.reservations.model.planning.CreneauReserve)
	 */
	public void addReservation(CreneauReserve creneau) {
		getHibernateTemplate().save(creneau);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.lesboutsdchou.reservations.dao.planning.ReservationDao#updateReservation
	 * (fr.lesboutsdchou.reservations.model.planning.CreneauReserve)
	 */
	public void updateReservation(CreneauReserve creneau) {
		getHibernateTemplate().update(creneau);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.lesboutsdchou.reservations.dao.planning.ReservationDao#deleteReservation
	 * (fr.lesboutsdchou.reservations.model.planning.CreneauReserve)
	 */
	public void deleteReservation(CreneauReserve creneau) {
		getHibernateTemplate().delete(creneau);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.lesboutsdchou.reservations.dao.planning.ReservationDao#findAllReservations
	 * ()
	 */
	public List<CreneauReserve> findAllReservations() {
		return getHibernateTemplate().find("from CreneauReserve");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.lesboutsdchou.reservations.dao.planning.ReservationDao#
	 * findAllReservationsByDate(java.util.Date)
	 */
	public List<CreneauReserve> findAllReservationsByDate(Date date) {
		List<CreneauReserve> creneaux = null;
		if (date != null) {
			creneaux = getHibernateTemplate()
					.find("from CreneauReserve as creneau where creneau.dateHeureDebut=?",
							date);
			// getSession().beginTransaction();
			// enfants = getSession().createQuery("select enfant from " +
			// "Famille as famille left join famille.enfants enfant where famille.numCaf = :numcaf").setString("numcaf",
			// famille.getNumCaf()).list();
		}
		return creneaux;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.lesboutsdchou.reservations.dao.planning.ReservationDao#
	 * findAllReservationsByFamille
	 * (fr.lesboutsdchou.reservations.model.personnes.Famille)
	 */
	public List<CreneauReserve> findAllReservationsByFamille(Famille famille) {
		List<CreneauReserve> creneaux = null;
		if (famille != null) {
			creneaux = getHibernateTemplate().find(
					"from CreneauReserve as creneau where creneau.famille=?",
					famille.getId());
			// getSession().beginTransaction();
			// enfants = getSession().createQuery("select enfant from " +
			// "Famille as famille left join famille.enfants enfant where famille.numCaf = :numcaf").setString("numcaf",
			// famille.getNumCaf()).list();
		}
		return creneaux;
	}
	
	/*
	 * (non-Javadoc)
	 * @see fr.lesboutsdchou.reservations.dao.planning.ReservationDao#findAllReservationsByEnfants(fr.lesboutsdchou.reservations.model.personnes.Enfant)
	 */
	public List<CreneauReserve> findAllReservationsByEnfants(Enfant enfant) {
		List<CreneauReserve> creneaux = null;
		if (enfant != null) {
			creneaux = getSession()
					.createQuery(
							"select creneau "
									+ "from CreneauReserve as creneau inner join creneau.enfant enfant "
									+ "where enfant.nom=:nom and enfant.prenom=:prenom ")
					.setString("nom", enfant.getNom())
					.setString("prenom", enfant.getPrenom())
					.list();
		}
		return creneaux;
	}
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.lesboutsdchou.reservations.dao.planning.ReservationDao#
	 * findReservationByEnfantAndByDate
	 * (fr.lesboutsdchou.reservations.model.personnes.Enfant, java.util.Date)
	 */
	public CreneauReserve findReservationByEnfantAndByDate(Enfant enfant,
			Date date) {
		CreneauReserve creneau = null;
		if (enfant != null && date != null) {
			Calendar cal = GregorianCalendar.getInstance();
			cal.setTime(date);
			// Initialisation date début de période
			cal.set(Calendar.HOUR, 0);
			cal.set(Calendar.MINUTE, 0);
			cal.set(Calendar.SECOND, 0);
			Date dateDebut = cal.getTime();
			// Initialisation date début de période
			cal.set(Calendar.HOUR, 23);
			cal.set(Calendar.MINUTE, 59);
			cal.set(Calendar.SECOND, 59);
			Date dateFin = cal.getTime();
			System.out.println("dateDebut : " + dateDebut + " dateFin : "
					+ dateFin);
			List<CreneauReserve> creneauxReserves = findReservationsByEnfantAndBetweenDates(
					enfant, dateDebut, dateFin);
			if (creneauxReserves != null && creneauxReserves.size() >= 1) {
				creneau = creneauxReserves.get(0);
			}
		}
		return creneau;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.lesboutsdchou.reservations.dao.planning.ReservationDao#
	 * findReservationsByEnfantAndBetweenDates
	 * (fr.lesboutsdchou.reservations.model.personnes.Enfant, java.util.Date,
	 * java.util.Date)
	 */
	public List<CreneauReserve> findReservationsByEnfantAndBetweenDates(
			Enfant enfant, Date dateDebut, Date dateFin) {
		List<CreneauReserve> creneauxReserves = new ArrayList<CreneauReserve>();
		if (enfant != null && dateDebut != null && dateFin != null) {
			Timestamp dateDebutTS = new Timestamp(dateDebut.getTime());
			Timestamp dateFinTS = new Timestamp(dateFin.getTime());
			creneauxReserves = getSession()
					.createQuery(
							"select creneau "
									+ "from CreneauReserve as creneau inner join creneau.enfant enfant "
									+ "where enfant.nom=:nom and enfant.prenom=:prenom and creneau.dateHeureDebut>=:dateHeuredebut and creneau.dateHeureFin<=:dateHeureFin")
					.setString("nom", enfant.getNom())
					.setString("prenom", enfant.getPrenom())
					.setTimestamp("dateHeuredebut", dateDebutTS)
					.setTimestamp("dateHeureFin", dateFinTS).list();
		}
		return creneauxReserves;
	}

}
