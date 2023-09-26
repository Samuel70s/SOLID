package Estacionamento;

public class EstacionamentoPag0 implements EstacionamentoPago {
private int NumerodeVagas =10;
private int horasEstacionado;
private double valorHora = 5;
private double ValorDebito;

	@Override
	public void PagarTaxa() {
       this.ValorDebito -= (valorHora*horasEstacionado);
		
	}

	@Override
	public void HorasEstacionado(int horas) {
		this.horasEstacionado = horas;
		
	}

	@Override
	public void RetiraCarro() {
		this.NumerodeVagas+=1;
		
	}

	@Override
	public void AdicionarCarro() {
	this.NumerodeVagas -=1;
		
	}

	@Override
	public double ValorTaxa() {
		this.ValorDebito +=(valorHora*horasEstacionado);
		
		return (valorHora*horasEstacionado);
	}

	@Override
	public int NumerodeVagas() {
	
		return NumerodeVagas;
	}

	@Override
	public double ValoremDebito() {
		
		return ValorDebito;
	}

}
