import java.util.HashMap;
import java.util.Scanner;

/**
 * class ini digunakan untuk menyimpan kosa kata bahasa inggris beserta artinya, meminta inputan dari user mengenai kata apa yang ingin ditranslate, dan mentranslate kata yang diinputkan oleh user
 */
class KamusEngToIndo implements KamusSederhana {
    HashMap<String, String> englishToIndonesian = new HashMap<>(); //raname dari engToIndo ke englishToIndonesian

    /**
     * konstruktor default yang berisi kosa kata bahasa inggris beserta dengan artinya
     */
    public KamusEngToIndo(){
        englishToIndonesian.put("apple","apel");
        englishToIndonesian.put("banana","pisang");
        englishToIndonesian.put("cat","kucing");
        englishToIndonesian.put("dog","anjing");
        englishToIndonesian.put("house","rumah");
    }

    /**
     * method ini berfungsi untuk mentranslate kata dari bahasa inggris yang diinpukan oleh user ke bahasa indonesia
     */
    @Override
    public void translate(){ //rename dari input word & extract interface
        //String word = inputword(); dilakukan inline variable setelah melakukan extract method
        String translate = englishToIndonesian.get(inputword());
        if (translate != null){
            System.out.println("Terjemahan dalam bahasa indonesia: "+ translate);
        }else {
            System.out.println("Kata tidak ditemukan!!!");
        }
    }

    /**
     * method ini berfungsi untuk meminta inputan berupa kosa kata yang ingin ditranslate oleh user dari bahasa inggris ke indonesia
     * @return kata yang dimasukkan oleh pengguna untuk diterjemahkan.
     */
    @Override
    public String inputword() { //extract method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata dalam bahasa inggris: ");
        String word = scanner.nextLine().toLowerCase(); //toLowercase agar memastikan input dari pengguna tidak akan gagal meskipun mengunakan huruf kapitar karna akan dikonversi ke huruf kecil
        return word;
    }
}

/**
 * class ini digunakan untuk menyimpan kosa kata bahasa indonesia beserta terjemahan dalam bahasa inggrisnya, meminta inputan dari user mengenai kata apa yang ingin ditranslate ke bahasa inggris, dan mentranslate kata yang diinputkan oleh user
 */
class KamusIndoToEng implements KamusSederhana{
    HashMap<String, String > indonesianToEnglish = new HashMap<>(); //rename dari indoToEng

    /**
     * method ini merupakan method default yang hanya berisi daftar kosa kata bahasa indonesia beserta terjemahannya dalam bahasa inggris
     */
    public KamusIndoToEng(){
        indonesianToEnglish.put("apel","apple");
        indonesianToEnglish.put("pisang","banana");
        indonesianToEnglish.put("kucing","cat");
        indonesianToEnglish.put("anjing","dog");
        indonesianToEnglish.put("rumah","house");
    }

    /**
     * method ini berfungsi untuk mentranslate kosa kata bahasa indonesia ke bahasa inggris
     */
    @Override
    public void translate(){ //rename dari inputword
        String translate = indonesianToEnglish.get(inputword()); //bisa dilakukan inline variable
        if (translate != null){
            System.out.println("Terjemahan dalam bahasa indonesia: "+translate);
        }else {
            System.out.println("Kata tidak ditemukan!!!");
        }
    }

    /**
     * method ini digunakan untuk meminta inputan kosa kata bahasa indonesia dari user yang akan ditranslate ke bahasa inggruis
     * @return word mengembalikan word yang merupakan variabel untuk menyimpan inputan user mengenai kosa kata yang ingin ditranslate
     */
    @Override
    public String inputword() {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.print("Masukkan kata dalam bahasa indonesia: ");
        word = scanner.nextLine().toLowerCase();
        return word;
    }
}

/**
 * class ini merupakan class utama yang menjalankan semua kode, dalam kelas ini membuat objek dari kelas KamusEngToIndo dan KamusIndoToEng,
 * menampilkan menu utama dari aplikasi yaitu translate kata ke bahasa inggris dan indonesia,
 * meminta inputan user untuk memilih menu yang diinginkan lalu membuat kondisi sebagai respon dari inputan user dan memanggil method method dari class nya masing-masing untuk melakukan tugasnya sesuai dengan menu yang diinputkan oleh user
 */
public class MainApp{ //hasil dari move method
    /**
     * method utama yang menjalankan program
     * @param args Argumen dari command line (tidak digunakan)
     */
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
