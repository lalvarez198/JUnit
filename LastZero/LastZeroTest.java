import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;



public class LastZeroTest
{

   @Test public void multipleZeroes()
   {
      int arr[] = {0, 1, 0};
      assertEquals("Multiple zeroes: should find last one", 2, LastZero.LastZero(arr));
   }

   @Test public void oneZero()
   {
      int arr[] = {0, 1, 3};
      assertEquals("One Zero", 0, LastZero.LastZero(arr));
   }

   @Test public void noZero()
   {
      int arr[] = {1, 1, 3};
      assertEquals("No Zero", 0, LastZero.LastZero(arr));
   }
}
