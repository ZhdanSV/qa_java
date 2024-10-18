import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {
    private final String sex;
    private final boolean expectedHasMane;
    Feline feline = new Feline();

    public LionDoesHaveManeTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] lionData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }


    @Test
    public void HaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}
