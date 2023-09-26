package Estacionamento;

public class EstacionamentoGratls implements EstacionamentoGratis {
private int NumerodevagasDisponiveis = 10;
private int NumerosdeHoras;
	@Override
	public int Numerodevagas() {
		
		return NumerodevagasDisponiveis;
	}

	@Override
	public void HorasEstacionado(int horas) {
		this.NumerosdeHoras = horas;
		
	}

	@Override
	public void RetiraCarro() {
		this.NumerodevagasDisponiveis-=1;
		
	}

	@Override
	public void AdicionarCarro() {
	this.NumerodevagasDisponiveis+=1;
		
	}

	@Override
	public int HorasEstacionados() {
		
		return NumerosdeHoras;
	}


}
