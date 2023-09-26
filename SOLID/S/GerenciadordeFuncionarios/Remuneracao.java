package GerenciadordeFuncionarios;

public class Remuneracao implements Remuneracoes {



public double GerenciaSalario(Pessoa pessoa) {
	if(pessoa.Setor() == "A") {
		return 4000;
	}
	
	else if( pessoa.Setor()=="B") {
	return 2000;
	}
	
	else if(pessoa.Setor() == "C") {
		return 800;
	}
	return 0;
	
}
}
