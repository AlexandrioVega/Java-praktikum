import java.util.Scanner;
public class Soal1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long testcase;
        testcase = sc.nextLong();
        for(long i = 0; i < testcase; i++){
            String s = sc.next();
            try{
                long tes = Long.parseLong(s);
                System.out.println(tes + " can be fitted in:");
                if(tes >= -128 && tes <= 127){
                    System.out.println("* Byte");
                }
                if(tes >= -32768 && tes <= 32767){
                    System.out.println("* Short");
                }
                if(tes >= -2147483648 && tes <= 2147483647){
                    System.out.println("* Int");
                }
                if(tes >=  -9223372036854775808L && tes <= 9223372036854775807L){
                    System.out.println("* Long");
                }
            }
            catch(NumberFormatException e) {
                System.out.println(s +" can’t be fitted anywhere");
            }
        }
    }
}

// Kendalanya kebanyakan ada di variabel Long nya sama ketika diinputkan nilai yang lebih besar dari long
// 1. ketika ingin bikin perbandingan dengan nilai long, kita harus berikan huruf L di akhir angka tersebut
// karena compiler di java default integer nya int, jadi kita memberitahukan bahwa angka tersebut adalah Long
// 2. ketika diinputkan angka yang lebih besar angka tersebut akan menyebabkan eror karena Scanner.nextLong() 
// akan membaca input tersebut dan melemparkannya ke InputMismatchException. Solusinya kita ubah inputan tes kita
// ke dalam string dulu, baru kita ubah lagi ke dalam long, dikarenakan kita pakai metode mekanisme try dan catch
// maka ketika terjadi error karena variabel tes tidak bisa dimasukkan dengan nilai lebih dari long jadi akan lompat ke catch