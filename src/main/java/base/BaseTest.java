package base;

import com.github.javafaker.Faker;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import utilities.Logs;

public class BaseTest {
    protected final Logs logs = new Logs();
    protected final Faker faker = new Faker();
    protected SoftAssert softAssert;

    @BeforeMethod
    public void setupBase() {
        logs.info("Iniciando Base Test");
        softAssert = new SoftAssert();
    }

    @AfterMethod
    public void teardownBase() {
        logs.info("Terminando BaseTest \n");
    }
}
