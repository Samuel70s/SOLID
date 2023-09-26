package Estacionamento;

public class ListaPago implements Llsta_Pago  {

	@Override
	public void ListagemPaga(EstacionamentoPago estacionamentoPago) {
		System.out.println("*Estacionamento  Pago*"+"\n"+"\n"+"Numero de Vagas: " +estacionamentoPago.NumerodeVagas()+"\n"+
	                        "Valor da Taxa: " + estacionamentoPago.ValorTaxa()+"\n"+
				             "Valor em debito: "+estacionamentoPago.ValoremDebito()+"\n"+
	                       "-==-=-=-=-=-=-=-=-=-=-=-=-=-="   );
		
	}

}
