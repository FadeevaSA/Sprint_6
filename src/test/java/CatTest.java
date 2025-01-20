import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.example.Constant.PREDATOR_FOOD_LIST;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundReturnMeow() {
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        assertEquals("Мяу", actualSound);
    }

    @Test
    public void getFoodReturnPredatorEatList() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(PREDATOR_FOOD_LIST);
        Cat cat = new Cat(feline);
        List<String> actualCatFoodList = cat.getFood();
        assertEquals(PREDATOR_FOOD_LIST, actualCatFoodList);
    }
}
