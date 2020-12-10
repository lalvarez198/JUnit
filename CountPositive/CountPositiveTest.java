import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;



  public class CountPositiveTest
  {
     @Test public void arrayConCeros()
     {
        int arr[] = {-1, 3, 1, 0};
        assertEquals("El Array contiene ceros", 2, CountPositive.CountPositive(arr));
     }

     @Test public void arraySinCeros()
     {
        int arr[] = {-1, 3, 1, 3};
        assertEquals("El Array no tiene ceros", 3, CountPositive.CountPositive(arr));
     }
  }
