package Estacionamento;

public interface EstacionamentoPago {
public void PagarTaxa();
public double ValorTaxa();
public double ValoremDebito();
public int NumerodeVagas();
public void HorasEstacionado(int horas);
public void RetiraCarro();
public void AdicionarCarro();

}
