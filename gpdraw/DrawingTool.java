package gpdraw;

public class DrawingTool {
    private SketchPad pad;
    private double currentX;
    private double currentY;

    public DrawingTool(SketchPad pad) {
        this.pad = pad;
        this.currentX = 0;
        this.currentY = 0;
    }

    public void move(double x, double y) {
        this.currentX = x;
        this.currentY = y;
    }

    public void lineTo(double x, double y) {
        pad.drawLine((int)currentX, (int)currentY, (int)x, (int)y);
        this.currentX = x;
        this.currentY = y;
    }
}
