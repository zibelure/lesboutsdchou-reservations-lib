package fr.lesboutsdchou.reservations.business;

import org.springframework.context.ApplicationContext;

public interface BusinessFactory {
	
	/**
	 * getContext
	 * @return
	 */
	public ApplicationContext getContext();
	
	/**
	 * getAdministrationBusiness
	 * @return
	 */
	public AdministrationBusiness getAdministrationBusiness();
	
	/**
	 * setAdministrationBusiness
	 * @param administrationBusiness
	 */
	public void setAdministrationBusiness(AdministrationBusiness administrationBusiness);

	/**
	 * getReservationBusiness
	 * @return
	 */
	public ReservationBusiness getReservationBusiness();
	
	/**
	 * setReservationBusiness
	 * @param reservationBusiness
	 */
	public void setReservationBusiness(ReservationBusiness reservationBusiness);

}
