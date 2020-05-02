import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import junit.framework.Assert;

public class AprenderCucumber {

	@Dado("^que criei o arquivo corretamente$")
	public void que_criei_o_arquivo_corretamente() throws Throwable {

	}

	@Quando("^executa-lo$")
	public void executa_lo() throws Throwable {

	}

	@Então("^a especificação deve finalizar com sucesso$")
	public void a_especificação_deve_finalizar_com_sucesso() throws Throwable {

	}

	private int counter = 0;
	@Dado("que o valor do contador é {int}")
	public void que_o_valor_do_contador_é(Integer param) {
		counter = param;
	}

	@Quando("eu incrementar em {int}")
	public void eu_incrementar_em(Integer param) {
		counter += param;
	}

	@Entao("o valor do contador é {int}")
	public void o_valor_do_contador_é(Integer param) {
			
		boolean is = param == counter;
		assertTrue(is);
		
	}
}
