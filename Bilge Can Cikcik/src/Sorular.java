public class Sorular {

    public static int soru1(String searchChar){
        int sayac=0;
        int usersSize = 0;

        usersSize = Main.cikcikPost.size();

        if (usersSize>0){
            for (int i=0;i<usersSize;i++){
                String idNo = Main.cikcikPost.get(i).getIdNo();
                String lastChar = idNo.substring(idNo.length() - 1);
                if (lastChar.equalsIgnoreCase(searchChar)){
                    sayac+=1;
                }
            }
        }

        return sayac;
    }

    public static String soru2(){
        int userPos=0;
        int sayac=0;
        int usersSize = 0;

        usersSize = Main.cikcikPost.size();

        if (usersSize>0){
            for (int i=0;i<usersSize;i++){
                int sayacIn = Main.cikcikPost.get(i).getSayac();
                if (sayac<sayacIn){
                    sayac=sayacIn;
                    userPos = i;
                }
            }
        }

        String idNo = Main.cikcikPost.get(userPos).getIdNo();
        String county="";
        //contains fonksiyonu ile idNo değişkeni içerisinde ülke kodlarını arıyoruz
        if (idNo.contains("TR")){
            county = "Türkiye";
        }else if (idNo.contains("FR")){
            county = "Fransa";
        }else if (idNo.contains("DE")){
            county = "Almanya";
        }
        return county;
    }

}
