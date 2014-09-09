import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle222 = new Turtle(300,300,turtleWorld);
        Turtle turtle = new Turtle(300,300,turtleWorld);
        Picture background = new Picture("flag.jpg");
        turtleWorld.setPicture(background);
        turtle222.setPenColor(Color.RED);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle222.penDown();
        turtle222.setPenWidth(5);
        turtle.setPenWidth(5);
        turtle.turn(90);
        turtle222.turn(180);
        turtle.forward(50);
        turtle222.forward(80);//changed
        turtle.turn(90);
        turtle222.turn(270);
        turtle.forward(50);//changed
        turtle222.forward(200);
        turtle222.turn(270);
        turtle222.forward(80);//changed
        turtle222.turn(270);
        turtle222.forward(200);
        turtle.turn(90);
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);//changed
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
        turtle222.turn(90);
        turtle222.forward(5);
        turtle222.turn(90);
        turtle222.forward(16);
        turtle222.setPenColor(Color.BLUE);
        turtle222.forward(5);
        turtle222.setPenWidth(50);
        turtle222.forward(2);
        
        
    }
}