package GerenciadordeFuncionarios;

public class Ferias {
private	Repassador R;
private String data;
public void setDatadeferias(String data) {
	this.data = data;
}
public Ferias() {
	if(data== "C") {
		R.setFerias(23, 04, 2024);
	}
	else if(data=="A") {
		R.setFerias(18, 9, 2024);
		
	}
	else if(data =="B") {
		R.setFerias(20, 11, 2024);
	}
	
}
}
