package Models;

public class CikcikPostModel {
    // Model sınıfı her bir cikcik paylaşımı için oop ye uygun olarak modellenen bir sınıftır
    // Bu sınıf içerisinde belirtilmiş değişkenler bulunmaktadır
    // Her bir değişkenin kendi veri tipine uygun şekilde hazırlanmış get ve set fonksiyionları vardır
    // Set fonksiyonları(Metod) belirtilen değişkenin yeni değerini ayarlamak için kullanılır
    // Get fonksiyonları(Metod) belirtilen değişkenin Model sınıfı içerisinde var olan değerini bize verir

    // Bu model yapısında yapılandırıcı(Constructors) kullanmaya gerek duymadım.
    // Bunun sebebi ise, farklı bir yaklaşım ile projeyi tamamalamaktır

    // şayet yapılandırıcı bir fonksiyon tanılamış olsaydık, yeni bir cikcik paylaşımı oluşturmak daha kolay olacaktı

    String idNo;
    String cikcik;
    String etiket;
    String zaman;
    Integer sayac;

    public String getIdNo() {
        //getIdNo ile idNo değişkeninin değerini alabiliriz
        return idNo;
    }

    public void setIdNo(String idNo) {
        //setIdNo ile idNo değişkeninin yeni değerini ayarlayabiliriz
        this.idNo = idNo;
    }

    public String getCikcik() {
        //getCikcik ile cikcik değişkeninin değerini alabiliriz
        return cikcik;
    }

    public void setCikcik(String cikcik) {
        //setCikcik ile cikcik değişkeninin yeni değerini ayarlayabiliriz
        this.cikcik = cikcik;
    }

    public String getEtiket() {
        //getEtiket ile etiket değişkeninin değerini alabiliriz
        return etiket;
    }

    public void setEtiket(String etiket) {
        //setEtiket ile etiket değişkeninin yeni değerini ayarlayabiliriz
        this.etiket = etiket;
    }

    public Integer getSayac() {
        //getSayac ile sayac değişkeninin değerini alabiliriz
        return sayac;
    }

    public void setSayac(Integer sayac) {
        //setSayac ile sayac değişkeninin yeni değerini ayarlayabiliriz
        this.sayac = sayac;
    }

    public String getZaman() {
        //getZaman ile zaman değişkeninin değerini alabiliriz
        return zaman;
    }

    public void setZaman(String zaman) {
        //setZaman ile zaman değişkeninin yeni değerini ayarlayabiliriz
        this.zaman = zaman;
    }
}
