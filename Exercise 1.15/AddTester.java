import java.awt.Rectangle;
public class AddTester
{
   public static void main(String[] args)
   {
      Rectangle box = new Rectangle(5, 10, 20, 30);
      System.out.println(box);
      box.add(0,0);
      System.out.println("I expect nothing to change to the rectangle");
      System.out.println(box);
   }
}