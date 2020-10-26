package variaveis;

public class ManipulaString {
	
	public static void main(String[] args) {
	
		String email = "weslley@teste.com.br";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtde de caracteres: " + email.length());
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Exibir do 2� at� o 4�: " + email.substring(1,4));
		System.out.println("So 3� em diante: " + email.substring(2));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		// Exibir o usu�rio do email
		System.out.println("Exibir depois do @: " + email.substring(email.indexOf("@")+1));
		System.out.println("Exibir antes do @: " + email.substring(0,email.indexOf("@")));
		System.out.println("Primeiro Caracter: " + email.charAt(4));
		System.out.println("Comparando com == " + (email.equals("x@x.com.br")));
		System.out.println("Compara��o ignorando caixa: " + email.equalsIgnoreCase("X@x.com.br"));
		
}
}
