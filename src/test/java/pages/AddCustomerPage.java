package pages;

import helpers.Waiters;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The AddCustomerPage class provides methods for work with the Add Customer page.
 */
public class AddCustomerPage extends BasePage {

    /**
     * Find a First Name field web element using @FindBy annotation and xpath.
     */
    @FindBy(xpath = "//input[@placeholder = 'First Name']")
    private WebElement firstNameField;

    /**
     * Find a Last Name field web element using @FindBy annotation and xpath.
     */
    @FindBy(xpath = "//input[@placeholder = 'Last Name']")
    private WebElement lastNameField;

    /**
     * Find a Post Code field web element using @FindBy annotation and xpath.
     */
    @FindBy(xpath = "//input[@placeholder = 'Post Code']")
    private WebElement postCodeField;

    /**
     * Find an Add Customer button web element using @FindBy annotation and xpath.
     */
    @FindBy(xpath = "//button[@type = 'submit' and text() = 'Add Customer']")
    private WebElement addCustomerButton;

    /**
     * Constructor for getting the driver instance from the BasePage class.
     * And also to initialize WebElements(Page Objects) declared in this class using PageFactory.
     */
    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @Step("Enter first name")
    public AddCustomerPage enterFirstName(String firstName) {
        Waiters.waitVisibilityOfElement(driver, firstNameField);
        firstNameField.sendKeys(firstName);
        return new AddCustomerPage();
    }

    @Step("Enter last name")
    public AddCustomerPage enterLastName(String lastName) {
        Waiters.waitVisibilityOfElement(driver, lastNameField);
        lastNameField.sendKeys(lastName);
        return new AddCustomerPage();
    }

    @Step("Enter post code")
    public AddCustomerPage enterPostCode(String postCode) {
        Waiters.waitVisibilityOfElement(driver, postCodeField);
        postCodeField.sendKeys(postCode);
        return new AddCustomerPage();
    }

    @Step("Click Add Customer button")
    public AddCustomerPage clickAddCustomerButton() {
        Waiters.waitVisibilityOfElement(driver, addCustomerButton);
        addCustomerButton.click();
        return new AddCustomerPage();
    }

    @Step("Click Ok button in alert popup")
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}
