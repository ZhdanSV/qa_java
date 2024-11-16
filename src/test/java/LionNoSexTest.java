import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.internal.matchers.Null;

public class LionNoSexTest {

    @Mock
    Feline feline;

    @Test
    public void noSexTest() throws Exception {
        Assert.assertThrows(Exception.class, () -> { new Lion("dfsfsdf", feline);});
    }
}
