public class EsitAgirlik extends Aday {
    public EsitAgirlik(int matematik, int turkce, int fizik, int edebiyat) {
        super(matematik, turkce, fizik, edebiyat);
    }

    @Override
    public int puanHesapla() {
        return getMatematik()*5 + getFizik()*1 + getTurkce()*5+ getEdebiyat()*4;
    }
}
