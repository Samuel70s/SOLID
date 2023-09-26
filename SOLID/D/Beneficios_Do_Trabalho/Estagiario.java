package Beneficios_Do_Trabalho;

public class Estagiario implements Beneficios_Funcionario {
private double remuneracao = 800;
private double vale_alimentacao = 300;
private double vale_transporte = 200;
@Override
public void remuneracao() {
System.out.println("Saldo  Remuneração: "+remuneracao);
	
}
@Override
public void vale_alimentacao() {
System.out.println("Saldo  Vale Alimentação: "+ vale_alimentacao);
	
}
@Override
public void vale_transporte() {
	System.out.println("Saldo  Vale Transporte: "+vale_transporte);
	
}


}
