package polygon;

import java.awt.geom.*; // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*; // for DrawingTool

public class IrregularPolygon {
    // ArrayList to store all the vertices (corners) of the polygon
    private ArrayList<Point2D.Double> myPolygon = new ArrayList<Point2D.Double>();

    // Constructor - initializes an empty polygon
    public IrregularPolygon() {}

    // public methods
    /**
     * Adds a point to the polygon.
     * Creates a copy of the point to prevent external changes from affecting the polygon.
     */
    public void add(Point2D.Double aPoint)
    {
        // Check if the point is null and throw an error if it is
        if (aPoint == null) {
            throw new IllegalArgumentException("Point cannot be null");
        }
        // Add a copy of the point (not the original) to protect internal state
        myPolygon.add(new Point2D.Double(aPoint.x, aPoint.y));
    }

    /**
     * Convenience overload that accepts raw coordinates instead of a Point object.
     * Creates a new Point2D.Double with the given x and y values and adds it to the polygon.
     */
    public void add(double x, double y) {
        myPolygon.add(new Point2D.Double(x, y));
    }

    /**
     * Calculates the perimeter (total distance around) of the polygon.
     * Loops through each side and adds up all the distances between consecutive vertices.
     */
    public double perimeter() {
        double perimeter = 0.0;
        // Loop through each vertex in the polygon
        for (int i = 0; i < myPolygon.size(); i++) {
            // Get the current vertex
            Point2D.Double p1 = myPolygon.get(i);
            // Get the next vertex (wraps around to the first vertex when i is at the last index)
            Point2D.Double p2 = myPolygon.get((i + 1) % myPolygon.size());
            // Add the distance between p1 and p2 to the total perimeter
            perimeter += p1.distance(p2);
        }
        return perimeter;
    }

    /**
     * Calculates the area of the polygon using the Shoelace formula.
     * This method works for any polygon with vertices listed in order.
     */
    public double area() {
        // Initialize area to zero
        Double area = 0.0;

        // Loop through each edge of the polygon
        for (int i = 0; i < myPolygon.size(); i++) {
            // Get the current vertex
            Point2D.Double p1 = myPolygon.get(i);
            // Get the next vertex (wraps around to the first vertex at the end)
            Point2D.Double p2 = myPolygon.get((i + 1) % myPolygon.size());
            // Apply the Shoelace formula: (x1*y2 - x2*y1) for each edge
            area += (p1.x * p2.y) - (p2.x * p1.y);
        }
        // Take the absolute value and divide by 2 to get the final area
        area = Math.abs(area) / 2.0;
        return area;
    }

    /**
     * Draws the polygon on a graphics window.
     * Moves to the first vertex, then draws lines to each subsequent vertex,
     * and finally closes the shape by drawing back to the starting point.
     */
    public void draw()
    {
        // Try-catch block to handle cases where graphics are not available
        try {
            // Return early if there are no vertices to draw
            if (myPolygon.isEmpty()) {
                return;
            }
            // Create a drawing tool with a 500x500 pixel canvas
            DrawingTool myDrawingTool = new DrawingTool(new SketchPad(500, 500));
            // Get the first vertex (the starting point of the polygon)
            Point2D.Double first = myPolygon.get(0);
            // Move the drawing tool to the first vertex without drawing a line
            myDrawingTool.move(first.x, first.y);
            // Loop through all remaining vertices (starting from the second one)
            for (int i = 1; i < myPolygon.size(); i++) {
                // Get the current vertex
                Point2D.Double p = myPolygon.get(i);
                // Draw a line from the current position to this vertex
                myDrawingTool.lineTo(p.x, p.y);
            }
            // Close the polygon by drawing a line back to the first vertex
            myDrawingTool.lineTo(first.x, first.y);
        } catch (java.awt.HeadlessException e) {
            // If graphics are not available, print an error message
            System.out.println("Exception: No graphics support available.");
        }
    }

}
