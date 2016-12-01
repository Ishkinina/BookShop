/**
 * try is necessary. <br>
 * 0...N catch blocks <br>
 * 0...1 finally <br>
 * 
 * Because catching goes down from earlier catch to later ones, <br>
 * general rule is - the higher exception is, the lower it should be in catch chain! <br>
 * Catch order matters!
 *
 */
public class TryCatchFinally
{

  public static void main(String[] args)
  {
    try
    {
      doSomethingDangerous();
    }
    // only this order!
    catch (RuntimeException e)
    {
      e.printStackTrace();
      throw e;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      System.out.println("Finished!");
    }
  }

  private static void doSomethingDangerous() throws Exception
  {
    double random=Math.random();
    System.out.println("value is: " + random);
    if (random < 0.3)
    {
      throw new Exception("bad bad");
    }
    if (random < 0.6)
    {
      throw new RuntimeException("io bad!");
    }
    else
    {
      System.out.println("Correct!");
    }
  }
}
