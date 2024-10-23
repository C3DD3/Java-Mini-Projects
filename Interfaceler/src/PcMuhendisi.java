public class PcMuhendisi implements IMuhendis {
    private boolean askerlik ;
    private boolean adliSicil;

    public PcMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    public boolean isAskerlik() {
        return askerlik;
    }

    public void setAskerlik(boolean askerlik) {
        this.askerlik = askerlik;
    }

    public boolean isAdliSicil() {
        return adliSicil;
    }

    public void setAdliSicil(boolean adliSicil) {
        this.adliSicil = adliSicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik){
            System.out.println("Askerliğimi Yaptım.");
        }
        else {
            System.out.println("Askerliğimi Henüz Yapmadım.");
        }

    }

    @Override
    public String mezuniyet_ortalaması(double derece) {
        return "Ortalamam : " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if (adliSicil){
            System.out.println("Adli sicil kaydım bulunuyor.");
        }
        else {
            System.out.println("Hehangi bir adli sicil kaydım bulunmuyor.");
        }

    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("Bilgisayar mühendisi olarak şu şirketlerde çalıştım: ");

        for (int i = 0; i < array.length; i++ ){

            System.out.println(array[i]);
        }

    }
}
