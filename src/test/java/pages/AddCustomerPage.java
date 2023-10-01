package pages;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
        firstNameField.sendKeys(firstName);
        return new AddCustomerPage();
    }
    @Step("Enter last name")
    public AddCustomerPage enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
        return new AddCustomerPage();
    }
    @Step("Enter post code")
    public AddCustomerPage enterPostCode(String postCode) {
        postCodeField.sendKeys(postCode);
        return new AddCustomerPage();
    }
    @Step("Click Add Customer button")
    public AddCustomerPage clickAddCustomerButton() {
        addCustomerButton.click();
        return new AddCustomerPage();
    }

    public static String getAlertText() {
        return driver.switchTo().alert().getText();
    }
    @Step("Click Ok button in alert popup")
    public AddCustomerPage alertAccept() {
        driver.switchTo().alert().accept();
        return new AddCustomerPage();
    }

}
