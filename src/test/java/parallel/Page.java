package parallel;

import static com.codeborne.selenide.WebDriverRunner.*;
import static com.codeborne.selenide.Selenide.*;


public class Page {

    public String getCurrentUrl(){
        return url();
    };

    public String getPageTitle(){
        return title();
    }
}
