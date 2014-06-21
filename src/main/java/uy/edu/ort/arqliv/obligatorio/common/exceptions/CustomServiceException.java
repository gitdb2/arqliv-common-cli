package uy.edu.ort.arqliv.obligatorio.common.exceptions;

/**
 * wrapper para excepciones del sistema propias
 * @author rodrigo
 *
 */
public class CustomServiceException extends RuntimeException {
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
