import java.util.Scanner;

public class ex_M {
    public static void main(String[] args) {
        int n,i=0,conta,prim=0,segundo=1;
        Scanner ler = new Scanner(System.in);
        n = ler.nextInt();
        while (i<n){

            if (i==0 || i==1) {
                System.out.println(i);
            }
            else {

                conta = prim + segundo;

                prim = segundo;
                segundo=conta;
                System.out.println(conta);


            }
            i++;
        }

        }
    }

