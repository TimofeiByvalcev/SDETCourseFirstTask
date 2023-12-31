package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.Assert;
import org.junit.Test;
import pages.AddCustomerPage;
import pages.CustomersPage;
import pages.ManagerPage;

import static helpers.FakeUserData.*;
import static helpers.FakeUserData.FIRST_NAME;

/**
 * The CustomerCreationTest class provides methods for testing customer creation functionality.
 */
@Feature("Customer creation")
public class CustomerCreationTest extends BaseTest{

    /**
     * The testCreateCustomer() method check that user can create a new customer and created customer saved successfully.
     */
    @Test
    @Owner("Tim Byvalcev")
    @Description("Test Case 1: Valid Data")
    public void testCreateCustomer() {
        new ManagerPage()
                .openManagerPage()
                .clickAddCustomerTab();
        AddCustomerPage addCustomerPage = new AddCustomerPage()
                .enterFirstName(FIRST_NAME)
                .enterLastName(LAST_NAME)
                .enterPostCode(POST_CODE)
                .clickAddCustomerButton();
        addCustomerPage.acceptAlert();
        new ManagerPage().clickCustomersTab().searchCustomerByFirstName(FIRST_NAME);
        Assert.assertTrue("Customer didn't saved in the table", CustomersPage.checkNamesListContainsFirstName(FIRST_NAME));
    }
}
