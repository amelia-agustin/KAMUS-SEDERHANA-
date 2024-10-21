import java.util.HashMap;
import java.util.Scanner;

class KamusEngToIndo implements KamusSederhana {
    HashMap<String, String> englishToIndonesian = new HashMap<>(); //raname dari engToIndo ke englishToIndonesian

    public KamusEngToIndo(){
        englishToIndonesian.put("apple","apel");
        englishToIndonesian.put("banana","pisang");
        englishToIndonesian.put("cat","kucing");
        englishToIndonesian.put("dog","anjing");
        englishToIndonesian.put("house","rumah");
    }
    @Override
    public void translate(){ //rename dari input word & extract interface
        //String word = inputword(); dilakukan inline variable setelah melakukan extract method
        //String translate = englishToIndonesian.get(inputword()); //dilakukan inline variable
        if (englishToIndonesian.get(inputword()) != null){ //hasil dari inline variable translate
            System.out.println("Terjemahan dalam bahasa indonesia: "+ englishToIndonesian.get(inputword()));
        }else {
            System.out.println("Kata tidak ditemukan!!!");
        }
    }
    @Override
    public String inputword() { //extract method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata dalam bahasa inggris: ");
        String word = scanner.nextLine().toLowerCase(); //toLowercase agar memastikan input dari pengguna tidak akan gagal meskipun mengunakan huruf kapitar karna akan dikonversi ke huruf kecil
        return word;
    }
}
class KamusIndoToEng implements KamusSederhana{
    HashMap<String, String > indonesianToEnglish = new HashMap<>(); //rename dari indoToEng
    public KamusIndoToEng(){
        indonesianToEnglish.put("apel","apple");
        indonesianToEnglish.put("pisang","banana");
        indonesianToEnglish.put("kucing","cat");
        indonesianToEnglish.put("anjing","dog");
        indonesianToEnglish.put("rumah","house");
    }
    @Override
    public void translate(){ //rename dari inputword
        String word = inputword();
        String translate = indonesianToEnglish.get(word); //bisa dilakukan inline variable
        if (translate != null){
            System.out.println("Terjemahan dalam bahasa indonesia: "+translate);
        }else {
            System.out.println("Kata tidak ditemukan!!!");
        }
    }
@Override
    public String inputword() {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.print("Masukkan kata dalam bahasa indonesia: ");
        word = scanner.nextLine().toLowerCase();
        return word;
    }
}
public class MainApp{ //hasil dari move method
    public static void main(String[] args) {
        KamusEngToIndo englishtoindo = new KamusEngToIndo();
        KamusIndoToEng indotoenglish = new KamusIndoToEng();

        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Kamus sederhana");
            System.out.println("1. Terjemahan inggris ke indonesia");
            System.out.println("2. Terjemahan indonesia ke inggrisa");
            System.out.println("3. keluar");
            System.out.print("Pilih 1/2: ");
            input = scanner.nextLine();
            if (input.equals("1")){
                englishtoindo.translate();
            }else if (input.equals("2")){
                indotoenglish.translate();
            }else {
                System.out.println("Terimakasih telah menggunakan kamus sederhana :)");
            }
        }while (input.equals("1") || input.equals("2"));
    }
}
