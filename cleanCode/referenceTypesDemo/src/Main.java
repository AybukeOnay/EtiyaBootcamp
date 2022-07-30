public class Main {
    public static void main(String[] args) {

        //Değer tipler bellekte stack bölgesinde oluşurlar.Değer tipler değer tutarlar.
        int sayi1 = 20;
        int sayi2 = 25;
        sayi1 = sayi2;
        sayi2=30;
        System.out.println(sayi1);

        //Referans tipler belleğin heap bölgesinde oluşurlar.Heap'te bir adres(referans) tutulur.
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar1 = sayilar2;
        sayilar2[0] = 30 ;
        System.out.println(sayilar1[0]);

        //Değer tipler --> int,double,float
        //Referans tipler --> class,interface,array

    }
}
