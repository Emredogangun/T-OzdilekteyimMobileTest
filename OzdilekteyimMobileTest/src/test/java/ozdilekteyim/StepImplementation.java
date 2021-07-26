package ozdilekteyim;

import com.thoughtworks.gauge.Logger;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static element.ElementMap.*;
public class StepImplementation extends BaseTest{


    @Step("<title> isimli sayfada <element> var mı kontrol et")
    public void isDisplayedElement(String title, String element){
        Assert.assertTrue(getElement(elementsMap().get(element)).isDisplayed());
        Logger.info(title + " sayfası var");

    }
    @Step({"<seconds> saniye bekle"})
    public void waitBySecond(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
        Logger.info(seconds + " saniye beklendi.");

    }

    @Step("<element> elementine tıkla")
    public void clickElement(String element){
        click(elementsMap().get(element));
        Logger.info(element + " elementine tıklandı");

    }

    @Step("Sayfayı aşağıya kaydır")
    public void scrollToBottom() throws InterruptedException {
        Dimension dimension = appiumDriver.manage().window().getSize();
        int start_x = (int) (dimension.width*0.5);
        int start_y = (int) (dimension.height*0.8);

        int end_x = (int) (dimension.width*0.5);
        int end_y = (int) (dimension.height*0.2);
        for(int i=0; i<50; i++){
            TouchAction action =
                    new TouchAction((PerformsTouchActions) appiumDriver)
                            .press(PointOption.point(start_x, start_y))
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                            .moveTo(PointOption.point(end_x, end_y))
                            .release().perform();

        }
        Logger.info("Sayfanın en aşagasına gelene kadar swipe edilir");


    }

    @Step("<x> kadar bekle")
    public void waitForSecond(int x) throws InterruptedException {
        Thread.sleep(1000*x);
        Logger.info(x + " saniye kadar beklendi");
    }


}
