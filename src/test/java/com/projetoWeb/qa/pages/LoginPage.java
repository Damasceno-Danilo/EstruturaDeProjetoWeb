package com.projetoWeb.qa.pages;

import com.projetoWeb.qa.core.DriverFactory;
import com.projetoWeb.qa.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

     LoginMap map;
     DriverFactory driver;

    public LoginPage() {
        map = new LoginMap();
        PageFactory.initElements(DriverFactory.getDriver(), map);
    }

    public void clickBtnUser() {
        map.btnUser.click();
    }

    public void clickForaModal() {
        map.foraModal.click();
    }

    public void clickIconeFechar() {
        map.btnFechar.click();
    }

    public void setUserName(String email) {
        map.userName.sendKeys(email);
    }

    public void setPassword(String password) {
        map.password.sendKeys(password);
    }

    public void clickInpRemember() {
        map.rememberMe.click();
    }

    public boolean isBtnSignIn() {
        return map.signIn.isEnabled();
    }

    public void clickBtnSignIn() {
        map.signIn.click();
    }

    public void clickCreateAccount() {
        map.createAccount.click();
    }

    public void visibilityOfBtnFechar() {
        driver.visibilityOf(map.btnFechar);
    }

    public void invisibilityOfBtnFechar() {
        driver.invisibilityOf(map.btnFechar);
    }

    public void visibilityBtnUser() {
        driver.visibilityOf(map.btnUser);
    }

}
