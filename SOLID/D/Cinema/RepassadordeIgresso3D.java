package Cinema;

public class RepassadordeIgresso3D implements RepassarIngresso_3D{

	@Override
	public void Ingresso_3D(Ingresso3D ingresso3d) {
		System.out.println("Valor Do Ingresso: "+ingresso3d.ValorIngresso()+"\n"+
                "Seu assento: "+ingresso3d.assentoCliente()+"\n"+
				"Valor para ser pago: "+ingresso3d.FaturaIngresso()+"\n"+
	            "------------------------");

		
	}

}
