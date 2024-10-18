import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class CatGetSoundTest {

    @Mock
    Feline feline;

    @Test
    public void SoundTest() {
//        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        Assert.assertEquals(expected, cat.getSound());
    }
}
