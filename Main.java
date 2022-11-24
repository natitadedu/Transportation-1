public class Main {
    public static void main(String[] args) {
        // object create -> className objectName = new className();

        Transportation train = new Transportation();

        train.transportCapacity(10);

        train.addPassenger(0,"Abebe");
        train.addPassenger(1,"Ayele");
        train.addPassenger(2,"Nati");
        train.addPassenger(3,"Samson");
        train.addPassenger(4,"Belete");

        train.viewTotalPassenger();
        train.removePassenger(0);

        train.updatePassenger(1,"Melat");
        train.modeOfTransport();
        train.remainingCapacity();



    }
}
