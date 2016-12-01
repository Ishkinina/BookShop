public class TryFinally
{
  public static void main(String[] args)
  {
    showCorrectUsage();

    System.out.println(showIncorrectUsage());
  }

  private static int showIncorrectUsage()
  {
    try
    {
      itCanThrowException();
      return 1;
    }
    // DO NOT DO THIS!
    finally
    {
      System.out.println("Final operation!");
      return 3;
    }
  }

  private static void showCorrectUsage()
  {
    try
    {
      itCanThrowException();
    }
    // executes even if exception was thrown
    finally
    {
      System.out.println("Final operation!");
    }
  }

  private static void itCanThrowException()
  {
    if (Math.random() < 0.5)
    {
      throw new IllegalArgumentException();
    }
    else
    {
      System.out.println("Correctly!");
    }
  }

}
