package lovePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu {
    WebDriver driver;
    By catalog = new By.ByLinkText("Catalog");

    public Menu(WebDriver driver) {
        this.driver = driver;
    }

    public void menu() {
        driver.findElement(catalog).click();
    }

}
