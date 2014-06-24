package uy.edu.ort.arqliv.obligatorio.common;

import java.util.List;

import uy.edu.ort.arqliv.obligatorio.common.exceptions.CustomServiceException;
import uy.edu.ort.arqliv.obligatorio.dominio.Departure;
/**
 * 
 * @author rodrigo
 *
 */
public interface DepartureService {
	
	/**
	 * Alta de Departure en el sistema
	 * Metodo synchronized para que no se pueda dar de alta a la vez dos partidas y poder controlar los contenedores
	 * @param user
	 * @param shipId
	 * @param arrivalId TODO
	 * @param Departure
	 * @param containerIdList
	 * @return
	 * @throws CustomServiceException
	 */
	long store(String user, Departure departure, Long shipId,
			List<Long> containerList, Long arrivalId) throws CustomServiceException;
	
	/**
	 * Actualizacion de Departure, se debe proveer un Departure completo , con id, y cambios en atributos, el id del nuevo
	 * barco (si no cambia poner el del original), y la lista de ids de contenedores a 
	 * asignar ( si no cambia, se debe enviar la lista original)
	 * metodo synchronized al igual que el alta.
	 * @param user
	 * @param departure
	 * @param shipId
	 * @param containerList
	 * @param arrivalId TODO
	 * @return
	 * @throws CustomServiceException
	 */
	long update(String user, Departure departure, Long shipId,
			List<Long> containerList, Long arrivalId) throws CustomServiceException;
	
	/**
	 * Baja de un Departure
	 * @param user
	 * @param id
	 * @throws CustomServiceException
	 */
	public void delete(String user, long id) throws CustomServiceException;
	
	/**
	 * Listado de todos los Departure en el sistema (eaguer fetch)
	 * @param user
	 * @return
	 * @throws CustomServiceException
	 */
	public List<Departure> list(String user) throws CustomServiceException;
	
	/**
	 * Obtiene un Departure por id (eaguer fetch)
	 * @param user
	 * @param id
	 * @return
	 * @throws CustomServiceException
	 */
	public Departure find(String user, long id) throws CustomServiceException;
	
}
