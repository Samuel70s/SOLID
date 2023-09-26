package NotasEscolares;

public class Professor implements PegarNotaProfessor{

	@Override
	public void LançarNota(DadosdoAluno aluno) {
           
		System.out.println("Nome: "+aluno.AlunoNome()+"\n"+
                "Matricula: "+aluno.MatriculaAluno()+"\n"+
	            "Turma: "+aluno.AlunoTurma()+"\n"+
                "Nota: "+aluno.AlunoNota()+"\n"
                +"------------------------");
		        
		         
		
	}

	
	
	
	
	
	
	}

	

	

