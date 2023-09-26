package GerenciadordeFuncionarios;

public class Teste {
public static void main(String args[]) {
	Repassador repassador = new Repassador();
	Ferias ferias  = new Ferias();
	ferias.setDatadeferias("C");
	System.out.println(repassador.getDataFerias());
}
}
