package ListaExBackEnd;

public class BrinquedoPrincipal {

	public static void main(String[] args) {

		Carro mclaren = new Carro ("Roxo","Controle Remoto",340,"McLaren Senna");
		System.out.println("CARRO: ");
		System.out.println(mclaren.getCor());
		System.out.println(mclaren.getTipo());
		System.out.println(mclaren.getNome());
		System.out.println(mclaren.getVelocidade());
		mclaren.Mover();

		System.out.println("");

		Moto harley = new Moto ("Preto","Controle Remoto",220,"Heritage Classic");
		System.out.println("MOTO: ");
		System.out.println(harley.getCor());
		System.out.println(harley.getTipo());
		System.out.println(harley.getNome());
		System.out.println(harley.getVelocidade());
		harley.Mover();

		System.out.println("");

		Navio francisco = new Navio ("Branco","Controle Remoto",107,"HSC Francisco");
		System.out.println("NAVIO: ");
		System.out.println(francisco.getCor());
		System.out.println(francisco.getTipo());
		System.out.println(francisco.getNome());
		System.out.println(francisco.getVelocidade());
		francisco.Mover();
	}
}