
import java.util.Scanner;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
class Main 
{
  public static void main(String[] args) 
  {
    int n; //casllbkack times
    //console clear method
    Grandchild.cls(); 
    //creating the input func
    Scanner input = new Scanner (System.in);
    //I/O call time(s)
    System.out.print("\nA great meal is ready! How many times do you want to call your grandchilds? \n> ");
    n = input.nextInt();
    //I/O pizza possibility 
    System.out.print("Is there pizza to eat? [Y/N] \n> ");
    //Pizza control
    char pizza_controller = input.next().charAt(0);
    if(pizza_controller =='Y'||pizza_controller =='y')
    {
      n=n-1;
    
    }
    //From Grandchild class, Start calling back the grandchildren
    new Thread(new Grandchild("Huey", n)).start();
    new Thread(new Grandchild("Dewey", n)).start();
    new Thread(new Grandchild("Louie", n)).start();
    
  }
}

