package polygon;

import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        IrregularPolygon myPolygon = new IrregularPolygon();
        
        // Star points
        double[][] starPoints = {
            {150, 50},    // top point
            {180, 120},   // top right outer
            {250, 120},   // right point
            {195, 170},   // bottom right outer
            {220, 240},   // bottom right point
            {150, 190},   // bottom center
            {80, 240},    // bottom left point
            {105, 170},   // bottom left outer
            {50, 120},    // left point
            {120, 120}    // top left outer
        };
        
        for (double[] point : starPoints) {
            myPolygon.add(point[0], point[1]);
        }
        
        myPolygon.draw();
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        TestSuite.run();
    }
}
