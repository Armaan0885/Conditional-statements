import java.util.*;

 class odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println("it is even number");
        } else {
            System.out.println("it is an odd number");
        }
        sc.close();

    }

}
