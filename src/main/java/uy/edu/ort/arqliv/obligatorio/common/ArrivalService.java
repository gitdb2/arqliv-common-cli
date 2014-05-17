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
	 * TODO
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
	 * TODO
	 * @param user
	 * @param id
	 * @throws CustomServiceException
	 */
	public void delete(String user, long id) throws CustomServiceException;
	
	/**
	 * TODO
	 * @param user
	 * @return
	 * @throws CustomServiceException
	 */
	public List<Arrival> list(String user) throws CustomServiceException;
	
	/**
	 * TODO
	 * @param user
	 * @param id
	 * @return
	 * @throws CustomServiceException
	 */
	public Arrival find(String user, long id) throws CustomServiceException;
	
}
