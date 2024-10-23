public class Main {
    public static void main(String[] args) {

        //IMuhendis muhendis1 = new PcMuhendisi(true, false);
        PcMuhendisi muhendis1 = new PcMuhendisi(true, false);

        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalaması(3.07));
        String[] tecrube = {"BİM", "KAFEİN", "TÜBİTAK"};
        muhendis1.is_tecrubesi(tecrube);

        System.out.println("\n**********************************************\n");

        //Imuhendis muhendis2 = new MakineMuhendisi(false, true);
        MakineMuhendisi muhendis2 = new MakineMuhendisi(false, true); //Daha güvenli


        muhendis2.askerlik_durumu_sorgula();
        muhendis2.adli_sicil_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalaması(3.02));
        String[] tecrubee = {};
        muhendis2.is_tecrubesi(tecrubee);
        String[] referans = {"Mehmet DURDU..."};
        //((MakineMuhendisi)muhendis2).referans_getir(referans);
        muhendis2.referans_getir(referans);                            //Daha güvenli
        muhendis2.calis();
    }
}