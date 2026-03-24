package projeto01;

public class MeucarroTeste {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro carro01 = new Carro();
		Carro carro02 = new Carro();
		Carro carro03 = new Carro();
		
		carro01.setMarca("vw");
		carro01.setModelo("golf");
		carro01.setCor("preto");
		carro01.setPlaca("oxe2666");
		carro01.setCombustivel("flex");
		
		carro02.setMarca("toyota");
		carro02.setModelo("carolla");
		carro02.setCor("branco");
		carro02.setPlaca("xei2026");
		carro02.setCombustivel("flex");
		
		carro03.setMarca("vw");
		carro03.setModelo("virtus");
		carro03.setCor("branco");
		carro03.setPlaca("taok2026");
		carro03.setCombustivel("flex");
		
		System.out.println("carros do meu estoque: " +
							carro01.modelo + ", " +
							carro02.modelo + ", " +
							carro03.modelo
				);
		
	}
	
}
