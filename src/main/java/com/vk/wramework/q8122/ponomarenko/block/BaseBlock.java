package com.vk.wramework.q8122.ponomarenko.block;

import org.openqa.selenium.WebDriver;

public class BaseBlock {

        protected WebDriver driver;

        public  BaseBlock (WebDriver driver){
            this.driver = driver;
        }
}
