package polygon;

public class Main {
    public static void main(String [] args)
    {
        IrregularPolygon myPolygon = new IrregularPolygon();
        // add some points to visualize drawing (if gpdraw is available)
        myPolygon.add(0, 0);
        myPolygon.add(0, 100);
        myPolygon.add(100, 100);
        myPolygon.add(100, 0);
        myPolygon.draw();

        TestSuite.run();
    }
    
}
