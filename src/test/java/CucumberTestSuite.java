import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",   // Caminho para os arquivos .feature
        glue = "amazonAutomation.steps",                    // Pacote das definições de steps
        plugin = {"pretty"}                         // Plugins adicionais, como "pretty" para saída formatada
)
public class CucumberTestSuite {

}
