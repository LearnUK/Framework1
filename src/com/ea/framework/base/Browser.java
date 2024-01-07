package com.ea.framework.base;

import org.openqa.selenium.WebDriver;

public class Browser {
        private WebDriver _driver;

    public Browser(WebDriver driver) {
        _driver = driver;
    }

    public BrowserTypes Type;

        public void GoToURL(String url){
            _driver.get(url);
        }
        public void Maximise(){
            _driver.manage().window().maximize();
        }
    }