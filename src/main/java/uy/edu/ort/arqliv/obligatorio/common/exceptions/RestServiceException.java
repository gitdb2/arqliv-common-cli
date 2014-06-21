package uy.edu.ort.arqliv.obligatorio.common.exceptions;

@SuppressWarnings("serial")
public class RestServiceException extends RuntimeException {

	private Integer code = -1;

	public RestServiceException() {
		super();
	}

	public RestServiceException(Integer code) {
		this();
		this.code = code;
	}

	public RestServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public RestServiceException(String message, Integer code, Throwable cause) {
		this(message, cause);
		this.code = code;
	}

	public RestServiceException(String message) {
		super(message);
	}

	public RestServiceException(String message, Integer code) {
		this(message);
		this.code = code;
	}

	public RestServiceException(Throwable cause) {
		super(cause);
	}

	public RestServiceException(Integer code, Throwable cause) {
		this(cause);
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}