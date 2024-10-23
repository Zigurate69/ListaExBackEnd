package ListaExBackEnd;

public class Cliente {
	
	private String nome;
	private ContaBancaria conta;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}