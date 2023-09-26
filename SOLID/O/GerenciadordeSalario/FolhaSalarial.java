package GerenciadordeSalario;

public class FolhaSalarial {
protected Remuneracao saldo;
public void  Pagamento(Remuneracao funcionario) {
	this.saldo = funcionario;
}
public void saldoSalario() {
	System.out.println("Seu saldo salarial : "+saldo.remuneracao());
}
}
