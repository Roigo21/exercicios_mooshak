import java.util.Scanner;

public class ex_Y {
    public static void main(String[] args) {
        int num,c=0;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        for (int i=1;i<=num;i++){
            if (num%i==0 && i%3==0){
                System.out.println(i);
                c++;
            }
        }
        if (c==0){
            System.out.println("without dividers multiples of 3");
        }
    }
}
