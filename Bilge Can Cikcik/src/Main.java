import Models.CikcikPostModel;
import Models.CikcikUserModel;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static ArrayList<CikcikUserModel> cikcikUsers = new ArrayList<CikcikUserModel>();
    static ArrayList<String> cikcikTag = new ArrayList<String>();
    static ArrayList<CikcikPostModel> cikcikPost = new ArrayList<CikcikPostModel>();

    public static void main(String args[]){
        Helpers.verilerTxtReader();
        cikcikWelcomePage();
    }

    public static void cikcikWelcomePage(){
        //cikcikWelcomePage fonksiyonu uygulamanın ilk açılışında sunulan ögeleri sağlamaktadır
        System.out.println("*  **  **  **  **  **  **  ** ** **  **  **  **  **  **  **  **  *");
        System.out.println("*  **  **  **  **  **  **  ** ** **  **  **  **  **  **  **  **  *");
        System.out.println("*                                                                *");
        System.out.println("*                 Cikcikler Uygulamasına Hoşgeldiniz             *");
        System.out.println("*                                                                *");
        System.out.println("*                          Bilge Can                             *");
        System.out.println("*                          195541001                             *");
        System.out.println("*                                                                *");
        System.out.println("*  **  **  **  **  **  **  ** ** **  **  **  **  **  **  **  **  *");
        System.out.println("*  **  **  **  **  **  **  ** ** **  **  **  **  **  **  **  **  *");
        System.out.println("*                                                                *");
        System.out.println("*----------------------------------------------------------------*");
        System.out.println("*                                                                *");
        System.out.println("*                Cikcikler Uygulama Menüsü                       *");
        System.out.println("*                                                                *");
        System.out.println("*        Cikcikler Uygulamasına Üye Olmak İçin - 1               *");
        System.out.println("*     Cikcikler Uygulaması Paylaşımlarını Görmek İçin - 2        *");
        System.out.println("*                 Cikcik Paylaşmak İçin - 3                      *");
        System.out.println("*             Cikcik Etiketlerini Görmek İçin - 4                *");
        System.out.println("*           Cikcik Kullanıcılarını Görmek İçin - 5               *");
        System.out.println("*           **************************************               *");
        System.out.println("*        Soru 1 idNo son rakamı 3 olan kullanıcılar - 6          *");
        System.out.println("*            Soru 2 en fazla yeniden cikciklenen - 7             *");
        System.out.println("*           Soru 3 Verilen Tarihte En çok Etiket - 8             *");
        System.out.println("*               Soru 4 en Kısa cikcik bilgisi - 9                *");
        System.out.println("*                                                                *");
        System.out.println("*  **  **  **  **  **  **  ** ** **  **  **  **  **  **  **  **  *");
        System.out.println("*  **  **  **  **  **  **  ** ** **  **  **  **  **  **  **  **  *");
        menuSelection();
    }

    public static void menuSelection(){
        // menuSelection fonksiyonu uygulama açıldıktan sonra kullanıcının hangi işlemi yapmak istediğini seçecerek
        // ilgili menüye erişimini sağlar

        Scanner keyboard = new Scanner(System.in);
        System.out.println("*                                                                *");
        System.out.println("Lütfen erişmek istediğiniz Menü Numarasını Giriniz : ");

        int menuNo = keyboard.nextInt();

        switch (menuNo){
            case 1://cikcikler uygulamasına üye olmak için
                cikcikRegister();
                break;
            case 2://cikcikler uygulamasında paylaşımları görmek için
                getCikcikPosts();
                break;
            case 3://cikcikler uygulaması üzerinde paylaşım yapmak için
                break;
            case 4://cikcikler uygulamasında bulunan etiketleri görmek için
                break;
            case 5://cikcikler uygulamasına üye olan kullanıcıları görmek için
                getCikcikUsers();
                break;
            case 6://cikcikler uygulamasına üye olan kullanıcıları görmek için
                System.out.println("*   Aranan Rakam Adeti  "+Sorular.soru1("0"));
                menuSelection();
                break;
            case 7://cikcikler uygulamasına üye olan kullanıcıları görmek için
                System.out.println("*   En fazla cikciklenen kullanıcı ülkesi  "+Sorular.soru2());
                menuSelection();
                break;
            default:
                System.out.println("*                 Eksik veya Hatalı Menü Seçtiniz                *");
                menuSelection();
                break;
        }
    }

    public static void cikcikRegister(){
        // cikcikRegister fonksiyonu yeni bir kullanıcı oluşturmak için hazırlanmıştır

        String name,surname,country;
        Integer age;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("*                                                                *");
        System.out.println("Lütfen Adınızı Giriniz : ");
        name = keyboard.nextLine();
        System.out.println("*                                                                *");
        System.out.println("Lütfen Soyadınızı Giriniz : ");
        surname = keyboard.nextLine();
        System.out.println("Lütfen Ülkenizi Giriniz(Türkiye,Fransa,Almanya) : ");
        country = keyboard.nextLine();
        System.out.println("Lütfen Yaşınızı Giriniz(10 dan büyük 95 den küçük) : ");
        age = keyboard.nextInt();

        // Scanner sınıfı ile cmd-console ekran üzerinden kullanıcıdan verileri alarak
        // bu fonksiyona özel olan değişkenlere atadık.
        // CikcikUserModel sınıfı ile oop ye uygun olarak kullanıcımızı model olarak oluşturarak
        // Main sınıfı içerisinde bulunan arrayList tipinde ki kullanıcılar listesine ekleyeceğiz

        switch (country){
            case "Türkiye":
                break;
            case "Fransa":
                break;
            case "Almanya":
                break;
            default:
                System.out.println("*                                                                *");
                System.out.println("*     Hatalı Ülke Seçtiniz.Üyelik İşlemi baştan Başlatılıyor     *");
                cikcikRegister();
                break;
        }

        CikcikUserModel userModel = new CikcikUserModel();

        if (age>10 && age<95){
            userModel.setName(name);
            userModel.setSurname(surname);
            userModel.setAge(age);
            userModel.setCountry(country);
            userModel.setIdNo(generateUserId(country));//generateUserId fonksiyonu ile kullanıcıya özel bir idNo oluşturduk

            // userModel değişkeni bu fonksiyon içerisinde özel tanımlı olan kullanıcı model nesnesiydi
            // userModel değişkenini son olarak cikcikUsers isimli kullanıcı modeli tipindeki arrayList e ekledik

            cikcikUsers.add(userModel);

            System.out.println("*                                                                *");
            System.out.println("*          Tebrikler CikCikler Uygulamasına Kayıt Oldunuz        *");
            menuSelection();//tekrar uygulama menüsüne giriş hakkı veriyoruz
        }else{
            System.out.println("*                                                                *");
            System.out.println("*      Hatalı Yaş Girdiniz.Üyelik İşlemi baştan Başlatılıyor     *");
            cikcikRegister();
        }
    }

    public static String generateUserId(String country){
        // dışarıdan ülke adını alarak özel ülke kodunu oluşturduk
        // daha sonra random olarak 10 karakterlik bir sayı oluşturduk ve kullanıcıya özel bir idNo üreterek
        // bu idNo değerini geriye döndürdük
        String idNo = null;
        String countryCode = null;

        switch (country){
            case "Türkiye":
                countryCode = "TR";
                break;
            case "Fransa":
                countryCode = "FR";
                break;
            case "Almanya":
                countryCode = "DE";
                break;
        }

        idNo = countryCode;

        for (int i=0;i<10;i++){
            idNo = idNo + (int)((Math.random() * 9)+0);
        }

        return idNo;
    }

    public static void getCikcikUsers(){
        // getCikcikUsers fonksiyonu ile kullanıcı listesini gösteriyoruz

        System.out.println("*                                                                *");
        System.out.println("*                CikCikler Uygulaması Kullanıcıları              *");

        int userSize = cikcikUsers.size();

        if (userSize>0){
            for (int i=0;i<userSize;i++){
                System.out.println("* "+(i+1)+"-> Ad : "+cikcikUsers.get(i).getName()+" -- Soyad : "+cikcikUsers.get(i).getSurname()
                        +" -- Ülke : "+cikcikUsers.get(i).getCountry()+" -- Yaş : "+cikcikUsers.get(i).getAge()
                        +" -- IdNo : "+cikcikUsers.get(i).getIdNo()
                        +" *");
            }
            System.out.println("*  **  **  **  **  **  **  ** ** **  **  **  **  **  **  **  **  *");
            System.out.println("*                Toplam "+userSize+" Kullanıcı                   *");
            System.out.println("*  **  **  **  **  **  **  ** ** **  **  **  **  **  **  **  **  *");
            menuSelection();//tekrar uygulama menüsüne giriş hakkı veriyoruz
        }else {
            System.out.println("*                                                                *");
            System.out.println("*          CikCikler Uygulamasına Kayıtlı Kullanıcı Yok          *");
            menuSelection();//tekrar uygulama menüsüne giriş hakkı veriyoruz
        }
    }

    public static void getCikcikPosts(){
        int postSize = cikcikPost.size();

        for (int i=0;i<postSize;i++){
            System.out.println("* "+i+" **  **  **  **  **  **  ** ** **  **  **  **  **  **  *  *");
            System.out.println("* Kullancı IdNo :"+cikcikPost.get(i).getIdNo());
            System.out.println("* Konu :"+cikcikPost.get(i).getCikcik());
            System.out.println("* Etiket :"+cikcikPost.get(i).getEtiket());
            System.out.println("* Zaman :"+cikcikPost.get(i).getZaman());
            System.out.println("* Sayac :"+cikcikPost.get(i).getSayac());
            System.out.println("*  **  **  **  **  **  **  ** ** **  **  **  **  **  **  **  **  *");
        }
        menuSelection();//tekrar uygulama menüsüne giriş hakkı veriyoruz

    }

}
