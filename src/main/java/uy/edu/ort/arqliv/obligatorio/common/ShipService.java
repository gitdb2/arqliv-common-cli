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
	 * Alta de barco
	 * @param user
	 * @param ship
	 * @return
	 * @throws CustomServiceException
	 */
	public long store(String user, Ship ship) throws CustomServiceException;
	
	/**
	 * Actualiza la informacion de un barco para una determinada 
	 * fecha (regla de negocio: no se puede modificar la capacidad de 
	 * un barco si no arribo al puerto en essa fecha)
	 * @param user
	 * @param ship
	 * @param arrivalDate
	 * @return
	 * @throws CustomServiceException
	 */
	public long update(String user, Ship ship, Date arrivalDate) throws CustomServiceException;
	/**
	 * Baja de barco por id, requiere que el barcon no este en uso por ningun arrival 9en cyuo caso tira excepcion)
	 * @param user
	 * @param shipId
	 * @throws CustomServiceException
	 */
	public void delete(String user, long shipId) throws CustomServiceException;
	/**
	 * LIsta los barcos del sistema
	 * @param user
	 * @return
	 * @throws CustomServiceException
	 */
	public List<Ship> list(String user) throws CustomServiceException;
	
	/**
	 * obtiene un barco a partir de su id
	 * @param user
	 * @param shipId
	 * @return
	 * @throws CustomServiceException
	 */
	public Ship find(String user, long shipId) throws CustomServiceException;
	
}
