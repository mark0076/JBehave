Narrative:
This story covers basic tests of sighup
Lifecycle:
Before:
Given I open signup page

Scenario: Type invalid year

When I set date:
|month|day|year|
|April|28 |94  |
|March|11 |98  |
And I set share
And I click signup button
Then I  see error "Please enter a valid year."
And I do not see error "Please enter your birth month."


Scenario: Type invalid email

When I type confirmation email "12312@FS.e"
And I type email "ram@mfa.eedas"
And I click signup button
Then I see error "Email address doesn't match."

Scenario: Sign up with empty password

Given I open signup page
When I type email "dsad@fsd.re"
And I type confirmation email "dasdsa@fsd.ew"
And I type nickname "dadas"
And I click signup button
Then I see error "Enter a password to continue."

Scenario: Type invalid values

Given I open signup page
When I select gender "Non-binary"
And I type email "djasm@rw.da"
And I type confirmation email "dasdas@das.sa"
And I type nickname "dad2"
And I set share
And I click signup button
Then I see "6" errors
And I see that "1" error has text "Email address doesn't match."