import org.junit.*;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;

import java.util.*;

@SuppressWarnings("unchecked")
@RunWith (Theories.class)
public class SetTheoryTest
{
   @DataPoints
   public static String[] string = {"ant", "bat", "cat"};

   @DataPoints
   public static Set[] sets = {
      new HashSet (Arrays.asList ("ant", "bat")),
      new HashSet (Arrays.asList ("bat", "cat", "dog", "elk")),
      new HashSet (Arrays.asList ("Snap", "Crackle", "Pop"))
   };


   @Theory
   public void removeThenAddDoesNotChangeSet
                   (Set<String> set, String string)  // Parameters!
   {
      assumeTrue (set != null);            // Assume
      assumeTrue (set.contains (string));  // Assume
      System.out.println ("Set, string: " + set + ", " + string);
      Set<String> copy = new HashSet<String>(set);   // Act
      copy.remove (string);                       
      copy.add (string);
      assertTrue (set.equals (copy));      // Assert
    }
}

