package com.vk.wramework.q8122.ponomarenko.service;

import com.vk.wramework.q8122.ponomarenko.page.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginService extends BaseService {

    private LoginPage loginPage = new LoginPage(driver);

    public LoginService(WebDriver driver) {
        super(driver);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }
}
