package pages;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomersPage extends BasePage {

    @FindBy(xpath = "//input[@ng-model = 'searchCustomer']")
    private WebElement searchCustomerField;

    @FindBy(xpath = "//td[1]/a")
    private WebElement firstNameFilter;


    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }

    @Step("Enter customer first name in the search field")
    public CustomersPage enterCustomerFirstNameInTheSearchField(String firstName) {
        searchCustomerField.sendKeys(firstName);
        return new CustomersPage();
    }

    @Step("Click first name sorting filter")
    public CustomersPage clickFirstNameSortingFilter() {
        firstNameFilter.click();
        return new CustomersPage();
    }

    public static List<String> collectCustomersFirstName() {
        List<String> allFirstNames = new ArrayList<>();
        driver.findElements(By.xpath("//tbody/tr/td[1]"))
                .stream()
                .forEach(firstName -> allFirstNames.add(firstName.getText()));
        return allFirstNames;
    }

    public static boolean checkThatFirstNameContainsInFirstNamesList(String firstName) {
        List<String> customersList = collectCustomersFirstName();
        Iterator<String> iterator = customersList.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equals(firstName)) {
                return false;
            }else {
                continue;
            }
        }
        return true;
    }


}
