import java.util.Arrays;

public class Transportation {

    String passengerList[];
    String transportation;

    int capacity;
      //transport capacity
    void transportCapacity(int capacity){
      passengerList = new String[capacity];
    }
    //add passenger
    void addPassenger(int id,String passengerName) {
        if (passengerList.length > id) {
            passengerList[id] = passengerName;
            System.out.println("welcome passenger " + passengerName + " added successfully");
        } else {
            System.out.println("maximum space capacity");
        }
    }
    //view total passenger
        void viewTotalPassenger(){
            System.out.println("Total Passenger list "+ Arrays.toString(passengerList));
        }
        //remove passenger
        void removePassenger(int id){
            String passengerName = passengerList[id];
            passengerList[id] = null;
            System.out.println("passenger " +passengerName+ " removed Successfully");
        }
        //update passenger
        void updatePassenger(int id, String passengerName){
        passengerList[id] = passengerName;
            System.out.println("passenger " +passengerName+ " updated Successfully");
    }
    //mode of transport
    String modeOfTransport(){
        return transportation;
    }
//total passenger
   int totalPassenger(){
        return passengerList.length;
   }
   //remaining capacity
   int remainingCapacity(){
        int count = 0;
        for(String passengerName: passengerList){
            if(passengerName == null)
                count++;
        }
       return count++;
   }

}
