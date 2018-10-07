package movableObjects;


public class Rectangle implements Movable {
    private Point p1; //up left corner
    private Point p2; //down right corner

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public void moveUp(short px){
        for(int i=0; i< px; i++ ) {
            p1.y += 1;
            p2.y += 1;
            print();
        }
    }

    public void moveDown(short px) {
        for(int i=0; i< px; i++ ) {
            p1.y -= 1;
            p2.y -=1;
            print();
        }
    }

    public  void moveLeft(short px) {
        for(int i=0; i< px; i++ ) {
            p1.x -= 1;
            p2.x -= 1;
            print();
        }
    }

    public  void moveRight(short px) {
        for (int i = 0; i < px; i++) {
            p1.x += 1;
            p2.x += 1;
            print();
        }
    }
    public void print() {
        System.out.println("Up Left Corner [ " + p1.x + "," + p1.y + "]");
        System.out.println("Down Right Corner [ " + p2.x + "," + p2.y + "]");
    }
}

/*
Задача 5. Напишете клас „правоъгълник“ (Rectange) с характеристики две точки – горен ляв и долен десен връх,
работещ по интерфейс movableObjects.Movable. Реализирайте метод “print”, който отпечатва координатите и на двете точки в следния формат:


 Горен ляв връх: (x1,y1)
Долен десен връх: (x2,y2)
Реализирайте методите moveUp, moveDown, moveLeft и moveRight, така че да преместват целия правоъгълник „пиксел по пиксел“, като на всяка стъпка да се отпечатва неговото текущо състояние.


 */