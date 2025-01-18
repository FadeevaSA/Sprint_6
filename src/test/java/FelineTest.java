import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatReturnPredatorFoodList() throws Exception {
        Feline feline = new Feline();
        List<String> actualPredatorFoodList = feline.eatMeat();
        assertEquals(CatTest.PREDATOR_FOOD_LIST, actualPredatorFoodList);

    }

    @Test
    public void getFamilyReturnFeline() {
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        assertEquals("Кошачьи", actualFamily);
    }

    @Test
    public void getKittensDefault() {
        Feline feline = new Feline();
        int actualNumberOfKittens = feline.getKittens();
        assertEquals(1, actualNumberOfKittens);
    }

}
