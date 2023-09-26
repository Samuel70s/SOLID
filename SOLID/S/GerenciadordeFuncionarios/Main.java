package GerenciadordeFuncionarios;


public class Main {

	public static void main(String[] args) {
		//Instaceamento das classes Cargo , Remuneracao , CargaHoraria
		    CargaHoraria cargaHoraria = new CargaHoraria();
	        Cargo cargo = new Cargo();
	        Remuneracao remuneracao = new Remuneracao();
	             
		//Instanceamento da classe funcionario
	        
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();
        Funcionario funcionario4 = new Funcionario();
        Funcionario funcionario5 = new Funcionario();
        Funcionario funcionario6 = new Funcionario();
        
       
        //Setamento dos funcionarios
        
        funcionario.setNome("Maicon");
        funcionario.setMatricula(218216809);
        funcionario.setSetor("A");
        
        
        funcionario1.setNome("Esrisvaldo");
        funcionario1.setMatricula(575755875);
        funcionario1.setSetor("B");
        
        
        
        funcionario2.setNome("Danilo");
        funcionario2.setMatricula(356478756);
        funcionario2.setSetor("B");
        
        
        
        funcionario3.setNome("Reginaldo");
        funcionario3.setMatricula(246356356);
        funcionario3.setSetor("C");
        
        
        
        funcionario4.setNome("Elisangela");
        funcionario4.setMatricula(287644749);
        funcionario4.setSetor("C");
        
        
        
        funcionario5.setNome("Dalton");
        funcionario5.setMatricula(453473367);
        funcionario5.setSetor("A");
        
        
        
        funcionario6.setNome("Lucas");
        funcionario6.setMatricula(585875755);
        funcionario6.setSetor("C");
        
        
       
        
        
        
        //Instacemento da classe Repassador
        
       Repassador[] repassadors = new Repassador[7];
        
           repassadors[0] = new Repassador();
           repassadors[1] = new Repassador();
           repassadors[2] = new Repassador();
           repassadors[3] = new Repassador();
           repassadors[4] = new Repassador();
           repassadors[5] = new Repassador();
           repassadors[6] = new Repassador();
           
           //Adicionando os dados da classe Repassador  
           // a classe de Lup(Listador)
           
           
       repassadors[0].setNome(funcionario.Nome());
       repassadors[0].setMatricula(funcionario.Matricula());
       repassadors[0].setSetor(funcionario.Setor());
       repassadors[0].setCargaHoraria(cargaHoraria.GerenciaCarga(funcionario));
       repassadors[0].setCargo(cargo.Gerenciador(funcionario));
       repassadors[0].setRemuneração(remuneracao.GerenciaSalario(funcionario));
       
       repassadors[1].setNome(funcionario1.Nome());
       repassadors[1].setMatricula(funcionario1.Matricula());
       repassadors[1].setSetor(funcionario1.Setor());
       
       repassadors[1].setCargaHoraria(cargaHoraria.GerenciaCarga(funcionario1));
       repassadors[1].setCargo(cargo.Gerenciador(funcionario1));
       repassadors[1].setRemuneração(remuneracao.GerenciaSalario(funcionario1));
       
       
       repassadors[2].setNome(funcionario2.Nome());
       repassadors[2].setMatricula(funcionario2.Matricula());
       repassadors[2].setSetor(funcionario2.Setor());
       
       repassadors[2].setCargaHoraria(cargaHoraria.GerenciaCarga(funcionario2));
       repassadors[2].setCargo(cargo.Gerenciador(funcionario2));
       repassadors[2].setRemuneração(remuneracao.GerenciaSalario(funcionario2));
       
       
       repassadors[3].setNome(funcionario3.Nome());
       repassadors[3].setMatricula(funcionario3.Matricula());
       repassadors[3].setSetor(funcionario3.Setor());
       repassadors[3].setCargaHoraria(cargaHoraria.GerenciaCarga(funcionario3));
       repassadors[3].setCargo(cargo.Gerenciador(funcionario3));
       repassadors[3].setRemuneração(remuneracao.GerenciaSalario(funcionario3));
       
       
       repassadors[4].setNome(funcionario4.Nome());
       repassadors[4].setMatricula(funcionario4.Matricula());
       repassadors[4].setSetor(funcionario4.Setor());
       repassadors[4].setCargaHoraria(cargaHoraria.GerenciaCarga(funcionario4));
       repassadors[4].setCargo(cargo.Gerenciador(funcionario4));
       repassadors[4].setRemuneração(remuneracao.GerenciaSalario(funcionario4));
       
       repassadors[5].setNome(funcionario5.Nome());
       repassadors[5].setMatricula(funcionario5.Matricula());
       repassadors[5].setSetor(funcionario5.Setor());
       repassadors[5].setCargaHoraria(cargaHoraria.GerenciaCarga(funcionario5));
       repassadors[5].setCargo(cargo.Gerenciador(funcionario5));
       repassadors[5].setRemuneração(remuneracao.GerenciaSalario(funcionario5));
       
       repassadors[6].setNome(funcionario6.Nome());
       repassadors[6].setMatricula(funcionario6.Matricula());
       repassadors[6].setSetor(funcionario6.Setor());
       repassadors[6].setCargaHoraria(cargaHoraria.GerenciaCarga(funcionario6));
       repassadors[6].setCargo(cargo.Gerenciador(funcionario6));
       repassadors[6].setRemuneração(remuneracao.GerenciaSalario(funcionario6));
       
           
           
       
       //Classe Listador fazendo a função de forecher
       
       Iterator cargos = new Listador(repassadors);
	  
		
   	
   	while(cargos.HashNext()) {
   		Repassador cliente = (Repassador) cargos.Next();
  
   		System.out.println(
   		" Nome: "+ cliente.getNome() + "\n"+
   		" Matricula: "+cliente.getMatricula()+"\n"+
   		" Cargo: " + cliente.getCargo() + "\n"+
   		" Salario: "+cliente.getRemuneração()+"\n"+
   		" Carga Horaria:" +cliente.CargaHoraria()+"\n"+
   		" Setor: "+cliente.getSetor()+"\n"
   		+"----------------------"
   		);
   	}
        
        
        
	}

}
