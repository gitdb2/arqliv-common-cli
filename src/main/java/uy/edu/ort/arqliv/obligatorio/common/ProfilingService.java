package uy.edu.ort.arqliv.obligatorio.common;

import java.util.Date;
import java.util.List;

import uy.edu.ort.arqliv.obligatorio.common.exceptions.CustomServiceException;
import uy.edu.ort.arqliv.obligatorio.dominio.Pair;
/**
 * 
 * @author rodrigo
 *
 */
public interface ProfilingService {
	
	/**
	 * 
	 * @param user
	 * @param forDate
	 * @return
	 */
	public List<Pair<String, Double>> avgServiceTime(String user, Date forDate) throws CustomServiceException;

	/**
	 * 
	 * @param user
	 * @param forDate
	 * @return
	 */
	public List<Pair<String, Long>> minServiceTime(String user, Date forDate) throws CustomServiceException;
	
	/**
	 * 
	 * @param user
	 * @param forDate
	 * @return
	 * @throws CustomServiceException
	 */
	public List<Pair<String, Long>> maxServiceTime(String user, Date forDate) throws CustomServiceException;
	
}
