
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineEatMeatTest {

    @Test
    public void IFelineEatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, feline.eatMeat());
    }

}
