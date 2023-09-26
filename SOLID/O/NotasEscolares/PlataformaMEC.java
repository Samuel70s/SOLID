package NotasEscolares;

public class PlataformaMEC {

	public static void main(String[] args) {
		Professor professor = new Professor();
		Aluno aluno = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		aluno.setNome("Nicolas");
		aluno.setMatricula(128984113-8);
		aluno.setTurma(3001);
		aluno.setNota(4);
		
		professor.LançarNota(aluno);
		
		aluno2.setNome("Maria Edurarda");
		aluno2.setMatricula(913693826-1);
		aluno2.setTurma(2002);
        aluno2.setNota(8);
        
        professor.LançarNota(aluno2 );
        
        aluno3.setNome("Jamilly");
        aluno3.setMatricula(732091707-9);
        aluno3.setTurma(1001);
        aluno3.setNota(10);
      
        professor.LançarNota(aluno3);
        
	}

}
