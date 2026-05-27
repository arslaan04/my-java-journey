public class loopCheck{
    public static void main(String [] args){
        int count = 1;
        while (count <= 50){
            System.out.println(count + ". I will practice sketching every day.");
            
            // This adds 1 to the count, so the loop doesn't run forever!
            count = count + 1;
        }
         System.out.println(" Loop finished.");
    }
}
