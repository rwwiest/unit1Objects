import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle variable = new Turtle(turtleWorld);
        variable.setPenColor(Color.RED);
        variable.penDown();
        variable.forward(50);
    }
}