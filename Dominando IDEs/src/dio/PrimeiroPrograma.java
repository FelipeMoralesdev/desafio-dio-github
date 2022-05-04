package dio;

import dio.model.Gato;

//Explorando diferentes IDEs

public class PrimeiroPrograma {
	public static void main(String[] args) {
		
		Gato gato = new Gato("Agata", "Tartaruga", 8);
		Livros livro = new Livros();
		System.out.println("Olá Mundo!");
		
		System.out.println(gato);
		System.out.println(livro);
		
	}
}

class Livros{
	private String nome;
	private String npag;
}

