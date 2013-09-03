/**
 * 
 */
package business;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;

import fr.lesboutsdchou.reservations.business.AdministrationBusiness;
import fr.lesboutsdchou.reservations.business.BusinessFactory;
import fr.lesboutsdchou.reservations.business.ReservationBusiness;
import fr.lesboutsdchou.reservations.business.impl.BusinessFactoryImpl;
import fr.lesboutsdchou.reservations.model.personnes.Adresse;
import fr.lesboutsdchou.reservations.model.personnes.Enfant;
import fr.lesboutsdchou.reservations.model.personnes.Famille;
import fr.lesboutsdchou.reservations.model.personnes.Parent;
import fr.lesboutsdchou.reservations.model.planning.CreneauReserve;
import fr.lesboutsdchou.reservations.services.BeanFactory;

/**
 * @author anadot
 * 
 */
public class ReservationBusinessTest extends TestCase {

	static ApplicationContext context;
	static BusinessFactory businessFactory;
	static ReservationBusiness reservationBusiness;
	static AdministrationBusiness administrationBusiness;
	static SimpleDateFormat simpleDateFormat;
	static final String NUMCAF_1 = "00003";
	static final String NUMCAF_2 = "00004";
	
	static {
		context = BeanFactory.getInstance().getContext();
		businessFactory = (BusinessFactoryImpl) context
				.getBean("businessFactory");
		administrationBusiness = businessFactory.getAdministrationBusiness();
		reservationBusiness = businessFactory.getReservationBusiness();
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		preparationDonneesTests();
	}

	/**
	 * ReservationBusinessTest
	 */
	public ReservationBusinessTest(String reservationBusinessTest) {
		super(reservationBusinessTest);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/*
	 * (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/*
	 * preparationDonneesTests
	 */
	private static void preparationDonneesTests() {
		Famille famille = new Famille();
		famille.setNumCaf(NUMCAF_1);

		// Ajout adresse
		Adresse adresse = new Adresse();
		adresse.setVoie("Peny Lane");
		adresse.setNumVoie("1");
		adresse.setCodePostal("90000");
		adresse.setLocalite("Liverpool");

		// Ajout enfants
		Enfant enfant = new Enfant();
		enfant.setNom("Starkey");
		enfant.setPrenom("Richard");
		enfant.setAdresse(adresse);
		famille.setAdresse(adresse);
		List<Enfant> enfants = new ArrayList<Enfant>();
		enfants.add(enfant);
		famille.setEnfants(enfants);

		// Ajout parents
		Parent parent = new Parent();
		parent.setNom("Starkey");
		parent.setPrenom("Magnus");
		parent.setAdresse(adresse);
		List<Parent> parents = new ArrayList<Parent>();
		parents.add(parent);
		famille.setParents(parents);

		// Gestion des dates
		Date dateNaissanceEnfant = null;
		Date dateNaissanceParent = null;
		try {
			dateNaissanceEnfant = simpleDateFormat.parse("25/11/2010 00:00:00");
			dateNaissanceParent = simpleDateFormat.parse("09/02/1970 00:00:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		enfant.setDateNaissance(dateNaissanceEnfant);
		parent.setDateNaissance(dateNaissanceParent);
		enfant.setDateCreation(new Date());
		parent.setDateCreation(new Date());

		// Ajout de la nouvelle famille
		administrationBusiness.ajouterFamille(famille);

		famille = new Famille();
		famille.setNumCaf(NUMCAF_2);

		// Ajout adresse
		adresse = new Adresse();
		adresse.setVoie("Dakota Building");
		adresse.setNumVoie("1");
		adresse.setCodePostal("91000");
		adresse.setLocalite("New York");

		// Ajout enfants
		enfant = new Enfant();
		enfant.setNom("Lennon");
		enfant.setPrenom("John");
		enfant.setAdresse(adresse);
		famille.setAdresse(adresse);
		enfants = new ArrayList<Enfant>();
		enfants.add(enfant);
		famille.setEnfants(enfants);

		// Ajout parents
		parent = new Parent();
		parent.setNom("Mimi");
		parent.setPrenom("Aunt");
		parent.setAdresse(adresse);
		parents = new ArrayList<Parent>();
		parents.add(parent);
		famille.setParents(parents);

		// Gestion des dates
		dateNaissanceEnfant = null;
		dateNaissanceParent = null;
		try {
			dateNaissanceEnfant = simpleDateFormat.parse("17/06/2010 00:00:00");
			dateNaissanceParent = simpleDateFormat.parse("17/06/1972 00:00:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		enfant.setDateNaissance(dateNaissanceEnfant);
		parent.setDateNaissance(dateNaissanceParent);
		enfant.setDateCreation(new Date());
		parent.setDateCreation(new Date());

		// Ajout de la nouvelle famille
		administrationBusiness.ajouterFamille(famille);

	}

	/*
	 * nettoyageDonneesTests
	 */
	private void nettoyageDonneesTests() {
		// Famille 1
		// Recherche famille 1 à supprimer
		Famille famille = administrationBusiness.chercherFamille(NUMCAF_1);
		List<Enfant> enfants =
		administrationBusiness.chercherEnfants(famille);
		Enfant enfant = null;
		if (enfants != null) {
			enfant = enfants.get(0);
		}
		//Recherches créneaux à supprimer
		List<CreneauReserve> creneaux = reservationBusiness
				.rechercherReservationsParEnfant(famille, enfant);
		//Suppression des créneaux
		if (creneaux != null) {
			for (CreneauReserve creneauReserve : creneaux) {
				reservationBusiness.supprimerReservation(creneauReserve);
			}
		}
		//Suppression enfants, parents et famille
		administrationBusiness.supprimerFamille(famille);
		
		// Famille 2
		// Recherche famille 1 à supprimer
		famille = administrationBusiness.chercherFamille(NUMCAF_2);
		//Suppression enfants, parents et famille
		administrationBusiness.supprimerFamille(famille);
	}

	/*
	 * testAjouterNouvellesReservations
	 */
	public void testAjouterNouvellesReservations() {

		Famille famille = administrationBusiness.chercherFamille(NUMCAF_1);
		List<Enfant> enfants = administrationBusiness.chercherEnfants(famille);
		Enfant enfant = null;
		if (enfants != null) {
			enfant = enfants.get(0);
		}
		// Gestion des dates
		Date dateHeureDebut = null;
		Date dateHeureFin = null;
		try {
			dateHeureDebut = simpleDateFormat.parse("17/03/2013 09:00:00");
			dateHeureFin = simpleDateFormat.parse("17/03/2013 16:30:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Ajout de la nouvelle réservation
		CreneauReserve creneau = new CreneauReserve();
		creneau.setFamille(famille);
		creneau.setEnfant(enfant);
		creneau.setDateHeureDebut(dateHeureDebut);
		creneau.setDateHeureFin(dateHeureFin);
		reservationBusiness.reserver(creneau);

		// Vérification de l'ajout
		creneau = reservationBusiness.rechercherReservationsParEnfantParJour(
				famille, enfant, dateHeureDebut);
		assertEquals("date créneau correcte", dateHeureDebut,
				creneau.getDateHeureDebut());
		assertEquals("enfant créneau correct", enfant.getId(), creneau.getEnfant().getId());

	}

	/*
	 * testRechercheReservationInexistante
	 */
	public void testRechercheReservationInexistante() {

		Famille famille = administrationBusiness.chercherFamille(NUMCAF_1);
		List<Enfant> enfants = administrationBusiness.chercherEnfants(famille);
		Enfant enfant = null;
		if (enfants != null) {
			enfant = enfants.get(0);
		}
		// Gestion des dates
		Date dateHeureDebut = null;
		Date dateHeureFin = null;
		try {
			dateHeureDebut = simpleDateFormat.parse("01/01/2010 09:00:00");
			dateHeureFin = simpleDateFormat.parse("01/01/2010 16:30:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Vérification de l'absence d'une réservation
		CreneauReserve creneau = reservationBusiness
				.rechercherReservationsParEnfantParJour(famille, enfant,
						dateHeureDebut);
		assertNull("réservation inexitante validée", creneau);

	}

	/*
	 * testModifierReservation
	 */
	public void testModifierReservation() {

		Famille famille = administrationBusiness.chercherFamille(NUMCAF_1);
		List<Enfant> enfants = administrationBusiness.chercherEnfants(famille);
		Enfant enfant = null;
		if (enfants != null) {
			enfant = enfants.get(0);
		}
		// Gestion des dates
		Date dateInitialeRecherchee = null;
		Date dateHeureDebutModifiee = null;
		Date dateHeureFinModifiee = null;
		try {
			dateInitialeRecherchee = simpleDateFormat
					.parse("17/03/2013 09:00:00");
			dateHeureDebutModifiee = simpleDateFormat
					.parse("18/03/2013 09:30:00");
			dateHeureFinModifiee = simpleDateFormat
					.parse("18/03/2013 17:30:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Vérification créneau trouvé
		CreneauReserve creneau = reservationBusiness
				.rechercherReservationsParEnfantParJour(famille, enfant,
						dateInitialeRecherchee);
		assertEquals("créneau trouvé", dateInitialeRecherchee,
				creneau.getDateHeureDebut());
		assertEquals("enfant créneau correct", enfant.getId(), creneau
				.getEnfant().getId());

		// Modification de la journée et de l'heure du créneau
		creneau.setDateHeureDebut(dateHeureDebutModifiee);
		creneau.setDateHeureFin(dateHeureFinModifiee);
		reservationBusiness.modifierReservation(creneau);

		// Vérification créneau modifié
		creneau = reservationBusiness.rechercherReservationsParEnfantParJour(
				famille, enfant, dateHeureDebutModifiee);
		assertEquals("date début créneau modifié correct",
				dateHeureDebutModifiee, creneau.getDateHeureDebut());
		assertEquals("date fin créneau modifié correct", dateHeureFinModifiee,
				creneau.getDateHeureFin());
		assertEquals("enfant créneau modifié correct", enfant.getId(), creneau
				.getEnfant().getId());
	}

	/*
	 * testSupprimerReservation
	 */
	public void testSupprimerReservation() {
		Famille famille = administrationBusiness.chercherFamille(NUMCAF_1);
		List<Enfant> enfants = administrationBusiness.chercherEnfants(famille);
		Enfant enfant = null;
		if (enfants != null) {
			enfant = enfants.get(0);
		}
		// Gestion des dates
		Date dateCreneauASupprimer = null;
		try {
			dateCreneauASupprimer = simpleDateFormat
					.parse("18/03/2013 09:30:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Vérification créneau trouvé
		CreneauReserve creneau = reservationBusiness
				.rechercherReservationsParEnfantParJour(famille, enfant,
						dateCreneauASupprimer);
		assertEquals("créneau trouvé", dateCreneauASupprimer,
				creneau.getDateHeureDebut());
		assertEquals("enfant créneau correct", enfant.getId(), creneau
				.getEnfant().getId());

		// Suppression du créneau
		reservationBusiness.supprimerReservation(creneau);

		// Vérification créneau modifié
		creneau = reservationBusiness.rechercherReservationsParEnfantParJour(
				famille, enfant, dateCreneauASupprimer);
		assertNull("réservation inexitante validée", creneau);
		
		nettoyageDonneesTests();
	}

	/*
	 * Suite
	 */
	public static junit.framework.Test suite() {
		TestSuite suite = new TestSuite("Test ReservationBusiness");
		suite.addTest(new ReservationBusinessTest("testAjouterNouvellesReservations"));
		suite.addTest(new ReservationBusinessTest("testRechercheReservationInexistante"));
		suite.addTest(new ReservationBusinessTest("testModifierReservation"));
		suite.addTest(new ReservationBusinessTest("testSupprimerReservation"));
		return suite;
	}

}
