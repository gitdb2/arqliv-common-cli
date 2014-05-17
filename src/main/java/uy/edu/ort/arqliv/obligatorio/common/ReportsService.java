package uy.edu.ort.arqliv.obligatorio.common;

import java.util.List;

import uy.edu.ort.arqliv.obligatorio.common.exceptions.CustomServiceException;
import uy.edu.ort.arqliv.obligatorio.dominio.Arrival;

public interface ReportsService {

	/**
	 * 
	 * @param user
	 * @param month
	 * @return
	 * @throws CustomServiceException
	 */
	public List<Arrival> arrivalsByMonth(String user, int month) throws CustomServiceException;
	
	/**
	 * 
	 * @param user
	 * @param month
	 * @param shipId
	 * @return
	 * @throws CustomServiceException
	 */
	public List<Arrival> arrivalsByMonthByShip(String user, int month, Long shipId) throws CustomServiceException;
	
}
