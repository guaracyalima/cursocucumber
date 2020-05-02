import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

	Date date = new Date();
	@Dado("que a entrga é dia {int}\\/{int}\\/{int}")
	public void que_a_entrga_é_dia(Integer dia, Integer mes, Integer ano) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, dia);
		calendar.set(Calendar.MONTH, mes - 1);
		calendar.set(Calendar.YEAR, ano);
		
		date = calendar.getTime();
	}

	@Quando("a entrega atrasar em {int} dias")
	public void a_entrega_atrasar_em_dias(Integer dias) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, dias);
		
		date = calendar.getTime();
	}

	//@Entao("a entrega será efetuada dia {int}\\/{int}\\/{int}")
	@Entao("a entrega será efetuada dia (\\d{2}\\/\\d{2}\\/\\d{4})$")
	//public void a_entrega_será_efetuada_dia(Integer dia, Integer mes, Integer ano) {
	public void a_entrega_será_efetuada_dia(String _date) {
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormated = format.format(date);
		boolean verify = dateFormated.equals(_date);
		
		assertEquals(dateFormated, _date);
		assertTrue(verify);
	}
	
	
	@Dado("que o prazo é {int}\\/{int}\\/{int}")
	public void que_o_prazo_é(Integer dia, Integer mes, Integer ano) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, dia);
		calendar.set(Calendar.MONTH, mes - 1);
		calendar.set(Calendar.YEAR, ano);
		
		date = calendar.getTime();
	}

	@Quando("a entrega atrazar em {int} meses")
	public void a_entrega_atrazar_em_meses(Integer mes) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, mes);
		
		date = calendar.getTime();
	}

	@Entao("a entrega sera efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void a_entrega_sera_efetuada_em(String _date) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormated = format.format(date);
		boolean verify = dateFormated.equals(_date);
		
		assertEquals(dateFormated, _date);
		assertTrue(verify);
	}


}
