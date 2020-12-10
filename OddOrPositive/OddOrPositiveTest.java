import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

public class OddOrPositiveTest
{
   @Test public void negativeOddNumbers()
   {
      int arr[] = {-3, -2, 0, 1, 4};
      assertEquals("Negative odd numbers in array", 3, OddOrPositive.oddOrPos(arr));
   }

   @Test public void Numbers()
   {
      int arr[] = {3, 2, 0, 1, 4};
      assertEquals("Positive numbers in array", 4, OddOrPositive.oddOrPos(arr));
   }

   @Test public void negativeNumbers()
   {
      int arr[] = {-4, -2, 0, 1, 4};
      assertEquals("Negative numbers in array", 2, OddOrPositive.oddOrPos(arr));
   }
}
