package movableObjects;

public class MovablePixel implements Movable {
    private Point point;

    public MovablePixel(Point p1) {
        point = p1;
    }

    public void print() {
        System.out.println("[ " + point.x + " , " + point.y + "]");
    }

    public void moveUp(short px){
        for(int i=0; i< px; i++ ) {
            point.y += 1;
            print();
        }
    }

    public void moveDown(short px) {
        for(int i=0; i< px; i++ ) {
            point.y -= 1;
            print();
        }
    }

    public  void moveLeft(short px) {
        for(int i=0; i< px; i++ ) {
            point.x -= 1;
            print();
        }
    }

    public  void moveRight(short px) {
        for(int i=0; i< px; i++ ) {
            point.x += 1;
            print();
        }
    }
}

/*
Задача 2. Напишете клас „подвижен пиксел“, който ще приемем за „точка“ (movableObjects.Point), работещ по интерфейс movableObjects.Movable,
 чиито характеристики са координати (две цели числа) с модификатор за достъп „default“. Напишете метод „print“,
  който отпечатва на екрана координатите на точката, разделени със запетая. Реализирайте методите “moveUp“, “moveDown”, “moveLeft”
  и “moveRight”, които да променят координатите на точката на стъпки „пиксел по пиксел“ в съответната посока, като на
  всяка стъпка на екрана се отпечатват новите стойности.
 */