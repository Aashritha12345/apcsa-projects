package gpdraw;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SketchPad extends JPanel {
    private List<Line> lines = new ArrayList<>();

    private static class Line {
        int x1, y1, x2, y2;
        Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    public SketchPad(int width, int height) {
        JFrame frame = new JFrame("SketchPad");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.add(this);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        for (Line line : lines) {
            g.drawLine(line.x1, line.y1, line.x2, line.y2);
        }
    }
    
    public void drawLine(int x1, int y1, int x2, int y2) {
        lines.add(new Line(x1, y1, x2, y2));
        repaint();
    }
}
