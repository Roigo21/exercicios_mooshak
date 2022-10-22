import java.util.Scanner;

public class ex_P {
    public static void main(String[] args) {
        int num,aux,aux2,num1=0,num2=0,c=0,pos1=1,pos2=2;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        while (num>0){
            c=0;
            aux=num;
            pos1=0;

            while (aux>0 && c==0){
                num1=aux%10;
                aux=aux/10;
                aux2=aux;
                pos2=pos1+1;
                while (aux2>0 && c==0){
                    num2=aux2%10;
                    if (num2==num1){
                        c=1;
                    }
                    pos2++;
                    aux2=aux2/10;
                }
                pos1++;


            }
            if (c!=0){
                System.out.printf("%d : digit (%d) repeated in positions (%d) and (%d)\n",num,num1,pos1,pos2);
            }


            num = ler.nextInt();
        }
    }
}
