package uy.edu.ort.arqliv.obligatorio.common.exceptions;

/**
 * 
 * @author rodrigo
 *
 */
public class CustomInUseServiceException extends CustomServiceException {
	private static final long serialVersionUID = -5999272513336140973L;

	public CustomInUseServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomInUseServiceException() {
		super();
	}

	public CustomInUseServiceException(String s) {
		super(s);
	}

}
