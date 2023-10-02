package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.Assert;
import org.junit.Test;
import pages.CustomersPage;
import pages.ManagerPage;

@Feature("Customer search")
public class TestCustomerSearch extends BaseTest {

    @Test
    @Owner("Tim Byvalcev")
    @Description("Test Case 1: Search by First Name")
    public void testSearchCustomerByTheFirstName() {
        String firstName = "Albus";
        new ManagerPage().openManagerPage()
                .clickCustomersTab()
                .searchCustomerByFirstName(firstName);
        Assert.assertTrue("Customer not found by the first name",CustomersPage.checkNamesListContainsFirstName(firstName));
    }
}
