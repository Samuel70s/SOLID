package Cinema;

public class Igreso2D implements Ingresso2D{
private double valordongresso = 24;
private double faturaIngresso = 24;
private String Asssentoescolido;

@Override
public void PagarIngresso() {
	this.faturaIngresso -=24;
	
}

@Override
public double ValorIngresso() {
	
	return valordongresso;
}

@Override
public void Assento(String assento) {
	this.Asssentoescolido = assento;
	
}

@Override
public String assentoCliente() {
	
	return Asssentoescolido;
}

@Override
public double FaturaIngresso() {
	
	return faturaIngresso;
}

}
