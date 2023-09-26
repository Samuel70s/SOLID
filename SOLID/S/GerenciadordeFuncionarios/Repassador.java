package GerenciadordeFuncionarios;

public class Repassador{
private String Nome;
private double Remuneração;
private String CargaHoraria;
private String setor;
private int[] DatadeFerias = new int[3];
private String Cargo;
private long Matricula;

Remuneracao remuneracao = new Remuneracao();
Cargo cargo2 = new Cargo();
CargaHoraria cargaHoraria2 = new CargaHoraria();

    protected String getNome() {
		
		return Nome;
		
	}
	
    public void setNome(String nome) {
	this.Nome = nome;
    }

	
	protected double getRemuneração() {
		
		return Remuneração;
	}
	
	protected void setRemuneração(double valor) {
		this.Remuneração = valor;
		
	}
	

	
     protected String  CargaHoraria() {
	
		return CargaHoraria;
		
	}
     
    protected void setCargaHoraria(String carga) {
	       this.CargaHoraria = carga;
         }

    
	
	protected String getSetor() {
		
		return setor;
	}
	
	
    public void setSetor(String setor) {
    	this.setor = setor;
    }
	
	protected String getDataFerias() {
		return DatadeFerias[1]+" / "+DatadeFerias[2] +" / "+DatadeFerias[3] + " / ";
				
	}
	
	protected void setFerias(int dia , int mes , int ano) {
		
		DatadeFerias[1] = ano;
		DatadeFerias[2] = mes;
		DatadeFerias[3] = ano;		
	}

protected String getCargo() {
	return Cargo;
}
	
	protected void setCargo(String cargo) {
		this.Cargo = cargo;
	}
	
	
	protected long getMatricula() {
		return Matricula ;
	}
	
	public void setMatricula(long matricula) {
		this.Matricula = matricula;
	}
	
	
	
	
	
	
	
	
	
	

}
