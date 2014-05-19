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
	 * Alta de un contenedor en el sistema
	 * @param user
	 * @param container
	 * @return
	 * @throws CustomServiceException
	 */
	public long store(String user, Container container) throws CustomServiceException;
	
	/**
	 * modificacion, debe contener el id y los cambios
	 * @param user
	 * @param container
	 * @return
	 * @throws CustomServiceException
	 */
	public long update(String user, Container container) throws CustomServiceException;
	
	/**
	 * da de baja un contenedor por id, solo posible si no esta en uso dicho conenedor
	 * @param user
	 * @param id
	 * @throws CustomServiceException
	 */
	public void delete(String user, long id) throws CustomServiceException;
	
	/**
	 * Lista todos los contenedores en el sistema
	 * @param user
	 * @return
	 * @throws CustomServiceException
	 */
	public List<Container> list(String user) throws CustomServiceException;
	
	/**
	 * Obtiene un contenedor por id
	 * @param user
	 * @param id
	 * @return
	 * @throws CustomServiceException
	 */
	public Container find(String user, long id) throws CustomServiceException;
	
}
