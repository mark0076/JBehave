package testpackage.steps.jbehave;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.reports.html.ExampleTable;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import testpackage.steps.serenity.SignUpSteps;

import java.util.Map;

public class SignUpPageSteps {

    @Steps
    SignUpSteps steps;


    @Given("I open signup page")
    public void openPage(){
        steps.open_signUpPage();
    }
    @When("I set date: $date")
    public void setDate(ExamplesTable table){
        Map<String, String> date = table.getRow(1);
        steps.set_month(date.get("month"));
        steps.set_day(date.get("day"));
        steps.set_year(date.get("year"));

    }

    @When("I set month \"$month\"")
    public void setMonth(String month){
        steps.set_month(month);
    }
    @When("I set day \"$day\"")
    public void setDay(String day){
        steps.set_day(day);
    }
    @When("I set year \"$year\"")
    public void setYear(String year){
        steps.set_year(year);
    }
    @When("I set share")
    public void checkShare(){
        steps.set_share(true);
    }
    @When("I uncheck share")
    public void uncheckShare(){
        steps.set_share(false);
    }
    @When("I click signup button")
    public void clickSignUpButton(){
        steps.click_SignUpButtor();
    }
    @When("I type confirmation email \"$confirmEmail\"")
    public void typeConfirmationEmail(String confirmEmail){
        steps.type_confirm_email(confirmEmail);
    }
    @When("I type email \"$email\"")
    public void typeEmail(String email){
        steps.type_email(email);
    }
    @When("I type nickname \"$nickname\"")
    public void typeNickname(String nickname){
        steps.type_nickname(nickname);
    }
    @When("I select gender \"$gender\"")
    public void setGender(String gender){
        steps.set_gender(gender);
    }
    @Then("I  see error \"$error\"")
    public void getError(String error){
        steps.should_see_error(error);
    }
    @Then("I do not see error \"$error\"")
    public void getNotError(String error){
        steps.should_not_see_error(error);
    }
    @Then("I see that \"$number\" error has text \"$text\"")
    public void getErrorNum(int number,String text){
        steps.error_by_number(number,text);
    }
    @Then("I see \"$number\" errors")
    public void numberOfErrors(int number){
        steps.errors_count(number);
    }






}
/*

Then I  see error "Please enter a valid year."
And I do not see error "Please enter your birth month."

Scenario: Type invalid email
Given I open signup page
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
When I set gender "Non-binary"
And I type email "djasm@rw.da"
And I type confirmation email "dasdas@das.sa"
And I type nickname "dad2"
And I set share
And I click signup button
Then I see "6" errors
And I see that "1" error has text "Email address doesn't match."

        steps.open_signUpPage();
        steps.set_gender("Non-binary");
        steps.type_email("djasm@rw.da");
        steps.type_confirm_email("dasdas@das.sa");
        steps.type_nickname("dad2");
        steps.set_share(true);
        steps.click_SignUpButtor();
        steps.errors_count(6);
        steps.error_by_number(1,"Email address doesn't match.");*/