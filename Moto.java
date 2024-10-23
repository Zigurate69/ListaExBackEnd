package ListaExBackEnd;

public class Moto extends Brinquedo {

	public Moto(String cor, String tipo, int velocidade, String nome) {
		super(cor,tipo,velocidade,nome);
	}
	@Override
	public void Mover(){
		System.out.println("Zerinho que raspa a placa");
	}
}