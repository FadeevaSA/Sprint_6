import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {
    Feline feline;

    @Test
    public void getFriendsReturnListOfFriends() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        List<String> expectedFriends = Arrays.asList("Марти", "Глория", "Мелман");
        List<String> actualFriends = lionAlex.getFriends();
        assertEquals(expectedFriends, actualFriends);
    }

    @Test
    public void getPlaceOfLivingReturnPlace() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        String actualPlaceOfLiving = lionAlex.getPlaceOfLiving();
        assertEquals(expectedPlaceOfLiving, actualPlaceOfLiving);
    }

    @Test
    public void getKittensReturnZero() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        int expectedNumberOfKittens = 0;
        int actualNumberOfKittens = lionAlex.getKittens();
        assertEquals(expectedNumberOfKittens, actualNumberOfKittens);
    }

    @Test
    public void getSex() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        String expectedSexLionAlex = "Самец";
        String actualSexLionAlex = lionAlex.getSex();
        assertEquals(expectedSexLionAlex, actualSexLionAlex);
    }
}
