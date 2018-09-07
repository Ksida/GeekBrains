package K3L2;

public class MyArrayDataException extends MyException {

    private int x;
    private int y;

    public int getX(){

        return x;
    }

    public int getY(){

        return y;
    }

    public MyArrayDataException (int x, int y) {

        super(String.format("Возникла ошибка, координаты %d %d", x, y));
    }
}
