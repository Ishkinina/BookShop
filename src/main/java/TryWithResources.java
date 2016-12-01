//import java.io.Closeable;
//
//public class TryWithResources
//{
//  public static void main(String[] args)
//  {
//    // try-with-resources, since Java 7
//    try (SomeResource sr=new SomeResource())
//    {
//      sr.doImportantJob();
//    }
//
//    // in previous versions it was like this... it does completely same thing
//    SomeResource sr=null;
//    try
//    {
//      sr=new SomeResource();
//      sr.doImportantJob();
//    }
//    finally
//    {
//      // note compiler warning if lines below are commented out
//      // if (sr != null)
//      // {
//      // sr.close();
//      // }
//    }
//  }
//
//}
//
//class SomeResource implements Closeable
//{
//
//  SomeResource()
//  {
//    System.out.println("I am initialized...");
//  }
//
//  void doImportantJob()
//  {
//    System.out.println("Doing important job...");
//    throw new RuntimeException();
//  }
//
//  @Override
//  public void close()
//  {
//    System.out.println("I am closing...");
//  }
//
//}
