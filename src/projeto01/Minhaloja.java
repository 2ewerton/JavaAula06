package projeto01;

import java.util.Scanner;



public class Minhaloja {

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		
		java.util.Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o modelo do seu carro: ");
		meuCarro.setModelo(sc.nextLine());
		
		System.out.println("Digite o marca do seu carro: ");
		meuCarro.setMarca(sc.nextLine());
		
		System.out.println("Seu carro e da marca " + meuCarro.getMarca() + " e do modelo " 
		+ meuCarro.getModelo());
		
		sc.close();
	}

}
