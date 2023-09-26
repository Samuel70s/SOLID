package Cinema;

public class RepassadordeIngresso2D implements RepassarIngresso_2D{

	@Override
	public void Ingresso_2D(Ingresso2D ingresso2d) {
		System.out.println("Valor Do Ingresso: "+ingresso2d.ValorIngresso()+"\n"+
	                        "Seu assento: "+ingresso2d.assentoCliente()+"\n"+
				            "Valor para ser pago: "+ingresso2d.FaturaIngresso()+"\n"+
				            "------------------------");
		
	}

}
