package uy.edu.ort.arqliv.obligatorio.common.exceptions;

/**
 * 
 * @author rodrigo
 *
 */
public class CustomNotArrivedThatDateServiceException extends CustomServiceException {
	private static final long serialVersionUID = -5999272513322140973L;

	public CustomNotArrivedThatDateServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomNotArrivedThatDateServiceException() {
		super();
	}

	public CustomNotArrivedThatDateServiceException(String s) {
		super(s);
	}

}
