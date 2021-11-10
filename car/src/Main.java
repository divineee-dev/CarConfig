import models.Car;
import models.CarModel;

public class Main {

    public static void main(String[]args){
        CarModel model = new CarModel();
        Car car = new Car("blue",  4, model);

        System.out.println(car.toString());
    }

}