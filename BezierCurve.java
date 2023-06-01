import javax.swing.*;
import java.awt.*;

public class BezierCurve extends JPanel {
    public void paint(Graphics g) {
        // Define the starting and ending points
        int x0 = 50, y0 = 50;
        int x3 = 200, y3 = 200;

        // Define the control points
        int x1 = 100, y1 = 0;
        int x2 = 100, y2 = 250;

        // Set the color to red
        g.setColor(Color.red);

        // Draw the Bezier curve using a series of line segments
        for (double t = 0; t <= 1; t += 0.01) {
            int x = (int) Math.round(Math.pow(1-t, 3)*x0 + 3*Math.pow(1-t, 2)*t*x1 + 3*(1-t)*Math.pow(t, 2)*x2 + Math.pow(t, 3)*x3);
            int y = (int) Math.round(Math.pow(1-t, 3)*y0 + 3*Math.pow(1-t, 2)*t*y1 + 3*(1-t)*Math.pow(t, 2)*y2 + Math.pow(t, 3)*y3);
            g.drawLine(x, y, x, y);
        }
    }

    public static void main(String[] args) {
        // Create the BezierCurve applet
        BezierCurve curve = new BezierCurve();

        // Create a JFrame to display the applet
        JFrame frame = new JFrame("Bezier Curve");
        frame.getContentPane().add(curve);
        // Set the size of the JFrame
        frame.setSize(300, 300);

        // Center the JFrame on the screen
        frame.setLocationRelativeTo(null);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
