package projeto01;

public abstract class Veiculo {

	private String cor; 
	private String marca;
	private String modelo;
	private String combustivel;
	private boolean ligado;
	private Integer peso;
	
	public Veiculo () {
		
	}
	
	public Veiculo (String cor, String marca, String modelo, String combustivel, boolean ligado, Integer peso) {

		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
		this.combustivel = combustivel;
		this.peso = peso;
		
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
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

}
