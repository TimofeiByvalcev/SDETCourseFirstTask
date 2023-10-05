package tests;

import helpers.ListHelpers;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.Assert;
import org.junit.Test;
import pages.CustomersPage;
import pages.ManagerPage;

import java.util.List;

/**
 * The CustomerSearchTest class provides methods for testing filters in the customer search functionality.
 */
@Feature("Sorting customers")
public class CustomersSortingTest extends BaseTest {

    /**
     * The testSortCustomerByTheFirstNameInReversedAlphabeticalOrder() method check that user can filter customers
     * by the first name in reversed alphabetical order.
     */
    @Test
    @Owner("Tim Byvalcev")
    @Description("Test  Case 2: Sorting in reversed alphabetical order")
    public void testSortCustomerByFirstNameInReversedAlphabeticalOrder() {
        new ManagerPage()
                .openManagerPage()
                .clickCustomersTab();
        List<String> firstNameList = CustomersPage.collectCustomersFirstName();
        ListHelpers.sortReverseAlphabetically(firstNameList);
        new CustomersPage().clickFirstNameSortingFilter();
        Assert.assertEquals("Sorting in reversed alphabetical order isn't work", firstNameList, CustomersPage.collectCustomersFirstName());
    }
}
