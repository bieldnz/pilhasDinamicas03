package view;

import javax.swing.JOptionPane;

import controllerP.ControllerPalindromos;

public class Principal {
	public static void main(String[] args) throws Exception {
		
		String palavra = JOptionPane.showInputDialog("Digite uma palavra para verificarmos se é um palindromo");
		ControllerPalindromos palindromos =  new ControllerPalindromos();
		boolean resposta = palindromos.comparaPalavras(palavra);
		if(resposta == true) {
			System.out.println("A palavra digitada é um palindromo");
		}if(!resposta) {
			System.out.println("A palavra digitada nao e um palindromo");
		}
	}
}
