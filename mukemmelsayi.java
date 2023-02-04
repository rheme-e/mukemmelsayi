package Giris;
import java.util.Scanner;
public class mukemmelsayi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int number;
        System.out.print("Bir Sayı Giriniz:");
        number=inp.nextInt();
        int toplam=0;
        for(int i=1; i<number ; i++){
            if(number%i==0){
                toplam+=i;
            }
        }if(number==toplam){
            System.out.println(number+" bir mükemmel sayıdır.");
        }else{
            System.out.println(number+" bir mükemmel sayı değildir.");
        }

    }
}
