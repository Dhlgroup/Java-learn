public class Newfile4 {
    public static void main(String[] args) {
        int numChenge = 1240;
        long changeClassic = numChenge;
        
        System.out.println("Total Num = "+changeClassic);


        long eraAge = 4_900_650_700L; // explicit
        int newAge = (int) eraAge; // Bad idea to do this = Lost information
        
        System.out.println("New Age "+ newAge);


        double numJint = 35.79;
        int jNumList = (int) numJint; // explicit

        System.out.println("NumJint = "+ numJint);
        System.out.println("See new Num = "+ jNumList);
    
        char currSymbol = '%'; // implicit
        int currNum = currSymbol; // No need to wright (int)
        

        System.out.println("Num = " + currNum);

        int inGrade = 101;
        char gradee = (char) inGrade; // explicit

        System.out.println("Grade = "+ gradee);

    }
}
