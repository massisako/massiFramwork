package home;

import common.CommonAPI;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TestHome extends CommonAPI {

    @Test
    public void test1() {

        //System.out.println(driver.getTitle());


        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java books", Keys.ENTER);
        driver.get("https://www.amazon.com/s?k=mac+book+pro&ref=nb_sb_noss_2");

    }
}
