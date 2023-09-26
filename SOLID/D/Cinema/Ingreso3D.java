package Cinema;

public class Ingreso3D implements Ingresso3D{
	private double valordoEmgressso = 30;
	private double valorFatura = 30;
	private String Clienteassento;

	@Override
	public void PagarIngresso() {
		this.valorFatura-=30;
		
	}

	@Override
	public double ValorIngresso() {
		
		return valordoEmgressso;
	}

	@Override
	public void Assento(String assento) {
		this.Clienteassento = assento;
		
	}

	@Override
	public String assentoCliente() {
	
		return Clienteassento;
	}

	@Override
	public double FaturaIngresso() {
		
		return valorFatura;
	}

}
