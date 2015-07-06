package Classe;

public class SimuladorFinanciamento {

	private double valorVeiculo=0.0;
	private double valorEntrada=0.0;
	private double numPrestacoes=0;
	private double taxaJuros=0.0;
	private double rendaMensal=0.0;
	
	public SimuladorFinanciamento(double valorVeiculo, double valorEntrada,
			int numPrestacoes, double taxaJuros, double rendaMensal) {
		this.valorVeiculo = valorVeiculo;
		this.valorEntrada = valorEntrada;
		this.numPrestacoes = numPrestacoes;
		this.taxaJuros = taxaJuros;
		this.rendaMensal = rendaMensal;
	}
	
	
	public SimuladorFinanciamento() {
		// TODO Auto-generated constructor stub
	}


	public double getValorVeiculo() {
		return valorVeiculo;
	}
	public void setValorVeiculo(double valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}
	public double getValorEntrada() {
		return valorEntrada;
	}
	public void setValorEntrada(double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}
	public double getNumPrestacoes() {
		return numPrestacoes;
	}
	public void setNumPrestacoes(double numPrestacoes) {
		this.numPrestacoes = numPrestacoes;
	}
	public double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	
	public double valorFinanciado(){
		double pv=valorVeiculo - valorEntrada;
		return pv;
	}
	

	public double taxaJuros(){

		return taxaJuros/100;
		
		
	}
	public double valorPrestacao(){
		double pmt = ((valorFinanciado() * taxaJuros())/(1 - (1/Math.pow((1+taxaJuros()),numPrestacoes))));
		return pmt;
	}
	
	public boolean StatusFinanciamento(double pmt){
		if (pmt < (rendaMensal * 0.4)){
			return true;
		}
		else {
			return false;
		}
	}
	
}
