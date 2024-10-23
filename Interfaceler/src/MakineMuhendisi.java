import java.lang.reflect.Array;

public class MakineMuhendisi implements IMuhendis, ICalisma {
    private boolean askerlik;
    private boolean adliSicil;

    @Override
    public void calis() {
        System.out.println("Makine mühendisi çalışıyor.");
    }

    public MakineMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik) {
            System.out.println("Askerliğimi Yaptım.");
        } else {
            System.out.println("Askerliğimi Henüz Yapmadım.");
        }

    }

    @Override
    public String mezuniyet_ortalaması(double derece) {
        return "Ortalamam : " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if (adliSicil) {
            System.out.println("Adli sicil kaydım bulunuyor.");
        } else {
            System.out.println("Hehangi bir adli sicil kaydım bulunmuyor.");
        }

    }

    @Override
    public void is_tecrubesi(String[] array) {
        if (array.length == 0) {
            System.out.println("Herhangi bir iş tecrübem bulunmuyor. ");
        } else {
            System.out.println("Makine mühendisi olarak şu şirketlerde çalıştım. ");

            for (int i = 0; i < array.length; i++) {

                System.out.println(array[i]);
            }

        }
    }
    public void referans_getir(String[] array){
        if (array.length == 0) {
            System.out.println("Herhangi bir referansım bulunmuyor.");
        }
        else {
            System.out.println("Referansım : ");

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
