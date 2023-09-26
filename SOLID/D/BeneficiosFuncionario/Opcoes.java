package BeneficiosFuncionario;

import java.util.Scanner;

public class Opcoes implements OpcoesdeCargo{
	Scanner s =new Scanner(System.in);
private int opcoes;

public void OpcoesCargos() {
	System.out.println("Digite 1 para Estagiario:"+"\n"+
                       "Digite 2 para Caixa: "+"\n"+
			           "Digite 3 para Gerente: ");
	
	this.opcoes = s.nextInt();
}

public Object OpcoesCargo() {
	
	if(opcoes==1) {
		return new Estagiario();
	}
	else if(opcoes==2) {
		
	return new Caixa();
	
	}
	else if(opcoes==3) {
		return new Gerente();
	}
	return null;
	
}
}

