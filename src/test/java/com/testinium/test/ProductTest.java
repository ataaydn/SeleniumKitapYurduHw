package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ProductTest extends BaseTest {

    @Test
    public void productTest() {
        Methods methods = new Methods();
        methods.sendKeys(By.id("search-input"), "edebiyat");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.click(By.cssSelector(".pr-img-link"));
        methods.scrollWithAction(By.xpath("//a[@id='review-reply-button']"));
        methods.waitBySeconds(3);
      //  methods.selectByText(By.cssSelector("select#review-sort-selection"), "Oylama (Düşük > Yüksek");
        methods.waitBySeconds(5);

    }

    @Test
    public void getAttribute(){
        Methods methods = new Methods();
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println("Alınan text: "+ attribute);
        methods.waitBySeconds(3);
    }

    @Test
    public void getTextTest(){
        Methods methods = new Methods();
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text: "+ text);
        methods.waitBySeconds(3);

    }

    @Test
    public void valueTest(){
        Methods methods = new Methods();
        methods.sendKeys(By.id("search-input"),"testinium");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text:" + value);
        Assert.assertEquals("testinium", value);
        methods.waitBySeconds(5);


    }

}







