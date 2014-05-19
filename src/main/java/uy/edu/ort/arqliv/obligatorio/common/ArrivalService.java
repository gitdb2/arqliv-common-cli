package uy.edu.ort.arqliv.obligatorio.common;

import java.util.List;

import uy.edu.ort.arqliv.obligatorio.common.exceptions.CustomServiceException;
import uy.edu.ort.arqliv.obligatorio.dominio.Arrival;
/**
 * 
 * @author rodrigo
 *
 */
public interface ArrivalService {
	
	/**
	 * Alta de Arrival en el sistema
	 * metodo synchronized para que no se pueda dar de alta a la vez dos arribos y poder controlar los contenedores
	 * @param user
	 * @param arrival
	 * @param shipId
	 * @param containerIdList
	 * @return
	 * @throws CustomServiceException
	 */
	long store(String user, Arrival arrival, Long shipId,
			List<Long> containerList) throws CustomServiceException;
	
	/**
	 * Actualizacion de arrival, se debe proveer un arrival completo , con id, y cambios en atributos, el id del nuevo
	 * barco (si no cambia poner el del original), y la lista de ids de contenedores a 
	 * asignar ( si no cambia, se debe enviar la lista original)
	 * metodo synchronized al igual que el alta.
	 * @param user
	 * @param arrival
	 * @param shipId
	 * @param containerList
	 * @return
	 * @throws CustomServiceException
	 */
	long update(String user, Arrival arrival, Long shipId,
			List<Long> containerList) throws CustomServiceException;
	
	/**
	 * Baja de un arrival
	 * @param user
	 * @param id
	 * @throws CustomServiceException
	 */
	public void delete(String user, long id) throws CustomServiceException;
	
	/**
	 * Listado de todos los arrival en el sistema (eaguer fetch)
	 * @param user
	 * @return
	 * @throws CustomServiceException
	 */
	public List<Arrival> list(String user) throws CustomServiceException;
	
	/**
	 * Obtiene un arrival por id (eaguer fetch)
	 * @param user
	 * @param id
	 * @return
	 * @throws CustomServiceException
	 */
	public Arrival find(String user, long id) throws CustomServiceException;
	
}
