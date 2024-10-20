
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineGetKittensTest {
    private final int kittensCount;
    private final int expected;

    public FelineGetKittensTest(int kittensCount, int expected ) {
        this.expected = expected;
        this.kittensCount = kittensCount;

    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][] {
                {0, 0},
                {1, 1},
                {2, 2}
        };
    }

    @Test
    public void shouldBeKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        Assert.assertEquals(expected, actual);
    }

}



