package DPG.geo_calculation_engine;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// As conexoes R2DBC sao criadas de forma preguicosa: o contexto sobe sem abrir conexao com o banco.
// Os valores abaixo so evitam placeholders nao resolvidos (${DB_USER}, ${DB_PASSWORD}) no teste.
@SpringBootTest(properties = {
		"spring.r2dbc.url=r2dbc:postgresql://test:test@localhost:5432/calculator_engine?currentSchema=engine_configuration",
		"spring.r2dbc.additional-datasources.calc.url=r2dbc:postgresql://test:test@localhost:5432/postgis_calculator"
})
class GeoCalculationEngineApplicationTests {

	@Test
	void contextLoads() {
	}

}
