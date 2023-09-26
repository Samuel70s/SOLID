package Beneficios_Do_Trabalho;

public class O_Funcionario_Tipo implements Funcionario_Tipo {

	@Override
	public void Tipo__Funcionario(Beneficios_Funcionario beneficios_Funcionario) {
		beneficios_Funcionario.remuneracao();
		beneficios_Funcionario.vale_alimentacao();
		beneficios_Funcionario.vale_transporte();
		
	}

}
