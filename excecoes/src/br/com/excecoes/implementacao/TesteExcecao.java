package br.com.excecoes.implementacao;

import javax.management.RuntimeErrorException;

public class TesteExcecao {

	public static void main(String[] args) {
		// Exce��es: n�o s�o controladas pelo programador.
		// Ecistem dois tipos:
		// A-) Checked: o Java verifica antes da compila��o
		// B-) Unchecked: s� ocorre ap�s a compila��o
		try {
			int numero = Integer.parseInt("70");
			System.out.println("Resultado " + numero * 10);

			String email =null;
			if (email==null) {
				throw new RuntimeException("Dado corrompido");
			}
			System.out.println("Usu�rio: " + email.substring(0, email.indexOf("@")));

		}catch (NullPointerException e) {
			System.out.println("Objeto nulo");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Coordenada inv�lido");
		}catch(NumberFormatException e) {
			System.out.println("N�mero inv�lido");
		}catch(Exception e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
		}finally {
			System.out.println("At� logo");
		}
	}

}
