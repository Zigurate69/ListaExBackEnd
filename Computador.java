package ListaExBackEnd;

public class Computador {
	
	private String modelo;
	private Processador processador;
	
	public Computador(String modelo, String marcaProcessador, String frequenciaProcessador) {
		this.modelo = modelo;
		this.processador = new Processador(marcaProcessador, frequenciaProcessador);
	}
	public void exibirInfo() {
		System.out.println("Modelo do Computador: " + modelo);
		System.out.println("Processador: " + processador.getMarca() + " - " + processador.getFrequencia());
	}
}