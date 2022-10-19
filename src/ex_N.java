import java.util.Scanner;

public class ex_N {
    public static void main(String[] args) {
        int n,c=0,count=0,anterior=0,aux3=0,aux2,aux;
        Scanner ler = new Scanner(System.in);
        n = ler.nextInt();
        while (n>=0){

            if (n>anterior && c>0) {
                aux=n;
                aux2=aux%10;
                aux3=aux2;
                c=1;
                count=0;
                while(aux>0){

                    if (aux3>aux2){
                        c++;
                    }
                    count++;
                        aux3=aux2;
                    aux=aux/10;
                    aux2=aux%10;
                }
                if (c==count){
                    System.out.println(n);
                }
            }
            c=1;
            anterior = n;
            n=ler.nextInt();
        }
    }
}
