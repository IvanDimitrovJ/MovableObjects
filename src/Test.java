import movableObjects.MovableCircle;
import movableObjects.MovablePixel;
import movableObjects.Point;
import movableObjects.Rectangle;

public class Test {
    public static void main(String[] args) {

        Point point = new Point((short)0,(short)0);

        MovablePixel pixel = new MovablePixel(point);
        pixel.moveRight((short)10);

        MovableCircle circle = new MovableCircle(point, (short)10);
        System.out.println(circle.isInside(new Point((short)3, (short)3)));

        Point upLeftCorner = new Point((short)0, (short) 5);
        Point downRightCorner = new Point((short)5, (short)0);
        Rectangle rectangle = new Rectangle(upLeftCorner, downRightCorner);
        rectangle.moveRight((short)5);
    }
}
