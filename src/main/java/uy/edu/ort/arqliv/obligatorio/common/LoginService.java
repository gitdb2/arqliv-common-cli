package uy.edu.ort.arqliv.obligatorio.common;

import uy.edu.ort.arqliv.obligatorio.common.exceptions.CustomServiceException;
/**
 * 
 * @author rodrigo
 *
 */
public interface LoginService {
	
	/**
	 * 
	 * @param user
	 * @param password
	 * @return
	 * @throws CustomServiceException
	 */
	public boolean login(String user, String password) throws CustomServiceException;
}
