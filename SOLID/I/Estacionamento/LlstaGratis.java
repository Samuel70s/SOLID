package Estacionamento;

public class LlstaGratis  implements  Lista_Gratis {

	@Override
	public void ListaGratis(EstacionamentoGratis estacionamentoGratis) {
		System.out.println("*Estacionamento Gratis*"+"\n"+"\n"+"Numero de Vagas: "+estacionamentoGratis.Numerodevagas()+"\n"+
	                        "Horas Estacionados: " + estacionamentoGratis.HorasEstacionados()+"\n"+
				             "-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-");
		
	}

}
