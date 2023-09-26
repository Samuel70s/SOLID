package NotasEscolares;

public class Aluno implements DadosdoAluno{
private String nome;
private double nota;
private long matricula;
private int turma;
@Override
public void setNome(String nome) {
	this.nome = nome;
	
}
@Override
public void setMatricula(long matricula) {
	this.matricula = matricula;
	
}
@Override
public void setNota(double nota) {
	this.nota = nota;
	
}
@Override
public void setTurma(int turma) {
	this.turma = turma;
	
}
@Override
public String AlunoNome() {
	
	return nome;
}
@Override
public long MatriculaAluno() {
	
	return matricula;
}
@Override
public double AlunoNota() {
	
	return nota;
}
@Override
public int AlunoTurma() {
	
	return turma;
}


}
