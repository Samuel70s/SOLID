package CartãoCredito;

import java.sql.SQLClientInfoException;

public class Cartões {

	public static void main(String[] args) {
   Banco banco = new Banco();
   Clientes cliente = new Clientes();
   Clientes cliente2 = new Clientes();
   Clientes cliente3 = new Clientes();
   
   cliente.NomeCliente("Samuel");
   cliente.CPF("172.457.346-92");
   cliente.ValorProduto(33);
   cliente.ValorProduto(44);
   cliente.ValorProduto(80);
   
   banco.dadosCliente(cliente);
   
   cliente2.NomeCliente("Lucas");
   cliente2.CPF("145.135.830-93");
   cliente2.ValorProduto(78);
   cliente2.ValorProduto(99);
   cliente2.ValorProduto(34);
   
   banco.dadosCliente(cliente2);
   
   cliente3.NomeCliente("Darlon");
   cliente3.CPF("192.929.832-92");
   cliente3.ValorProduto(95);
   cliente3.ValorProduto(92);
   cliente3.ValorProduto(34);
   
   banco.dadosCliente(cliente3);
	}

}
