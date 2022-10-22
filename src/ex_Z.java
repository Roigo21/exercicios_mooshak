import java.util.Locale;
import java.util.Scanner;

public class ex_Z {
    public static void main(String[] args) {
        int num,aux, max=0;
        double percentagem=0, cont=0,pares=0;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();

        while (num>0) {
            aux = num % 10;

            if (aux % 2 == 0) {
                pares++;
            } else {
                if (aux > max) {
                    max = aux;
                }
            }
            cont++;
            num = num / 10;
        }
        percentagem=(pares/cont)*100;

        System.out.printf(Locale.ROOT, "%.2f%%\n",percentagem);
        if (max==0){
            System.out.println("no odd digits");
        }
        else{
            System.out.println(max);
        }
    }
}
