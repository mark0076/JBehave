package testpackage.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;



import testpackage.pages.SignUpPage;



public class SignUpSteps {
    SignUpPage page;
    @Step
    public void open_signUpPage(){
        page.open();
    }

    @Step
    public void type_email(String email){
        page.typeEmail(email);
    }
    @Step
    public void type_confirm_email(String email){
        page.typeConfirmEmail(email);
    }
    @Step
    public void type_password(String password){
        page.typePassword(password);
    }
    @Step
    public void type_nickname(String nickname){
        page.typeNickname(nickname);
    }
    @Step
    public void set_month(String month){
        page.setMonth(month);
    }
    @Step
    public void set_day(String day){
        page.setDay(day);
    }
    @Step
    public void set_year(String year){
        page.setYear(year);
    }
    @Step
    public void set_gender(String gender){
        page.setSex(gender);
    }
    @Step
    public void set_share(Boolean share){
        page.setShare(share);
    }
    @Step
    public void click_SignUpButtor(){
        page.clickSignUpButton();
    }
    @Step
    public void should_see_error(String message){
        Assertions.assertThat(page.isErrorVisible(message))
                .as("User should see message, but he doesn't")
                .isTrue();

    }
    @Step
    public void should_not_see_error(String message){
        Assertions.assertThat(page.isErrorVisible(message))
                .as("User shouldn't see message, but he does")
                .isFalse();

    }
    @Step
    public void errors_count(int size){
        Assertions.assertThat(page.getErrors()).hasSize(size);
    }
    @Step
    public void error_by_number(int number,String message){
        Assertions.assertThat(page.getErrorByNumber(number)).isEqualTo(message);
    }
}
