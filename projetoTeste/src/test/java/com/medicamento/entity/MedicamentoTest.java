package com.medicamento.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class MedicamentoTest {

	private Medicamento medicamento;

	@BeforeEach
	void setUp() {
// Arrange
		medicamento = new Medicamento(1L, "dipirona", "tomar com a consulta do medico", "22/09/25");
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
// Act
		medicamento.setId(2L);
// Assert
		Assertions.assertEquals(2L, medicamento.getId());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
// Act
		medicamento.setNome("rivotril");
// Assert
		Assertions.assertEquals("rivrotril", medicamento.getNome());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo bula")
	void testBula() {
// Act
		medicamento.setBula("usar somento com ajuda medica");
// Assert
		Assertions.assertEquals("usar somento com ajuda medica", medicamento.getBula());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo dataValidade")
	void testDataValidade() {
// Act
		medicamento.setDataValidade("04/08/25");
// Assert
		Assertions.assertEquals("04/08/25", medicamento.getDataValidade());
	}

	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstructorAll() {
// Act
		Medicamento novoMedicamento = new Medicamento(3L, "advil", "para colica, dor de cabeça", "03/09");
// Assertion
		Assertions.assertAll("novoMedicamento", () -> Assertions.assertEquals(3L, novoMedicamento.getId()),
				() -> Assertions.assertEquals("advil", novoMedicamento.getNome()),
				() -> Assertions.assertEquals("para colica, dor de cabeça", novoMedicamento.getBula()),
				() -> Assertions.assertEquals("03/09", novoMedicamento.getDataValidade()));

	}
}

