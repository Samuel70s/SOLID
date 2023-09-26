package CartãoCredito;

public class Clientes implements Possibilidades{
	
	private String NomeCliente;
	private String Cpf;
	private double saldoInicial = 400; 
	private double valorDeCompras;

	@Override
	public void NomeCliente(String nome) { 
	this.NomeCliente = nome;
		
	}

	@Override
	public void CPF(String cpf) {
		this.Cpf = cpf;
		
	}

	@Override
	public void ValorProduto(double valor) {
		this.valorDeCompras += valor;
		
	}

	@Override
	public String NomeCliente() {

		return NomeCliente;
	}

	@Override
	public String CPF() {
		
		return Cpf;
	}

	@Override
	public double SaldoCliente() {
		
		return saldoInicial-valorDeCompras;
	}

	@Override
	public double ValorProduto() {
		
		return valorDeCompras;
	}

	
}
