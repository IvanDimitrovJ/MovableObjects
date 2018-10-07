package movableObjects;

public class MovableCircle implements Movable {

    private Point center;
    private short radius;

    public MovableCircle(Point center, short rad) {
        this.center = center;
        this.radius = rad;
    }
    public void moveUp(short px){
        for(int i=0; i< px; i++ ) {
            center.y += 1;
            print();
        }
    }

    public void moveDown(short px) {
        for(int i=0; i< px; i++ ) {
            center.y -= 1;
            print();
        }
    }

    public  void moveLeft(short px) {
        for(int i=0; i< px; i++ ) {
            center.x -= 1;
            print();
        }
    }

    public  void moveRight(short px) {
        for(int i=0; i< px; i++ ) {
            center.x += 1;
            print();
        }
    }

    public void print() {
        System.out.println("[ " + center.x + " , " + center.y + "]");
    }

    public void printRadius() {
        System.out.println("Radius = " + radius);
    }

    public boolean isInside(Point point) {
        // Compare radius of circle with
        // distance of its center from
        // given point
        if ((point.x - center.x) * (point.x - center.x) +
                (point.y - center.y) * (point.y - center.y) <= radius * radius)
            return true;
        else
            return false;
    }
}

/*
Задача 3. Напишете клас „подвижна окръжност“ (Circle) с характеристики точка за център и радиус (цяло число),
 работещ по интерфейс movableObjects.Movable (движещата се част ще е центъра на окръжността). Напишете метод „print“,
 който отпечатва на екрана координатите на центъра на окръжността и нейния радиус. Реализирайте методите
 moveUp, moveDown, moveLeft и moveRight, както бе описано, които да променят координатите на центъра на стъпки „пиксел по пиксел“
 в съответната посока, като на всяка стъпка на екрана се отпечатват новите й координати.
 */

/*
Задача 4. В клас Circle реализирайте метод “isInside”, който по подаден параметър точка в равнината,
 определя дали тя лежи вътре в окръжността или не. Като резултат методът трябва да връща тип Boolean.
 */