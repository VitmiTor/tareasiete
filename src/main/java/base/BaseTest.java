package base;

import com.github.javafaker.Faker;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import utilities.DataProviders;
import utilities.ExcelReader;
import utilities.Logs;

public class BaseTest {
    protected final Logs logs = new Logs();
    protected final Faker faker = new Faker();
    protected final DataProviders dataProviders = new DataProviders();
    protected ExcelReader excelReader = new ExcelReader();
    protected SoftAssert softAssert;
    protected final String smoke = "Smoke";
    protected final String regression = "Regression";

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
