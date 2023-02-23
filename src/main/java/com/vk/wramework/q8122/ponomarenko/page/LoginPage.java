package com.vk.wramework.q8122.ponomarenko.page;

import com.vk.wramework.q8122.ponomarenko.block.login_block.LoginBlock;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private LoginBlock loginBlock = new LoginBlock(driver);

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginBlock getLoginBlock() {
        return loginBlock;
    }
}
