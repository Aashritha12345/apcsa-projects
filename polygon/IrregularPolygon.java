package polygon;

import java.awt.geom.*; // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*; // for DrawingTool

public class IrregularPolygon {
    private ArrayList<Point2D.Double> myPolygon = new ArrayList<Point2D.Double>();

    // constructor
    public IrregularPolygon() {}

    // public methods
    public void add(Point2D.Double aPoint)
    {
        if (aPoint == null) {
            throw new IllegalArgumentException("Point cannot be null");
        }
        // append a copy so external changes can't mutate internal state
        myPolygon.add(new Point2D.Double(aPoint.x, aPoint.y));
    }

    /**
     * Convenience overload that accepts raw coordinates.
     */
    public void add(double x, double y) {
        myPolygon.add(new Point2D.Double(x, y));
    }

    public double perimeter() {
        // TODO: Calculate the perimeter
        double perimeter = 0.0;
        for (int i = 0; i < myPolygon.size(); i++) {
            Point2D.Double p1 = myPolygon.get(i);
            Point2D.Double p2 = myPolygon.get((i + 1) % myPolygon.size());
            perimeter += p1.distance(p2);
        }
        return perimeter;
    }

    public double area() {
        // TODO: Calculate the area.

           Double area = 0.0;


           for (int i = 0; i < myPolygon.size(); i++) {
               Point2D.Double p1 = myPolygon.get(i);
               Point2D.Double p2 = myPolygon.get((i + 1) % myPolygon.size());
               area += (p1.x * p2.y) - (p2.x * p1.y);
           }
           area = Math.abs(area) / 2.0;
        return area;
    }

    public void draw()
    {
        // Wrap the DrawingTool in a try/catch to allow development without need for graphics.
        try {
            // draw the polygon by moving to the first vertex and then "lineTo"
            if (myPolygon.isEmpty()) {
                return;
            }
            DrawingTool myDrawingTool = new DrawingTool(new SketchPad(500, 500));
            Point2D.Double first = myPolygon.get(0);
            myDrawingTool.move(first.x, first.y);
            for (int i = 1; i < myPolygon.size(); i++) {
                Point2D.Double p = myPolygon.get(i);
                myDrawingTool.lineTo(p.x, p.y);
            }
            // close the shape
            myDrawingTool.lineTo(first.x, first.y);
        } catch (java.awt.HeadlessException e) {
            System.out.println("Exception: No graphics support available.");
        }
    }

}
