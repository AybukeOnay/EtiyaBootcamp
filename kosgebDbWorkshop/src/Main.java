import entities.*;

import java.time.LocalDate;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank(1,"Garanti");
        BankUser bankUser = new BankUser(1,"Ahmet","1234",bank);

        Personnel personnel1 = new Personnel(1, "testPerson", "123", "Adam","deneme", "123", "10000");
        Personnel personnel2 = new Personnel(2,"personel2","098", "Fatma","Demir","021","2000");

        Corporate corporate = new Corporate(1,"Etiya","100","011","Bilisim");

        Union union = new Union(1,"Sendika","000","SSK");

        Role role1 = new Role(1,"Kredi goruntuleyebilir");
        Role role2 = new Role(2,"Kredi onaylayabilir");
        Role role3 = new Role(3,"Kredi sorgulayabilir");

        UserRole userRole1 = new UserRole(1,personnel1,role1);
        UserRole userRole2 = new UserRole(2,personnel1,role3);
        UserRole userRole3 = new UserRole(3,personnel2,role2);

        personnel1.getUserRoles().add(userRole1);
        personnel1.getUserRoles().add(userRole2);
        personnel2.getUserRoles().add(userRole3);

        role1.getUserRoles().add(userRole1);
        role2.getUserRoles().add(userRole2);
        role3.getUserRoles().add(userRole3);

        Credit credit1 = new Credit(1, "Erzurum Kredisi", LocalDate.of(2022, 7, 1));
        Credit credit2 = new Credit(2, "Yüz Bin Kobi Kredisi", LocalDate.of(2022, 1, 12));

        Feature feature1 = new Feature(1, "Destek Oranı", "2000");
        Feature feature2 = new Feature(2, "Üst Limit", "10000");
        Feature feature3 = new Feature(2, "Alt Limit", "1000");
        Feature feature4 = new Feature(2, "Kredi Hacmi", "300");
        Feature feature5 = new Feature(2, "Yedek Hacmi", "3000");
        Feature feature6 = new Feature(2, "Olçek", "yok");
        Feature feature7 = new Feature(2, "Il", "Erzurum");
        Feature feature8 = new Feature(2, "Sektör", "Tarim");

        CreditFeatures creditFeatures1 = new CreditFeatures(1, credit1, feature1);
        CreditFeatures creditFeatures2 = new CreditFeatures(2, credit1, feature2);
        CreditFeatures creditFeatures3 = new CreditFeatures(3, credit1, feature3);
        CreditFeatures creditFeatures4 = new CreditFeatures(4, credit1, feature4);
        CreditFeatures creditFeatures5 = new CreditFeatures(5, credit1, feature5);
        CreditFeatures creditFeatures6 = new CreditFeatures(6, credit1, feature7);
        CreditFeatures creditFeatures7 = new CreditFeatures(7, credit1, feature8);
        CreditFeatures creditFeatures8 = new CreditFeatures(8, credit2, feature6);

        credit1.getCreditFeatures().add(creditFeatures1);
        credit1.getCreditFeatures().add(creditFeatures2);
        credit1.getCreditFeatures().add(creditFeatures3);
        credit1.getCreditFeatures().add(creditFeatures4);
        credit1.getCreditFeatures().add(creditFeatures5);
        credit1.getCreditFeatures().add(creditFeatures6);
        credit1.getCreditFeatures().add(creditFeatures7);
        credit2.getCreditFeatures().add(creditFeatures8);

        ApplicationStatus applicationStatus1 = new ApplicationStatus(1, "Asil basvurunuz onay bekliyor.");
        ApplicationStatus applicationStatus2 = new ApplicationStatus(2, "Yedek basvurunuz onay bekliyor.");
        ApplicationStatus applicationStatus3 = new ApplicationStatus(3, "Basvuru kabul edildi");
        ApplicationStatus applicationStatus4 = new ApplicationStatus(4, "Basvuru kabul edilmedi.");

        Application application1 = new Application(1,applicationStatus1,corporate,credit1);
        Application application2 = new Application(2,applicationStatus4,union,credit2);

        System.out.println("Basvuru : " + application1.getId());
        System.out.println("\t Basvuru sahibinin kullanici adi : " + application1.getApplicant().getUserName());
        System.out.println("\t Basvurulan kredi ismi : " + application1.getCredit().getName());
        System.out.println("\t Basvurulan kredinin ozellikleri : " );
        for(CreditFeatures creditFeatures : credit1.getCreditFeatures()) {
            System.out.println("\t\t"+creditFeatures.getFeature().getName());
        }
        System.out.println("\t Basvuru durumu : " + application1.getApplicationStatus().getStatusName() );

        //for (UserRole userRole : role1.getUserRoles()){
          //  System.out.println(userRole.getRole().getName());
        //}

    }
}
