package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomerPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder = 'First Name']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@placeholder = 'Last Name']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@placeholder = 'Post Code']")
    private WebElement postCodeField;

    @FindBy(xpath = "//button[@type = 'submit' and text() = 'Add Customer']")
    private WebElement addCustomerButton;

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @Step("Enter first name")
    public AddCustomerPage enterFirstName(String firstName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(firstNameField));
        firstNameField.sendKeys(firstName);
        return new AddCustomerPage();
    }

    @Step("Enter last name")
    public AddCustomerPage enterLastName(String lastName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(lastNameField));
        lastNameField.sendKeys(lastName);
        return new AddCustomerPage();
    }

    @Step("Enter post code")
    public AddCustomerPage enterPostCode(String postCode) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(postCodeField));
        postCodeField.sendKeys(postCode);
        return new AddCustomerPage();
    }

    @Step("Click Add Customer button")
    public AddCustomerPage clickAddCustomerButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(addCustomerButton));
        addCustomerButton.click();
        return new AddCustomerPage();
    }

    @Step("Click Ok button in alert popup")
    public void alertAccept() {
        driver.switchTo().alert().accept();
    }
}
