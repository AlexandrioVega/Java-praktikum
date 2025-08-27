public class Soal{
    public static void main(String[] args){
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1+angka2);
        System.out.println("Hasil 1 " +hasil);
    }
}

// Two Complement's
// 125 = 1111101
// 6 = 110
// 131 = 10000011 
// MSB nya 1 jadi 10000011 di ubah ke bentuk negasinya 01111100
// 01111100 ditambah 1 --> 01111100 + 00000001 = 01111101 = 125
// Dikarenakan MSB nya 1 diawal maka nilai 125 nya diubah kedalam bentuk negatif
// MSB = Most Significant Bit (bit paling kiri penanda bilangan positif/negatif)

// kendala Alex melupakan materi Two Complements yang diajarkan pada tingkat 1