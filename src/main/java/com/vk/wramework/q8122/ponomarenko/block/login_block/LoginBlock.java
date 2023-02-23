package com.vk.wramework.q8122.ponomarenko.block.login_block;

import com.vk.wramework.q8122.ponomarenko.block.BaseBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginBlock extends BaseBlock {


    public LoginBlock(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class=\"VkIdCheckbox__checkboxOn\"]")
    public WebElement inputSaveOn;

    @FindBy(xpath = "//span[@class=\"VkIdCheckbox__checkboxOff\"]")
    public WebElement inputSaveOff;


    @FindBy(xpath ="//input[@class=\"VkIdCheckbox__checkbox\"]")
    public WebElement inputSave;

    }
