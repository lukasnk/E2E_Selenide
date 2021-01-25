import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class FirstTest {

    @Test
    public void getPage(){
        open("https://miod-dobry.pl");
    }
}
