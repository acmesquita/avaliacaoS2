package teste;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import respostas.questao8.Questao8;

public class TesteQuestao8 {

	@Test
	public void testePassandoNumeroZero() {

		int valorA = 0;
		int valorB = 0;
		int expectativa = 0;
		int resultado = Questao8.encontraC(valorA , valorB);
		
		Assert.assertEquals(expectativa, resultado);
	}
	
	@Test
	public void testePassandoNumeroDeDoisDigitos() {

		int valorA = 13;
		int valorB = 24;
		int expectativa = 1234;
		int resultado = Questao8.encontraC(valorA , valorB);
		
		Assert.assertEquals(expectativa, resultado);
	}
	
	@Test
	public void testePassandoNumeroDeTresDigitos() {

		int valorA = 135;
		int valorB = 246;
		int expectativa = 123456;
		int resultado = Questao8.encontraC(valorA , valorB);
		
		Assert.assertEquals(expectativa, resultado);
	}
	
	@Test
	public void testePassandoAMaiorQueB() {

		int valorA = 135;
		int valorB = 24;
		int expectativa = 12345;
		int resultado = Questao8.encontraC(valorA , valorB);
		
		Assert.assertEquals(expectativa, resultado);
	}
	
	@Test
	public void testePassandoBMaiorQueA() {

		int valorA = 13;
		int valorB = 245;
		int expectativa = 12345;
		int resultado = Questao8.encontraC(valorA , valorB);
		
		Assert.assertEquals(expectativa, resultado);
	}
	
	@Test
	public void testeValorDeCMaiorQueUmMilhao() {

		int valorA = 1357;
		int valorB = 246;
		int expectativa = -1;
		int resultado = Questao8.encontraC(valorA , valorB);
		
		Assert.assertEquals(expectativa, resultado);
	}
}
