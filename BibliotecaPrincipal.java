package ListaExBackEnd;

public class BibliotecaPrincipal {

	public static void main(String[] args) {

		Livro livro = new Livro("The Beginning After The End,", " TurtleMe");

		Biblioteca biblioteca = new Biblioteca("Biblioteca de Babel", livro);

		System.out.println("Biblioteca: " + biblioteca.getNome());
		System.out.println("Livro: " + livro.getTitulo() + livro.getAutor());
	}
}