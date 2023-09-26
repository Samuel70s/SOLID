package Estacionamento;

public class Estacionamento {

	public static void main(String[] args) {
		EstacionamentoGratls estacionamentoGratls = new EstacionamentoGratls();
		EstacionamentoPag0 estacionamentoPag0 = new EstacionamentoPag0();
		ListaPago listaPago = new ListaPago();
		LlstaGratis gratis = new LlstaGratis();
		estacionamentoPag0.NumerodeVagas();
		estacionamentoPag0.AdicionarCarro();
		estacionamentoPag0.HorasEstacionado(7);
		estacionamentoPag0.ValorTaxa();
		estacionamentoPag0.PagarTaxa();
		estacionamentoPag0.PagarTaxa();
		
		listaPago.ListagemPaga(estacionamentoPag0);
		
		estacionamentoGratls.Numerodevagas();
		estacionamentoGratls.AdicionarCarro();
		estacionamentoGratls.HorasEstacionado(5);
		estacionamentoGratls.HorasEstacionados();
		
		gratis.ListaGratis(estacionamentoGratls);
		
		
		

	}

}
