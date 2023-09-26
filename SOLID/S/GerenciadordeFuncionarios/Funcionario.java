package GerenciadordeFuncionarios;

public class Funcionario extends Pessoa {
private String nome;
private String setor;
private long matricula;

	@Override
	public String Nome() {
		return nome;
	}
	
	
public void setNome(String nome) {
	this.nome = nome;
}

	@Override
	public String Setor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public long Matricula() {
		return matricula;
	}
	
public void setMatricula(long matricula) {
	this.matricula = matricula;
}

}
