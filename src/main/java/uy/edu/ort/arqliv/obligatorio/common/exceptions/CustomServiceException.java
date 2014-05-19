package uy.edu.ort.arqliv.obligatorio.common.exceptions;

import java.rmi.RemoteException;
/**
 * wrapper para excepciones del sistema propias
 * @author rodrigo
 *
 */
public class CustomServiceException extends RemoteException {
	private static final long serialVersionUID = -5999272514326140973L;

	public CustomServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomServiceException() {
		super();
	}

	public CustomServiceException(String s) {
		super(s);
	}

}
