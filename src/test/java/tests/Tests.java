package tests;

import core.BaseTest;
import helpers.ListHelpers;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.Assert;
import org.junit.Test;
import pages.AddCustomerPage;
import pages.CustomersPage;
import pages.ManagerPage;

import java.util.List;

import static helpers.FakeUserData.*;

public class Tests extends BaseTest {
    @Feature("Customer creation")
    @Test
    @Owner("Tim Byvalcev")
    @Description("Test Case 1: Valid Data")
    public void createCustomer() {
        String firstName = FIRST_NAME;
        String lastName = LAST_NAME;
        String postCode = POST_CODE;
        ManagerPage.openManagerPage();
        ManagerPage.clickAddCustomerTab();
        AddCustomerPage addCustomerPage = new AddCustomerPage()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterPostCode(postCode)
                .clickAddCustomerButton();

        //Assert.assertTrue((AddCustomerPage.getAlertText()).contains("Customer added successfully"));

        addCustomerPage.alertAccept();

        ManagerPage
                .clickCustomersTab()
                .enterCustomerFirstNameInTheSearchField(firstName);

        Assert.assertTrue(CustomersPage.checkThatFirstNameContainsInFirstNamesList(firstName));
    }

    @Feature("Sorting customers by the First Name")
    @Test
    @Owner("Tim Byvalcev")
    @Description("Test  Case 2: Sorting in reversed alphabetical order")
    public void sortCustomerByFirstNameInReversedAlphabeticalOrder() {
        ManagerPage.openManagerPage();
        ManagerPage.clickCustomersTab();
        List<String> firstNameList = CustomersPage.collectCustomersFirstName();
        ListHelpers.sortReverseAlphabetically(firstNameList);
        new CustomersPage().clickFirstNameSortingFilter();
        Assert.assertEquals(firstNameList, CustomersPage.collectCustomersFirstName());
    }

    @Feature("Customer search")
    @Test
    @Owner("Tim Byvalcev")
    @Description("Test Case 1: Search by First Name")
    public void searchCustomerByTheFirstName() {
        String firstName = "Albus";
        ManagerPage.openManagerPage();
        ManagerPage
                .clickCustomersTab()
                .enterCustomerFirstNameInTheSearchField(firstName);
        Assert.assertTrue(CustomersPage.checkThatFirstNameContainsInFirstNamesList(firstName));
    }

}
