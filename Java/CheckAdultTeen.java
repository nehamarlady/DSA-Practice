import java.util.Scanner;
class CheckAdultTeen{
    public static void main(String[] arr){
        //given the age, decid if the person is adult or teen(age<18)
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("The person is adult");
        }else{
            System.out.println("The person is teen");

        }
        scanner.close();

    }
}