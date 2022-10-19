import java.util.Scanner;

public class ex_L {
    public static void main(String[] args) {
        int n,perfeitos=0,aux2,aux=2,num,soma;
        Scanner ler = new Scanner(System.in);
        n= ler.nextInt();
        while (perfeitos<n){
            soma=0;

            for (int i=1;i<aux;i++){

               if (aux%i==0){
                   soma+=i;
               }
            }
            if (soma==aux){
                perfeitos++;
                System.out.println(aux);
            }
            aux++;

        }

    }

}
