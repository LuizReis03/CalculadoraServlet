package service;

public class CalculaTabuada {
	
	public String calcula(Integer numero) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 10; i++) {
			sb.append(i + "X" + numero + "=" + numero * i);
			sb.append("\n");
		}
		return sb.toString();
	}
	
}
