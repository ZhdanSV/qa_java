import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineGetKittensWithoutArgTest {
    Feline feline = new Feline();

    @Test
    public void getKittensWithoutArg() {
        int expected = 1;
        Assert.assertEquals(expected, feline.getKittens());
    }
}
