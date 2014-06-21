package uy.edu.ort.arqliv.obligatorio.common.exceptions;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ErrorInfo implements Serializable {
	String message;
	Integer code;
	String url ;

	public ErrorInfo() {
		super();
	}

	public ErrorInfo(String message, Integer code, String url) {
		super();
		this.message = message;
		this.code = code;
		this.url = url;
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

}