public class DecisionMaker {
    public static void main(String [] args){
        int ticketPrice = 250;
        int cashInPocket = 1000;
        if(ticketPrice <= cashInPocket) {
            System.out.println("we can watch movie");
        } else {
            System.out.println("we can not watch movie");
        }
    }
}
