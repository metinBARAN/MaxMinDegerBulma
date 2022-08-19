import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int adet,sayi,max=0,min=0;

        Scanner inp=new Scanner(System.in);
        System.out.println("Kac sayi gireceksiniz: ");
        adet=inp.nextInt();

        for (int i=1;i<=adet;i++){
            System.out.println(i+". sayi");
            sayi=inp.nextInt();

            if (i==1){
                min=sayi;
                max=sayi;
            }else{
                if (sayi>max){
                    max=sayi;
                }
                if(sayi<min){
                    min=sayi;
                }
            }

        }
        System.out.println("Maksimum sayi: "+max);
        System.out.println("Minimum sayi: "+min);


    }
}
