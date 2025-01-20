import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int numberOfKittens;

    public FelineParameterizedTest(int numberOfKittens) {
        this.numberOfKittens = numberOfKittens;

    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Object[][] testNumberOfKittens() {
        return new Object[][]{
                {1},
                {0},
                {7},
        };
    }

    @Test
    public void getKittensNullOrMore() {
        Feline feline = new Feline();
        assertEquals(numberOfKittens, feline.getKittens(numberOfKittens));
    }
}
