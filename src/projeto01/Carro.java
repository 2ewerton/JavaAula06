package projeto01;

public class Carro {
	
	private String cor; 
	private String marca;
	private String modelo;
	private String placa;
	private String combustivel;
	private boolean movimento;
	private boolean ligado;
	
	
	void acelerar() {
		if (this.ligado) {
			this.movimento = true;
		}else {
			this.movimento = false;
		}
	}
	
	
	void freiar() {
		this.movimento = false;
	}
	
	
	void ligar() {
		this.ligado = true;
	}
	
	
	void desligar() {
		this.ligado = false;
		
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getPlaca() {
		if(this.placa!=null) {
		return placa;
		}else {
			return "xxx1x1111";
		}
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getCombustivel() {
		return combustivel;
	}


	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}


	public boolean isMovimento() {
		return movimento;
	}


	public void setMovimento(boolean movimento) {
		this.movimento = movimento;
	}


	public boolean isLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
}
