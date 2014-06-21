package uy.edu.ort.arqliv.obligatorio.common.exceptions;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ErrorInfo implements Serializable {
	String message;
	Integer code;
	String url ;
	String exceptionClassName;

	public ErrorInfo() {
		super();
	}

	public ErrorInfo(String message, Integer code, String url, String exceptionClassName) {
		super();
		this.message = message;
		this.code = code;
		this.url = url;
		this.exceptionClassName = exceptionClassName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getExceptionClassName() {
		return exceptionClassName;
	}

	public void setExceptionClassName(String exceptionClassName) {
		this.exceptionClassName = exceptionClassName;
	}

	@Override
	public String toString() {
		return "ErrorInfo [message=" + message + ", code=" + code + ", url="
				+ url + ", exceptionClassName=" + exceptionClassName + "]";
	}
	
	
	
}