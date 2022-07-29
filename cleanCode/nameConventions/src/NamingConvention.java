//Class isimleri pascalCase ile yazılır.Ve çoğul isimlendirilmezler
public class NamingConvention {

    //Değişkenler(field) camelCase ile yazılır.
    private int id;
    private String firstName;

    //Constructor isimleri pascalCase ile yazılır.
    public NamingConvention() {
    }

    public void getByCategoryId(int categoryId){} // Metot isimleri ve metot parametreleri camelCase ile yazılır.
    public void getById(int id){
        int enBuyukSayi = 10; //Local değişkenler camelCase ile yazılır.
    }

    private int PI_SAYISI ; // Sabit isimlendirme kullanımında screaming snake case kullanılır.
}
