import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int actualNumberOfKittens;
    private final int expectedNumberOfKittens;


    public FelineParameterizedTest(int expectedNumberOfKittens, int actualNumberOfKittens) {
        this.expectedNumberOfKittens = expectedNumberOfKittens;
        this.actualNumberOfKittens = actualNumberOfKittens;
    }

    @Parameterized.Parameters
    public static Object[][] NumberOfKittens() {
        return new Object[][]{
                {1, 1},
                {0, 0},
                {7, 7},
        };
    }

    @Test
    public void getKittensNullOrMore() {
        Feline feline = new Feline();
        assertEquals(expectedNumberOfKittens, feline.getKittens(actualNumberOfKittens));
    }
}
