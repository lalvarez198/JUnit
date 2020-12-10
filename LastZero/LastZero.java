public class LastZero
{

  public static int LastZero (int[] x)
  {
    int j = -1;
    for (int i = 0; i < x.length; i++)
    {
      if (x[i] == 0)
      {
          j = i;
      }
    }
    return j;
  }




}
