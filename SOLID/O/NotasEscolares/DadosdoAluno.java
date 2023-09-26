package NotasEscolares;

public interface DadosdoAluno  {
public void setNome(String nome);
public void setMatricula(long matricula);
public void setNota(double nota);
public void setTurma(int turma);


public String AlunoNome();
public long MatriculaAluno();
public double AlunoNota();
public int AlunoTurma();

}
