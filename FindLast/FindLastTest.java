import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

public class FindLastTest
{
   // this test fails!
   @Test public void lastOccurrenceInFirstElement()
   {
      int arr[] = {2, 3, 5};
      int y = 2;
      assertEquals("Last occurence in first element", 0, FindLast.FindLast(arr, y));
   }

   @Test public void lastOccurrence()
   {
      int arr[] = {3, 2, 5};
      int y = 2;
      assertEquals("Last occurence in first element", 0, FindLast.FindLast(arr, y));
   }

   @Test public void noOccurrence()
   {
      int arr[] = {3, 4, 5};
      int y = 2;
      assertEquals("Last occurence ", -1, FindLast.FindLast(arr, y));
}
