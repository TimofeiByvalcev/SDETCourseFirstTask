# Test Cases

## Short checklist

1. Creating customer
2. Sorting customers by First Name
3. Customer search

## Test cases for customer creation

### Test Case 1: Valid Data

1. Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)
2. Click Add Customer tab
3. Enter valid data in all fields
4. Click "Add Customer" button
5. Verify that the success message or notification is displayed
6. Verify that the customer is added successfully in customers table on Customers tab

### Test Case 2: Missing First Name

1. Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)
2. Click Add Customer tab
3. Leave the First Name field empty.
4. Enter valid data in the Last Name and Post Code fields.
5. Click on the "Add Customer" button.
6. Verify that an error message or validation message is displayed indicating that the First Name field is required.
7. Verify that the customer is not added to the system.

### Test Case 3: Missing Last Name

1. Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)
2. Click Add Customer tab
3. Enter valid data in the First Name and Post Code fields.
4. Leave the Last Name field empty.
5. Click on the "Add Customer" button.
6. Verify that an error message or validation message is displayed indicating that the Last Name field is required.
7. Verify that the customer is not added to the system.

### Test Case 4: Missing Post Code

1. Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)
2. Click Add Customer tab
3. Enter valid data in the First Name and Last Name fields.
4. Leave the Post Code field empty.
5. Click on the "Add Customer" button.
6. Verify that an error message or validation message is displayed indicating that the Post Code field is required.
7. Verify that the customer is not added to the system.

## Test cases for sorting customers by the First Name

### Test Case 1: Sorting in alphabetical order

1. Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)
2. Click Customers tab
3. Click First Name column title twice
4. Verify that customers are sorted in the alphabetical order by the First Name

### Test  Case 2: Sorting in reversed alphabetical order

1. Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)
2. Click Customers tab
3. Click First Name column title once
4. Verify that customers are sorted in the reversed alphabetical order by the First Name

## Test cases for customer search

### Test Case 1: Search by First Name

1. Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)
2. Click Customers tab
3. Enter the first name in the search field
4. Verify that all customers with the entered first name displayed in the search results

### Test Case 2: Search by Last Name

1. Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)
2. Click Customers tab
3. Enter the last name in the search field
4. Verify that all customers with the entered last name displayed in the search results

### Test Case 3: Search by Post Code

1. Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)
2. Click Customers tab
3. Enter the post code in the search field
4. Verify that all customers with the entered post code displayed in the search results

### Test Case 4: Search by Account Number

Pre-conditions: created customer with opened account

1. Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)
2. Click Customers tab
3. Enter the account number the search field
4. Verify that customer with the entered account number displayed in the search results

### Test Case 5: No Matching Results

1. Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)
2. Click Customers tab
3. Enter the string which not contains any already created data in the search field
4. No customers displayed in the search results

### Test Case 6: Empty Search Field

1. Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)
2. Click Customers tab
3. Leave the search field empty
4. Verify that all customers displayed in the search results

### Test Case 7: Search - Case Insensitive

1. Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)
2. Click Customers tab
3. Enter first name or last name in lower case
4. Verify that all customers with first name or last name containing entered first / last name (case insensitive) should be displayed in the search results