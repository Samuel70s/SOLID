package GerenciadordeSalario;

public class Caixa {

	public static void main(String[] args) {
		
		Estagiario estagiario = new Estagiario();
		FuncionarioCLT funcionarioCLT = new FuncionarioCLT();
		FuncionarioPJ funcionarioPJ = new FuncionarioPJ();
		
		FolhaSalarial folhaSalarial = new FolhaSalarial();
		
		folhaSalarial.Pagamento(funcionarioPJ);
		folhaSalarial.saldoSalario();
		
		folhaSalarial.Pagamento(funcionarioCLT);
		folhaSalarial.saldoSalario();
		
        folhaSalarial.Pagamento(estagiario);
        folhaSalarial.saldoSalario();
	}

}
