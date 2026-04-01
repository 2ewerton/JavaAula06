package projeto01;

public class Carro extends Veiculo {
	

	public Carro () {
		
	}
	
	public Carro (String cor, String marca, String modelo, String combustivel, boolean ligado, Integer peso, boolean movimento, String placa) {
		
		super(cor, marca, modelo, combustivel, ligado, peso);
		this.movimento = movimento;
		this.placa = placa;
		
		
	}
	
	private String placa;
	private boolean movimento;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public boolean isMovimento() {
		return movimento;
	}
	public void setMovimento(boolean movimento) {
		this.movimento = movimento;
	}
	
	
}
