import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private static final String EXCEPTION_TEXT_INVALID_SEX = "Используйте допустимые значения пола животного - самец или самка";

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeInvalidSexThrowsException() {
        try {
            new Lion("Человек", feline);
            fail("Ожидалось исключение, но оно не было выброшено");

        } catch (Exception exception) {
            assertEquals(EXCEPTION_TEXT_INVALID_SEX, exception.getMessage());
        }

    }

    @Test
    public void getKittensReturnOne() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualNumberOfKittens = lion.getKittens();
        assertEquals(1, actualNumberOfKittens);
    }

    @Test
    public void getFoodReturnPredatorFoodList() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(CatTest.PREDATOR_FOOD_LIST);
        List<String> actualLionFoodList = lion.getFood();
        Assert.assertEquals(CatTest.PREDATOR_FOOD_LIST, actualLionFoodList);

    }
}
