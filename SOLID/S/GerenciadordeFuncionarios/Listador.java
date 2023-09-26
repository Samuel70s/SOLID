package GerenciadordeFuncionarios;
public class Listador implements Iterator {

public Repassador[]cargo;
 int posicao = 0;


public Listador(Repassador[] repassadors) {
	cargo = repassadors;
}

public boolean HashNext() {
	if(posicao>= cargo.length|| cargo[posicao]==null) {
	return false;
	}
	return true;
}

@Override
public Object Next() {
	Repassador carg = cargo[posicao];
	posicao++;
	return carg;
}



}
