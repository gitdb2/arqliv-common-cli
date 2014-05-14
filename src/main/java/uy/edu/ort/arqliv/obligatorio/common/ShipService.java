package uy.edu.ort.arqliv.obligatorio.common;

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
	 * 
	 * @param user
	 * @param ship
	 * @return
	 * @throws CustomServiceException
	 */
	public long store(String user, Ship ship) throws CustomServiceException;
	/**
	 * 
	 * @param user
	 * @param ship
	 * @return
	 * @throws CustomServiceException
	 */
	public long update(String user, Ship ship) throws CustomServiceException;
	/**
	 * 
	 * @param user
	 * @param shipId
	 * @throws CustomServiceException
	 */
	public void delete(String user, long shipId) throws CustomServiceException;
	/**
	 * 
	 * @param user
	 * @return
	 * @throws CustomServiceException
	 */
	public List<Ship> list(String user) throws CustomServiceException;
}
