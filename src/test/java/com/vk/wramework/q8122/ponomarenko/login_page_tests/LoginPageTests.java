package com.vk.wramework.q8122.ponomarenko.login_page_tests;

import com.vk.wramework.q8122.ponomarenko.base.BaseUITestClass;
import com.vk.wramework.q8122.ponomarenko.service.LoginService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginPageTests extends BaseUITestClass {


    private LoginService loginService;

    @BeforeEach
    public void openLoginPage(){
        driver.navigate().to("https://vk.com/");
    }

    @Test
        public void verifyInputSaveVisibilityOn (){
        loginService = new LoginService(driver);

        Assertions.assertEquals(true, loginService.getLoginPage().getLoginBlock().inputSaveOn.isDisplayed());
    }

    @Test
    public void verifyInputSaveVisibilityOff(){
        loginService = new LoginService(driver);

        Assertions.assertEquals(false, loginService.getLoginPage().getLoginBlock().inputSaveOff.isDisplayed());
    }

    @Test
    public void verifyInputSaveOn(){
        loginService = new LoginService(driver);



    }

    @Test
    public void verifyClockInputSave(){
        loginService = new LoginService(driver);

        loginService.getLoginPage().getLoginBlock().inputSave.click();
    }

    @Test
    public void verifyInputGooglePlayVisibility (){
        loginService = new LoginService(driver);

       // Assertions.assertEquals(true, loginService.getLoginPage().getLoginBlock().isDisplayed());
    }

    @Test
    public void verifyInputRuStoreVisibility (){
        loginService = new LoginService(driver);

       // Assertions.assertEquals(true, loginService.getLoginPage().getLoginBlock().isDisplayed());
    }
}
