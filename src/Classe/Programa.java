package Classe;

public class Programa {

	public static void main(String[] args) {
		
		SimuladorFinanciamento sf = new SimuladorFinanciamento();
		
		sf.setValorVeiculo(50000.00);
		sf.setValorEntrada(4000.00);
		sf.setRendaMensal(15000.00);
		sf.setNumPrestacoes(10);
		sf.setTaxaJuros(2);
		
		System.out.println(sf.valorPrestacao());
	}

}
