import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Queue<String> pide_kuyrugu = new LinkedList<String>();
        Random random = new Random();

        pide_kuyrugu.offer("Ahmet");
        pide_kuyrugu.offer("Eyüp");
        pide_kuyrugu.offer("Sinan");
        pide_kuyrugu.offer("Süreyya");
        pide_kuyrugu.offer("Nur");
        pide_kuyrugu.offer("Mesut");
        pide_kuyrugu.offer("Mustafa");
        pide_kuyrugu.offer("Batuhan");
        pide_kuyrugu.offer("Bayram");
        pide_kuyrugu.offer("Asiye");

        System.out.println("Ramazan Pidesi Uygulamasına Hoşgeldiniz... ");
        System.out.println("********************************************************");

        int pide_sayisi = 1 + random.nextInt(10);   //nextInt() fonksiyonu random sayılar üretir içine 10 yazdığım
                                                          //için 0 ile 10 arasında random sayı üretir.

        System.out.println("Pideler çıkıyorr...");
        Thread.sleep(5000);
        System.out.println(pide_sayisi + " tane pide çıktı");

        while (pide_sayisi != 0){

            System.out.println(pide_kuyrugu.poll() + " pidesini aldı. ");

            Thread.sleep(1000);
            pide_sayisi--;
        }

        while (!pide_kuyrugu.isEmpty()){

            System.out.println(pide_kuyrugu.poll() + "'a pide kalmadı pideler bitti.");
            Thread.sleep(1000);
        }


    }
}