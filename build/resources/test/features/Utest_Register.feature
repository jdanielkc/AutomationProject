#Author: Daniel_Garcia
@Stories
Feature: Utest registration form
  @scenario1
  Scenario: Registering a new user on the Utest page
    Given that a new user wants to register on the Utest page
    When all fields are completed
       | strName | strLastName | strEmail                     | strMonthBirth | strDayBirth | strYearBirth | strCity | strCountry | strPostalCode| strComputer | strVersion     | strLanguage | strMobileDevice | strModel       | strOS      | strPassword |
       | Daniel  | Garcia      | jdaniel.0711@hotmail.com     | July          | 11          | 1996         | Cali    | Colombia   | 760010       | Windows     | 10             | Spanish     | Xiaomi          | Redmi Note 10S | Android 12 | Dani_960711 |
    Then the registration is successfully completed
    |strFinalText|
    |Complete Setup|