package uy.edu.ort.arqliv.obligatorio.common;

import java.util.List;

import uy.edu.ort.arqliv.obligatorio.common.exceptions.CustomServiceException;
import uy.edu.ort.arqliv.obligatorio.dominio.Container;
/**
 * 
 * @author rodrigo
 *
 */
public interface ContainerService {
	
	/**
	 * TODO
	 * @param user
	 * @param container
	 * @return
	 * @throws CustomServiceException
	 */
	public long store(String user, Container container) throws CustomServiceException;
	
	/**
	 * TODO
	 * @param user
	 * @param container
	 * @return
	 * @throws CustomServiceException
	 */
	public long update(String user, Container container) throws CustomServiceException;
	
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
	public List<Container> list(String user) throws CustomServiceException;
	
	/**
	 * TODO
	 * @param user
	 * @param id
	 * @return
	 * @throws CustomServiceException
	 */
	public Container find(String user, long id) throws CustomServiceException;
	
}
