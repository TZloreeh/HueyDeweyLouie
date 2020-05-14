import java.util.concurrent.TimeUnit;
public class Grandchild implements Runnable
{
  private String name;
  private int times;
  
  //constructor 
  public Grandchild(String name, int times)
  {
    this.name = name;
    this.times = times; //times to run a callback for every Grandchild
  }

  //console clear method
  public static void cls() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
   }
   
  //run method
  public void run()
  {
    for(int i=0; i<times; i++)
    {
      System.out.println("[" + (i+1) + "]" + "° CallBack " + name);
      //TimeUnit.SECONDS.sleep(1);
      try
{
    Thread.sleep(1000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}

    }
  }
  
}