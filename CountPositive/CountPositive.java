public class CountPositive
{

  public static int CountPositive (int[] x)
  {
    int count = 0;
    for (int i=0; i < x.length; i++)
    {
      if (x[i] > 0)
      {
        count++;
      }
    }
    return count;
  }


}
