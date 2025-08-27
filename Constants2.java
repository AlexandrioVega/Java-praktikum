public class Constants2 {
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth *
        CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}

// 1. Bagaimana output dari masing masing class Constants dan Constants2?
// baik dari class Constants dan Constants2 menghasilkan input yang sama yaitu 
// Paper size in centimeters: 21.59 by 27.94

// 2. Apa perbedaan penggunaan final double dengan public static final double?
// Untuk final double itu bukan milik class tetapi milik objek, Tidak bisa diakses langsung dari luar class
// untuk Public static final double konstanta global milik class, bisa diakses dari mana saja tanpa objek. 
// Ada satu salinan saja yang dipakai bersama semua objek.