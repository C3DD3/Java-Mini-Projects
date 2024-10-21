import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {

        Sayisal sayisal1 = new Sayisal(35,24,35,20);
        Sayisal sayisal2 = new Sayisal(22, 34,33,27);

        EsitAgirlik esitAgirlik1 = new EsitAgirlik(30,25,30,25);
        EsitAgirlik esitAgirlik2 = new EsitAgirlik(31,29,31,29);

        EsitAgirlik birinci2 = birinci(esitAgirlik1,esitAgirlik2);
        Sayisal birinci = birinci(sayisal1,sayisal2);

        System.out.println("Birinci Sayısal Öğrencinin Puanı: " + birinci.puanHesapla());
        System.out.println("Birinci Eşit Ağırlık Öğrencinin Puanı: " + birinci.puanHesapla());
    }
    public static < E extends Aday > E  birinci (E e1, E e2){

        if(e1.puanHesapla() > e2.puanHesapla()){
            return e1;
        }
        else{
            return e2;
        }
    }
}