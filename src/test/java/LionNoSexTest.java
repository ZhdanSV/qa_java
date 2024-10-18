import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class LionNoSexTest {

    @Mock
    Feline feline = new Feline();

    @Test
    public void noSexTest() throws Exception {
        String expectedMessage = "Используйте допустимые значения пола животного - самей или самка";
        try {
            String sex = "аоравлорпав";
            Lion lion = new Lion(sex, feline);
        } catch (Exception exception) {
            Assert.assertEquals(exception.getMessage(), expectedMessage);
        }
    }
}
