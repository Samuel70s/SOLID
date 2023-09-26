package GerenciadordeFuncionarios;

public class Cargo implements Cargos  {

	public String Gerenciador(Pessoa pessoa) {
	if( pessoa.Setor()=="A") {
		return "Gerencia do Banco";
	}
	else if(pessoa.Setor() == "B") {
		return "Caixa do Banco";
	}
	
	else if(pessoa.Setor() == "C") {
		return "Estagiario";
	}
	return null;
	}

	
}
