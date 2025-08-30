public class C4isla { 
    public static void main(String[] args) {
        byte age = 122;
        short year = 2025;
        int  lastDinozavrWas = 1_256_653_145;
        long myMoney = 4_000_657_896L;
        String tale = "nine";


        System.out.println("I have "+ tale+" Tales");
        System.out.println("MyMoney = "+ myMoney);
        System.out.println("LastDinozavrWas = "+ lastDinozavrWas);
        System.out.println("year = "+year);
        System.out.println("Age = "+age);

        char grade = 'A' ;
        boolean isRain;
        isRain = true;
        System.out.println("Grade = "+ grade);
        System.out.println("Is Rain Go? " + isRain);


        float cornerDigre = 43.2F;
        double temperature1 = 37.9D;
        double workProcentReady = 78.7;

        System.out.println("Corner Digre = "+ cornerDigre);
        System.out.println("Temprature 1 = "+ temperature1);
        System.out.println("Work Ready = " + workProcentReady);

        double temperature2 = -16.7;
        double togetherTemp = temperature1 + temperature2;

        System.out.println("Together temp = " + temperature1 + temperature2);
        System.out.println("Together = "+ togetherTemp);
        
        System.out.println(age + grade); 

        final int pasword = 2436672; // Обьявление константы

        System.out.println("Pasword = "+ pasword);
    }
}
