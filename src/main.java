import java.util.Random;
import java.util.Scanner;

public class main {

   static Scanner klavye = new Scanner(System.in);

   int ilkAday;
   int ikinciAday;

    public static void main(String[] args) {
        System.out.println("1-tas , 2-kagit, 3-makas");
        System.out.println("tas makasi kirar kagida karsi kaybeder");
        System.out.println("makas kagidi keser tasa karsi kaybeder");
        System.out.println("kagit tasi sarar makasa karsi kaybeder");

        System.out.println("lutfen 1 ile 3 arasinda bir deger giriniz");
        int ilkAday = klavye.nextInt();


        System.out.println("lutfen 1 ile 3 arasinda bir deger giriniz");
        int ikinciAday = klavye.nextInt();

        if(ilkAday==ikinciAday) {
            System.out.println("berabere kaldiniz");
        } else if (ilkAday ==1 && ikinciAday==2) {
            System.out.println("2. oyuncu kazandi");

        }else if(ilkAday==1 && ikinciAday==3){
            System.out.println("1. oyuncu kazandi");
        } else if (ilkAday==2 && ikinciAday==1) {
            System.out.println("2. oyuncu kazandi");

        }else if (ilkAday==2 && ikinciAday==3) {
            System.out.println("2. oyuncu kazandi");

        }else if (ilkAday==3 && ikinciAday==1) {
            System.out.println("1. oyuncu kazandi");

        }else if (ilkAday==3 && ikinciAday==2) {
            System.out.println("2. oyuncu kazandi");

        }else {
            System.out.println("yanlis giris yaptiniz tekrar deneyin");
        }


    }
}
