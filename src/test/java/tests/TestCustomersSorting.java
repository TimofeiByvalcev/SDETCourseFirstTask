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

@Feature("Sorting customers")
public class TestCustomersSorting extends BaseTest {

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
