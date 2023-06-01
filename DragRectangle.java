import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DragRectangle extends JPanel implements MouseListener, MouseMotionListener {
    private int startX, startY, endX, endY;
    private boolean dragging = false;

    public DragRectangle() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (dragging) {
            int width = endX - startX;
            int height = endY - startY;
            g.drawRect(startX, startY, width, height);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        startX = e.getX();
        startY = e.getY();
        endX = startX;
        endY = startY;
        dragging = true;
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        endX = e.getX();
        endY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        dragging = false;
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    // Implement other MouseListener and MouseMotionListener methods
}
