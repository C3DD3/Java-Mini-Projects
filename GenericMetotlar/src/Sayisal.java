public class Sayisal extends Aday{
    public Sayisal(int matematik, int turkce, int fizik, int edebiyat) {
        super(matematik, turkce, fizik, edebiyat);
    }

    @Override
    public int puanHesapla() {
        return getMatematik() * 5 + getFizik() * 4 + getTurkce() * 5 + getEdebiyat() * 1;
    }
}
