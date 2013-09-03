package fr.lesboutsdchou.reservations.model.planning;

/**
 * @author anadot
 *
 */
public class CreneauReserve extends Creneau {
	
	/**
	 * reservationValidee boolean
	 */
	private boolean reservationValidee;

	/**
	 * setReservationValidee
	 * @param reservationValidee void
	 */
	public void setReservationValidee(boolean reservationValidee) {
		this.reservationValidee = reservationValidee;
	}
	/**
	 * isReservationValidee
	 * @return boolean
	 */
	public boolean isReservationValidee() {
		return reservationValidee;
	}
	/* (non-Javadoc)
	 * @see fr.lesboutsdchou.reservations.model.planning.Creneau#toString()
	 */
	@Override
	public String toString() {
		return "CreneauReserve [reservationValidee=" + reservationValidee
				+ ", getId()=" + getId() + ", getEnfant()=" + getEnfant()
				+ ", getFamille()=" + getFamille() + ", getDateHeureDebut()="
				+ getDateHeureDebut() + ", getDateHeureFin()="
				+ getDateHeureFin() + ", getDateReservation()="
				+ getDateReservation() + ", getSemaineReservation()="
				+ getSemaineReservation() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
