import Models.CikcikPostModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Helpers {

    public static void verilerTxtReader(){
        // verileri proje içerisinde bulunan veriler.txt dosyasından projeye aktarıyoruz
        File file = new File("C:\\Users\\taylan\\Desktop\\Bilge Can Cikcik\\src\\Veriler\\veriler.txt");

        try {
            //BufferedReader nesnesi ile file olarak yolunu vermiş olduğumuz dosyamızı okutuyoruz
            //okunan dosyada her satırı alarak satırları parçalayacak olan fonksiyona gönderiyoruz
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                shredTheData(st);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void shredTheData(String satır){
        //almış olduğumuz satırı toCharArray yardımı ile for içinde dönderebilmek için char tipinde bir diziye aktardık
        //veriler txt dosyamızda 5 adet verimiz ve 4 adet ; ayracımız olduğu için ayrac position ları tutabilmek içinde ayracPosition dizisini tanımladık
        //ilk for döngüsü ile ; karakterinin satır içerisinde ki position değerlerini aldık
        //
        char[] stringToCharArray = satır.toCharArray();
        int[] ayracPosition = new int[4];
        String idNo = "",cikcik = "",etiket = "",tarih = "",sayac = "";

        int k=0;
        for (int i=0;i<stringToCharArray.length;i++){
            if (stringToCharArray[i] == ';'){
                ayracPosition[k] = i;
                k++;
            }
        }

        int baslangıc = 1;
        int sonAyracPos = ayracPosition[3];
        for (int i=0;i<ayracPosition.length;i++){
            for (int j=baslangıc;j<ayracPosition[i];j++){
                if (stringToCharArray[j] != ';'){
                    if (i == 0){
                        idNo = idNo + stringToCharArray[j];
                    }else if (i == 1){
                        cikcik = cikcik + stringToCharArray[j];
                    }else if (i == 2){
                        etiket = etiket + stringToCharArray[j];
                    }else if (i == 3){
                        tarih = tarih + stringToCharArray[j];
                    }
                }
            }
            baslangıc = ayracPosition[i];
        }

        int sayacChar = (stringToCharArray.length-1)-sonAyracPos;//beğenileri hesaplamak için kurulan bir özel algoritma
        //bu kısımda satırın toplam uzunluğu ve son ; ayrac position bilgilerine göre ve ) değerinin hesabı yapılarak
        // beğeni değeri kaç olursa olsun okunacak hale getirildi

        for (int i=sonAyracPos+1;i<sonAyracPos+sayacChar;i++){
            sayac = sayac + stringToCharArray[i];
        }

        CikcikPostModel postModel = new CikcikPostModel();
        postModel.setIdNo(idNo);
        postModel.setCikcik(cikcik);
        postModel.setEtiket(etiket);
        postModel.setZaman(tarih);
        postModel.setSayac(Integer.parseInt(sayac));

        Main.cikcikPost.add(postModel);
    }


}
