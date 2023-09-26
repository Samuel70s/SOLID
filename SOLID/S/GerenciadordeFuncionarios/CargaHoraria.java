package GerenciadordeFuncionarios;

public class CargaHoraria implements CargasHorarias {

public String GerenciaCarga(Pessoa pessoa) {
	
if(pessoa.Setor()=="A") {
	return "7:00 Ás 17:00";
}

else if(pessoa.Setor() == "B") {
	return "7:00 Ás 15:00";
}

else if(pessoa.Setor()=="C") {
	return "13:00 Ás 18:00";
}
return null;
}
}

