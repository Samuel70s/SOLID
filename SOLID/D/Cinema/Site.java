package Cinema;

public class Site {

	public static void main(String[] args) {
		Igreso2D igreso2d = new Igreso2D();
		Ingreso3D ingreso3d = new Ingreso3D();
		
		
		RepassadordeIngresso2D repassadordeIngresso2D = new RepassadordeIngresso2D();
		RepassadordeIgresso3D igresso3d = new  RepassadordeIgresso3D();
		
		
		igreso2d.Assento("H1");
		igreso2d.ValorIngresso();
		igreso2d.FaturaIngresso();
        igreso2d.PagarIngresso();
        
        repassadordeIngresso2D.Ingresso_2D(igreso2d);
        
        
        
        ingreso3d.Assento("J2");
        ingreso3d.assentoCliente();
        ingreso3d.ValorIngresso();
        ingreso3d.FaturaIngresso();
        ingreso3d.PagarIngresso();
        
        igresso3d.Ingresso_3D(ingreso3d);
        
	}

}
