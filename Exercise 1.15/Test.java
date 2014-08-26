import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL("https://naperville.instructure.com/images/thumbnails/20431627/NWkZs2jLb0dUgA4e5h9LdBybpzKdKInUoT8Xb5ae");
        JOptionPane.showMessageDialog(null, "Hello", "Title",JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}