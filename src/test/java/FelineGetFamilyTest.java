import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;


public class FelineGetFamilyTest {

    @Test
    public void IFelineGetFamilyTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, feline.getFamily());
    }
}
