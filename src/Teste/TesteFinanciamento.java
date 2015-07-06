package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import Classe.SimuladorFinanciamento;

public class TesteFinanciamento {

	
	@Test
	public void testeValorFinanciado(){
		
		SimuladorFinanciamento sf = new SimuladorFinanciamento();
		sf.setValorVeiculo(50000.00);
		sf.setValorEntrada(10000.00);
		
		double esperado = 40000.00;
		double atual = sf.valorFinanciado();
		
		assertEquals(esperado, atual,0.0);
		
	}
	
	@Test
	public void testeTaxaJuros(){
		
		SimuladorFinanciamento sf = new SimuladorFinanciamento();
		sf.setTaxaJuros(2);
		
		double esperado = 0.02;
		double atual = sf.taxaJuros();
		
		assertEquals(esperado, atual,0.0);
	}
	
	
	@Test
	public void testValorPrestacao() {
		
		SimuladorFinanciamento sf = new SimuladorFinanciamento();
		
		sf.setValorVeiculo(50000.00);
		sf.setValorEntrada(4000.00);
		sf.setNumPrestacoes(10);
		sf.setTaxaJuros(2);
		
		double esperado =  5121.02;
		double atual = sf.valorPrestacao();
		
		assertEquals(esperado, atual,0.01);
	}

}
