import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty", 
		monochrome = false,
		snippets = SnippetType.UNDERSCORE,
		dryRun = false,
		strict = true
		)
public class Runner {
//dryRun = não executa os testes, apenas valida os cenarios
	// strict obriga ao junit a dizer se todos os cenarios do cucumber foram cumpridos
}
