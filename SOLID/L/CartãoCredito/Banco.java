package CartãoCredito;

public class Banco implements ControledeDados{
	
public void dadosCliente(Possibilidades possibilidades) {
	System.out.println("Nome: "+possibilidades.NomeCliente()+"\n"+
                        "CPF: "+possibilidades.CPF()+"\n"+
			             "Saldo: "+possibilidades.SaldoCliente()+"\n"+
                         "Divida Ativa: "+possibilidades.ValorProduto()+"\n"+
			             "-----------------------");
}
} 
	
	