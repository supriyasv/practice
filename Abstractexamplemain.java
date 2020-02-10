public class Abstractexamplemain {
    public static void main(String[] args) {
        car car1=new Ferrari();
        CarRepair CarRepair=new CarRepair();
        CarRepair.repairCar(car1);

        car1=new Audi();
        CarRepair.repairCar(car1);

    }
}
