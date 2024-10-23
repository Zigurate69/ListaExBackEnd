package ListaExBackEnd;

public class ContaPrincipal {

	public static void main(String[] args) {

		ContaBancaria contabancaria = new ContaBancaria("Inter", 250);
		Cliente cliente = new Cliente("Romeu");
		System.out.println("cliente: " + cliente.getNome()
		+ "\ncontabancaria: " + contabancaria.getNumero());
	}
}