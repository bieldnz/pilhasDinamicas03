package controllerP;

import controller.ControllerPilha;

public class ControllerPalindromos {
	
	public String invertePalavra(String palavra) throws Exception {
		
		ControllerPilha pilha = new ControllerPilha();
		int tamanho = palavra.length();
		String novaPalavra = "";
		
		for(int x = 0; x < tamanho; x++) {
			pilha.push(palavra.substring(x, x+1));
		}
		while(!pilha.isEmpty()) {
			novaPalavra += pilha.pop();
		}
		return novaPalavra;
	}
	
	public boolean comparaPalavras(String palavra) throws Exception {
		String novaPalavra = invertePalavra(palavra);
		if(novaPalavra.equals(palavra)) {
			return true;
		}
		return false;
	}
	
}
