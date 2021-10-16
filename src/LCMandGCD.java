import java.util.Scanner;

public class LCMandGCD {
    public static void main(String[] args) {
        int nbr1,nbr2,tempNbr;

        Scanner input =new Scanner(System.in);

        System.out.print("Number 1 : ");
        nbr1=input.nextInt();
        System.out.print("Number 2 : ");
        nbr2=input.nextInt();

        if(nbr1>nbr2 || nbr1==nbr2){tempNbr=nbr1;nbr1=nbr2;nbr2=tempNbr;}

        int i=1,ebob=1;
        System.out.print("LCM : ");
        while(i<=nbr1){
           if(nbr1%i==0 && nbr2%i==0){
               System.out.print(i+" ");
               ebob=i;
           }
           i++;
        }
        System.out.println(" ");
        System.out.println("GCD : "+ebob);
    }
}
