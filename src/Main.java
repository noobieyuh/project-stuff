public class Main 
{
    public static void main(String[] args)
    {
        int num = 1;
        // prints from 1 to 100 oh yeah
        while (num <= 100){
            switch (num) {
                case 1 -> {
                    System.out.println("this is the " + num + "st time");
                    num++;
                }
                case 2 -> {
                    System.out.println("this is the " + num + "nd time");
                    num++;
                }
                case 3 -> {
                    System.out.println("this is the " + num + "rd time");
                    num++;
                }
                default -> {
                    System.out.println("this is the " + num + "th time");
                    num++;
                }
            }
            
        }
    }
}