import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle222 = new Turtle(turtleWorld);
        Turtle turtle = new Turtle(turtleWorld);
        turtle222.setPenColor(Color.RED);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle222.penDown();
        turtle222.setPenWidth(5);
        turtle.setPenWidth(5);
        turtle.turn(90);
        turtle222.turn(180);
        turtle.forward(50);
        turtle222.forward(80);
        turtle.turn(90);
        turtle222.turn(270);
        turtle.forward(50);
        turtle222.forward(200);
        turtle222.turn(270);
        turtle222.forward(80);
        turtle222.turn(270);
        turtle222.forward(200);
        turtle.turn(90);
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);
        turtle222.turn(270);
        turtle222.forward(60);
        turtle222.turn(270);
        turtle222.forward(200);
        turtle222.turn(90);
        turtle222.forward(10);
        turtle222.turn(90);
        turtle222.forward(200);
        turtle222.turn(270);
        turtle222.forward(10);
        turtle222.turn(270);
        turtle222.forward(200);
        turtle222.turn(270);
        turtle222.forward(30);
        turtle222.turn(270);
        turtle222.forward(150);
        turtle222.turn(90);
        turtle222.forward(10);
        turtle222.turn(90);
        turtle222.forward(150);
        turtle222.turn(270);
        turtle222.forward(10);
        turtle222.turn(270);
        turtle222.forward(150);
        turtle222.turn(90);
        turtle222.forward(10);
        turtle222.turn(90);
        turtle222.forward(150);
        turtle222.backward(150);
        turtle222.setPenColor(Color.WHITE);
        turtle222.backward(50);
        turtle.turn(90);
        turtle.setPenColor(Color.RED);
        turtle.forward(200);
        turtle222.turn(270);
        turtle222.forward(50);
    }
}