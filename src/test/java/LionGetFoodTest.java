import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionGetFoodTest {

    @Mock
    Feline feline;

    @Test
    public void ShouldGetFood() throws Exception {
//        Feline feline = new Feline();
        Lion lion = new Lion("Самка",feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, lion.getFood() );
    }
}
