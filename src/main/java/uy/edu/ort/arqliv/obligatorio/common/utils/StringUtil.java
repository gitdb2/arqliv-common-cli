package uy.edu.ort.arqliv.obligatorio.common.utils;

public class StringUtil {

	/**
	 * Toma el string inputString y si es mas largo  que MAX_CHAR, quita 3 caracteres al string y agrega "..." al final
	 * MAX_CHAR es <= 3 no quita nada
	 * @param inputString
	 * @param MAX_CHAR
	 * @return
	 */
	public static String cutString(String inputString, int MAX_CHAR){
		int maxLength = (inputString.length() < MAX_CHAR)? inputString.length(): MAX_CHAR;
		boolean dots = inputString.length() > MAX_CHAR && MAX_CHAR > 3;
//		if(MAX_CHAR<= 3){
//			return inputString.substring(0, maxLength);
//		}else{
			return inputString.substring(0, (dots? (maxLength-3) : maxLength)) + ((dots) ? "..." : "");
//		}
	}
}
