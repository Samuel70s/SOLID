package Beneficios_Do_Trabalho;

public class GERENTE implements Beneficios_Funcionario{
	private double remuneracao = 4000;
	private double vale_alimentacao = 950;
	private double vale_transporte = 400;
	@Override
	public void remuneracao() {
		System.out.println("Saldo  Remunerção: "+remuneracao);
		
		
	}
	@Override
	public void vale_alimentacao() {
		System.out.println("Saldo Vale Alimentação: "+ vale_alimentacao);
		
	}
	@Override
	public void vale_transporte() {
		System.out.println("Saldo Vale Transporte: " + vale_transporte);
		
	}


}
