public class Main {
    public static void main(String[] args) {
       //Задание 1.1
        System.out.println("Задание 1.1");
        int[] height = new int[] { 1, 2, 3};
        System.out.println(height[0]);
        float[] consistence = { 1.57f, 7.654f, 9.986f};
        System.out.println(consistence[1]);
        int[] mileage = { 350, 470, 830, 520,155};
        System.out.println(mileage[4]);
        //Задание1.2
        System.out.println("Задание 1.2");
         System.out.print(height[0] + "," + height[1] + "," + height[2]);
        System.out.println(" ");
         System.out.print(consistence[0] + "," + consistence[1] + "," + consistence[2]);
        System.out.println(" ");
         System.out.print(mileage[0]+ "," + mileage[1]+ "," + mileage[2]+ "," +mileage[3]+ "," +mileage[4]);
         //Задание 1.3
        System.out.println("Задание 1.3");
        System.out.print(height[2] + "," + height[1] + "," + height[0]);
        System.out.println(" ");
        System.out.print(consistence[2] + "," + consistence[1] + "," + consistence[0]);
        System.out.println(" ");
        System.out.print(mileage[4]+ "," + mileage[3]+ "," + mileage[2]+ "," +mileage[1]+ "," +mileage[0]);
        //Задание 1.4
        System.out.println(" ");
        System.out.println("Задание 1.4");
        for ( int i = 0; i < 3; i++) {
            if ( height[i] % 2 != 0)
                height[i] = height[i] + 1;
            System.out.println(height[i]);
        }





    }
}