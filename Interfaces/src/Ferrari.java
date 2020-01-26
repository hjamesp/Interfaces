
public class Ferrari implements Carro, ItemCarro{

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou `a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou `a direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
		
		
	}

	@Override
	public void abrirPorta() {
		System.out.println("Abriu a porta");
		
	}

	@Override
	public double getPreco() {
		
		return 1000000;
	}
	
	
	

}
