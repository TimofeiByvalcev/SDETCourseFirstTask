package pages;

import helpers.Waiters;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * The CustomersPage class provides methods for work with the Customers page.
 */
public class CustomersPage extends BasePage {

    /**
     * A FIRST_NAMES constant provide a xpath string for the first names in column First Name in the customers table.
     */
    static final String FIRST_NAMES = "//tbody/tr/td[1]";

    /**
     * Find a Search field web element using @FindBy annotation and xpath.
     */
    @FindBy(xpath = "//input[@ng-model = 'searchCustomer']")
    private WebElement searchCustomerField;

    /**
     * Find a First Name filter web element using @FindBy annotation and xpath.
     */
    @FindBy(xpath = "//td/a[contains(text(), 'First Name')]")
    private WebElement firstNameFilter;

    /**
     * Constructor for getting the driver instance from the BasePage class.
     * And also to initialize WebElements(Page Objects) declared in this class using PageFactory.
     */
    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }

    @Step("Enter customer first name in the search field")
    public CustomersPage searchCustomerByFirstName(String firstName) {
        Waiters.waitVisibilityOfElement(driver, searchCustomerField);
        searchCustomerField.sendKeys(firstName);
        return new CustomersPage();
    }

    @Step("Click first name sorting filter")
    public CustomersPage clickFirstNameSortingFilter() {
        Waiters.waitVisibilityOfElement(driver, firstNameFilter);
        firstNameFilter.click();
        return new CustomersPage();
    }

    /**
     * collectCustomersFirstName() method collect first names of customers from the customers' table.
     * And return the list of first names.
     * If list is empty method throws an IllegalStateException.
     */
    public static List<String> collectCustomersFirstName() throws IllegalStateException {
        List<String> allFirstNames = new ArrayList<>();
        Waiters.waitVisibilityOfElements(driver, FIRST_NAMES);
        driver.findElements(By.xpath(FIRST_NAMES))
                .stream()
                .forEach(firstName -> allFirstNames.add(firstName.getText()));
        if (allFirstNames.isEmpty()) {
            throw new IllegalStateException("The list of First Names is empty");
        }
        return allFirstNames;
    }

    /**
     * checkNamesListContainsFirstName() method take a firstName as parameter.
     * And check that the list of first names contains the firstName.
     */
    public static boolean checkNamesListContainsFirstName(String firstName) {
        List<String> customersList = collectCustomersFirstName();
        return customersList.contains(firstName);
    }
}
