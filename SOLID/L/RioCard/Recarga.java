package RioCard;

public class Recarga implements Passagem , TiposdeTranporte {
	
private double valorRecarga = 229 ;

@Override
public void Recaregar(double d) {
	this.valorRecarga +=d;
	
}

@Override
public void Saldocartão() {
 System.out.println(valorRecarga);
	
}




@Override
public void Onibus() {
	this.valorRecarga-=5;
	
}




@Override
public void Trem() {
	this.valorRecarga-=7;
	
}




@Override
public void Metro() {
	this.valorRecarga-=6;
	
}
		

}
