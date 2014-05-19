package uy.edu.ort.arqliv.obligatorio.common;

import java.util.List;

import uy.edu.ort.arqliv.obligatorio.common.exceptions.CustomServiceException;
import uy.edu.ort.arqliv.obligatorio.dominio.Arrival;

public interface ReportsService {

	/**
	 *  Retorna los arrivals que para un mes (1 Enero)
	 * @param user
	 * @param month
	 * @return
	 * @throws CustomServiceException
	 */
	public List<Arrival> arrivalsByMonth(String user, int month) throws CustomServiceException;
	
	/**
	 * Lista los arrivals filtrando por me y por id barco
	 * @param user
	 * @param month
	 * @param shipId
	 * @return
	 * @throws CustomServiceException
	 */
	public List<Arrival> arrivalsByMonthByShip(String user, int month, Long shipId) throws CustomServiceException;
	
}
