package ListaExBackEnd;

public class Navio extends Brinquedo {
	
	public Navio(String cor, String tipo, int velocidade, String nome) {
		super(cor,tipo,velocidade,nome);
	}
	@Override
	public void Mover(){
		System.out.println("Navegando");
	}
}