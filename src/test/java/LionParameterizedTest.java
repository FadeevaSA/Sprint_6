import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    Feline feline;
    private final String sex;
    private final boolean expectedResult;

    public LionParameterizedTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
        this.feline = new Feline();
    }

    @Parameterized.Parameters (name = "Тип животного: {0}")
    public static Object[][] sexType() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
        };
    }

    @Test
    public void doesHaveManeReturnHasMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedResult, lion.doesHaveMane());
    }
}
