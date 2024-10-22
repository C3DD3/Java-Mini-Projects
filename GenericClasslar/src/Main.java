public class Main {
    public static void main(String[] args) {

        Character[] char_Dizi = {'J', 'A', 'V', 'A'};
        Integer[] int_Dizi = {1, 2, 3, 4, 5, 6};

        String[] str_Dizi = {"Java", "C++", "Python", "SQL"};

        Ogrenci[] ogr_Dizi = {new Ogrenci("Eyüp"), new Ogrenci("Bayram"), new Ogrenci("Asiye")};


        YazdirmaSinifi<Character> char_yazdir = new YazdirmaSinifi<Character>();
        YazdirmaSinifi<Integer> int_yazdir = new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<String> str_yazdir = new YazdirmaSinifi<String>();
        YazdirmaSinifi<Ogrenci> ogr_yazdir = new YazdirmaSinifi<Ogrenci>();

        char_yazdir.yazdir(char_Dizi);
        System.out.println("**********************************");
        int_yazdir.yazdir(int_Dizi);
        System.out.println("**********************************");
        str_yazdir.yazdir(str_Dizi);
        System.out.println("**********************************");
        ogr_yazdir.yazdir(ogr_Dizi);
        System.out.println("**********************************");
    }
}