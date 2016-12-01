/**
 * Created by eishkinina on 07.09.16.
 */
public class MyTCF {

    public static void main(String[] args)
    {
        try
        {
            doDangerousCode();
        }

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
            System.out.println("Finally block is done!");
        }
    }


    private static void doDangerousCode() throws Exception
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
