package com.vk.wramework.q8122.ponomarenko.block.buttons_block;

import com.vk.wramework.q8122.ponomarenko.block.BaseBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsBlock extends BaseBlock {

    public ButtonsBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class=\"FlatButton__in\"]")
    public WebElement googlePlayButton;

 

}
