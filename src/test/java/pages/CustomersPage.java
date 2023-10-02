package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class CustomersPage extends BasePage {

    static final String FIRST_NAMES = "//tbody/tr/td[1]";

    @FindBy(xpath = "//input[@ng-model = 'searchCustomer']")
    private WebElement searchCustomerField;

    @FindBy(xpath = "//td/a[contains(text(), 'First Name')]")
    private WebElement firstNameFilter;


    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }

    @Step("Enter customer first name in the search field")
    public CustomersPage searchCustomerByFirstName(String firstName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(searchCustomerField));
        searchCustomerField.sendKeys(firstName);
        return new CustomersPage();
    }

    @Step("Click first name sorting filter")
    public CustomersPage clickFirstNameSortingFilter() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(firstNameFilter));
        firstNameFilter.click();
        return new CustomersPage();
    }

    /**
     * collectCustomersFirstName() method collect first names of customers from the customers' table
     * And return the list of first names.
     * If list is empty method throws an IllegalStateException.
     */
    public static List<String> collectCustomersFirstName() throws IllegalStateException {
        List<String> allFirstNames = new ArrayList<>();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(FIRST_NAMES)));
        driver.findElements(By.xpath(FIRST_NAMES))
                .stream()
                .forEach(firstName -> allFirstNames.add(firstName.getText()));
        if (allFirstNames.isEmpty()) {
            throw new IllegalStateException("The list of First Names is empty");
        }
        return allFirstNames;
    }

    /**
     * checkNamesListContainsFirstName() method take a firstName as parameter
     * And check that the list of first names contains the firstName.
     */
    public static boolean checkNamesListContainsFirstName(String firstName) {
        List<String> customersList = collectCustomersFirstName();
        return customersList.contains(firstName);
    }
}
