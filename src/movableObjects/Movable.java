package movableObjects;

public interface Movable {
    void moveUp(short px);
    void moveDown(short px);
    void moveLeft(short px);
    void moveRight(short px);
}

/*
Налага ви се да управлявате група обекти, които имат няколко общи действия.
Те могат да се движат нагоре, надолу, наляво и надясно. При извършване на движението се подава число (брой пиксели)
 и не се очаква връщана стойност.
Задача 1. Напишете интерфейс „movableObjects.Movable”, който описва изброените горе дейности.
 */