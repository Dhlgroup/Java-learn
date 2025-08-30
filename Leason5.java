public class Leason5 {
    public static void main(String[] args) {
      // Example 1
        
        double distance = 250.9;
        double time = 3.4;
        double speed = distance / time;

        System.out.println("Speed = "+ speed);

        // Example 2
        // First Version:

        int lemons = 8;
        int apples = 7;
        String fruitMessage = (lemons + apples > 10) ? 
                             "You have a lot of fruits" :
                             "You have a few fruits";
        
         System.out.println(fruitMessage);

        //  Second Version
        // int fruitMessage = lemons + apples;
        // if (fruitMessage > 10) {
        //     System.out.println("You have a lot of fruits");
        // } else {
        //     System.out.println("You have a few fruits");
        // }

        // Example 3


    }
}
