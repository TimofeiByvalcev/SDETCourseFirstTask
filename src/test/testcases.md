# Test Cases

## Short checklist

1. Creating customer
2. Sorting customers by First Name
3. Customer search

## Test cases for customer creation

### Test Case 1: Valid Data

| Step № | Actions                                                                                      | Input Data                                                                                                                                               | Expected results                             |
|--------|----------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------|
| 1.     | Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager) || Managers page is opened                                                                                                                                  |
| 2.     | Click Add Customer tab                                                                       || Add Customer page is opened                                                                                                                              |
| 3.     | Enter valid data in all fields                                                               | *First Name* - any string in latin alphabet;  *Last Name* - any string in latin alphabet; *Post Code* - any string in latin alphabet may include numbers | All fields are filled                        |
| 4.     | Click "Add Customer" button                                                                  || Popup apears                                                                                                                                             |
| 5.     | Verify that the success message or notification is displayed, close popup                    || Popup contains success message, popup is closed                                                                                                          |
| 6.     | Click Customers tab                                                                          || Customers page is opened                                                                                                                                 |
| 7.     | Enter First Name of already created customer in the search field                             | *First Name* of already created customer                                                                                                                 | Customer is displayed in the customers table |

### Test Case 2: Missing First Name

| Step № | Actions                                                                                                           | Input Data                                                     | Expected results                                |
|--------|-------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------|-------------------------------------------------|
| 1.     | Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)                      || Manager page is opened                                         |
| 2.     | Click Add Customer tab                                                                                            || Add Customer page is opened                                    |
| 3.     | Leave the First Name field empty                                                                                  |||
| 4.     | Enter valid data in the Last Name field                                                                           | *Last Name* - any string in latin alphabet                     ||
| 5.     | Enter valid data in the Post Code field                                                                           | *Post Code* - any string in latin alphabet may include numbers ||
| 5.     | Click "Add Customer" button.                                                                                      || Prompt apears                                                  |
| 6.     | Verify that an error message or validation message is displayed indicating that the First Name field is required. || Promt contains message "Please fill out this field."           |
| 7.     | Click Customers tab                                                                                               || Customers page is opened                                       |
| 8.     | Enter Last Name of already created customer in the search field                                                   | *Last Name* of already created customer                        | Customer isn't displayed in the customers table |

### Test Case 3: Missing Last Name

| Step № | Actions                                                                                                          | Input Data                                                     | Expected results                                |
|--------|------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------|-------------------------------------------------|
| 1.     | Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)                     || Manager page is opened                                         |
| 2.     | Click Add Customer tab                                                                                           || Add Customer page is opened                                    |
| 3.     | Leave the Last Name field empty                                                                                  |||
| 4.     | Enter valid data in the First Name field                                                                         | *First Name* - any string in latin alphabet                    ||
| 5.     | Enter valid data in the Post Code field                                                                          | *Post Code* - any string in latin alphabet may include numbers ||
| 5.     | Click "Add Customer" button.                                                                                     || Prompt apears                                                  |
| 6.     | Verify that an error message or validation message is displayed indicating that the Last Name field is required. || Promt contains message "Please fill out this field."           |
| 7.     | Click Customers tab                                                                                              || Customers page is opened                                       |
| 8.     | Enter First Name of already created customer in the search field                                                 | *First Name* of already created customer                       | Customer isn't displayed in the customers table |

### Test Case 4: Missing Post Code

| Step № | Actions                                                                                                          | Input Data                                           | Expected results                                |
|--------|------------------------------------------------------------------------------------------------------------------|------------------------------------------------------|-------------------------------------------------|
| 1.     | Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)                     || Manager page is opened                               |
| 2.     | Click Add Customer tab                                                                                           || Add Customer page is opened                          |
| 3.     | Leave the Post Code field empty                                                                                  |||
| 4.     | Enter valid data in the First Name field                                                                         | *First Name* - any string in latin alphabet          ||
| 5.     | Enter valid data in the Last Name field                                                                          | *Last Name* - any string in latin alphabet           ||
| 5.     | Click "Add Customer" button.                                                                                     || Prompt apears                                        |
| 6.     | Verify that an error message or validation message is displayed indicating that the Post Code field is required. || Promt contains message "Please fill out this field." |
| 7.     | Click Customers tab                                                                                              || Customers page is opened                             |
| 8.     | Enter First / Last Name of already created customer in the search field                                          | *First / Last Name* of already created customer      | Customer isn't displayed in the customers table |

## Test cases for sorting customers by the First Name

### Test Case 1: Sorting in alphabetical order

| Step № | Actions                                                                                      | Expected results                                             |
|--------|----------------------------------------------------------------------------------------------|--------------------------------------------------------------|
| 1.     | Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager) | Manager page is opened                                       |
| 2.     | Click Customers tab                                                                          | Customer page is opened                                      |
| 3.     | Click First Name column title twice                                                          | Customers are sorted in the table                            |
| 4.     | Verify that customers are sorted in the alphabetical order by the First Name                 | Customers are sorted in alphabetical order by the First Name |

### Test  Case 2: Sorting in reversed alphabetical order

| Step № | Actions                                                                                      | Expected results                                                      |
|--------|----------------------------------------------------------------------------------------------|-----------------------------------------------------------------------|
| 1.     | Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager) | Manager page is opened                                                |
| 2.     | Click Customers tab                                                                          | Customer page is opened                                               |
| 3.     | Click First Name column title once                                                           | Customers are sorted in the table                                     |
| 4.     | Verify that customers are sorted in the reversed alphabetical order by the First Name        | Customers are sorted in reversed alphabetical order by the First Name |

## Test cases for customer search

### Test Case 1: Search by First Name

Pre-conditions: Created customer(s)

| Step № | Actions                                                                                      | Input Data                                                                                         | Expected results                             |
|--------|----------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------|----------------------------------------------|
| 1.     | Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager) || Manager page is opened                                                                             |
| 2.     | Click Customers tab                                                                          || Customers page is opened                                                                           |
| 3.     | Enter the first name in the search field                                                     | *First Name* of already created customer                                                           | Customer(s) displayed in the customers table |
| 4.     | Verify that all customers with the entered first name displayed in the search results        || All customers which have entered first name displayed in the search results in the customers table |

### Test Case 2: Search by Last Name

Pre-conditions: Created customer(s)

| Step № | Actions                                                                                      | Input Data                                                                                        | Expected results                             |
|--------|----------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|----------------------------------------------|
| 1.     | Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager) || Manager page is opened                                                                            |
| 2.     | Click Customers tab                                                                          || Customers page is opened                                                                          |
| 3.     | Enter the last name in the search field                                                      | *Last Name* of already created customer                                                           | Customer(s) displayed in the customers table |
| 4.     | Verify that all customers with the entered last name displayed in the search results         || All customers which have entered last name displayed in the search results in the customers table |

### Test Case 3: Search by Post Code

Pre-conditions: Created customer(s)

| Step № | Actions                                                                                      | Input Data                                                                                        | Expected results                             |
|--------|----------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|----------------------------------------------|
| 1.     | Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager) || Manager page is opened                                                                            |
| 2.     | Click Customers tab                                                                          || Customers page is opened                                                                          |
| 3.     | Enter the Post Code in the search field                                                      | *Post Code* of already created customer                                                           | Customer(s) displayed in the customers table |
| 4.     | Verify that all customers with the entered post code displayed in the search results         || All customers which have entered post code displayed in the search results in the customers table |

### Test Case 4: Search by Account Number

Pre-conditions: created customer with opened account

| Step № | Actions                                                                                      | Input Data                                                                        | Expected results                          |
|--------|----------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------|-------------------------------------------|
| 1.     | Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager) || Manager page is opened                                                            |
| 2.     | Click Customers tab                                                                          || Customers page is opened                                                          |
| 3.     | Enter the account number in the search field                                                 | *Account Number* of already created customer                                      | Customer displayed in the customers table |
| 4.     | Verify that customer with the entered account number displayed in the search results         || Customer which has the entered account number is displayed in the customers table |

### Test Case 5: No Matching Results

Pre-conditions: Created customer(s)
|Step №| Actions |Input Data| Expected results |
|------|---------|----------|--------|
|1. |Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager)||Manager page is
opened|
|2. |Click Customers tab||Customers page is opened|
|3. |Enter the string which not contains any already created data in the search field|Any string which not conatins
already created data| No customers displayed in the search results|

### Test Case 6: Empty Search Field

Pre-conditions: Created customer(s)

| Step № | Actions                                                                                      | Expected results                              |
|--------|----------------------------------------------------------------------------------------------|-----------------------------------------------|
| 1.     | Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager) | Manager page is opened                        |
| 2.     | Click Customers tab                                                                          | Customers page is opened                      |
| 3.     | Leave the search field empty                                                                 | All customers displayed in the search results |

### Test Case 7: Search - Case Insensitive

Pre-conditions: Created customer(s)

| Step № | Actions                                                                                      | Input Data                                                              | Expected results                                                                                                                          |
|--------|----------------------------------------------------------------------------------------------|-------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|
| 1.     | Open [manager page](https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager) || Manager page is opened                                                  |
| 2.     | Click Customers tab                                                                          || Customers page is opened                                                |
| 3.     | Enter first name / last name in lower case in the search field                               | *First / Last Name* - any first / last name of already created customer | All customers with first / last name which contain entered first / last name (case insensitive) should be displayed in the search results |
