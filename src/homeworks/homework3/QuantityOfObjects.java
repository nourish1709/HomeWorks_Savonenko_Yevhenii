package homeworks.homework3;

public class QuantityOfObjects {
    protected static int quantityOfObjects = 0;

    QuantityOfObjects(){
        quantityOfObjects++;
    }

    public int getQuantityOfObjects(){
        return quantityOfObjects;
    }
}
