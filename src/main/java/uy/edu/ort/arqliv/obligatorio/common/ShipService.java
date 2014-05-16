package uy.edu.ort.arqliv.obligatorio.common;

import java.util.Date;
import java.util.List;

import uy.edu.ort.arqliv.obligatorio.common.exceptions.CustomServiceException;
import uy.edu.ort.arqliv.obligatorio.dominio.Ship;
/**
 * 
 * @author rodrigo
 *
 */
public interface ShipService {
	
	/**
	 * TODO
	 * @param user
	 * @param ship
	 * @return
	 * @throws CustomServiceException
	 */
	public long store(String user, Ship ship) throws CustomServiceException;
	
	/**
	 * TODO
	 * @param user
	 * @param ship
	 * @param arrivalDate
	 * @return
	 * @throws CustomServiceException
	 */
	public long update(String user, Ship ship, Date arrivalDate) throws CustomServiceException;
	/**
	 * TODO
	 * @param user
	 * @param shipId
	 * @throws CustomServiceException
	 */
	public void delete(String user, long shipId) throws CustomServiceException;
	/**
	 * TODO
	 * @param user
	 * @return
	 * @throws CustomServiceException
	 */
	public List<Ship> list(String user) throws CustomServiceException;
	
	/**
	 * TODO
	 * @param user
	 * @param shipId
	 * @return
	 * @throws CustomServiceException
	 */
	public Ship find(String user, long shipId) throws CustomServiceException;
	
}
