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
          for (int i = 1; i < height.length; i++) {
                 System.out.print(height[i] -1 + ",");
                   if (i == height.length - 1) {
                  System.out.print(height[i]);
              }
          }
        System.out.println(" ");
        for (int i = 1; i < consistence.length; i++) {
            System.out.print(consistence[i] -1 + ",");
            if (i == consistence.length - 1) {
                System.out.print(consistence[i]);
            }
        }
        System.out.println(" ");
        for (int i = 1; i < mileage.length; i++) {
            System.out.print(mileage[i] -1 + ",");
            if (i == mileage.length - 1) {
                System.out.print(mileage[i]);
            }
        }
         //Задание 1.3
        System.out.println(" ");
        System.out.println("Задание 1.3");
        for (int i = height.length -1; i > -1; i--) {
            if (i == 0) {
                System.out.print(height[i]);
                break;
            }
            System.out.print(height[i]  + ",");
        }
        System.out.println("");
        for (int i = consistence.length -1; i > -1; i--) {
            if (i == 0) {
                System.out.print(consistence[i]);
                break;
            }
            System.out.print(consistence[i]  + ",");
        }
        System.out.println("");
        for (int i = mileage.length -1; i > -1; i--) {
            if (i == 0) {
                System.out.print(mileage[i]);
                break;
            }
            System.out.print(mileage[i]  + ",");
        }

        System.out.println(" ");
        System.out.println("Задание 1.4");
        for ( int i = 0; i < height.length; i++) {
            if (height[i] % 2 != 0) {
                height[i] = height[i] + 1;
                System.out.println(height[i]);
            }
        }




    }
}