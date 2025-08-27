class ConvertDataType{
    static short methodOne(long l){
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args){
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}


// 1. Jelaskan output nilai dari variable b.
// Output nilai 10

// 2. Jelaskan apa yang berubah dari variable d menjadi variable b setelah dilakukan cast ?
// Variabel d bertipe double (64 bit bilangan desimal)
// setelah beberapa kali casting nilai berubah menjadi (8 bit bilangan buat)
// perubahan nilai yang terjadi hanya menghilangkan angka dibelakang koma 10.25 -> 10 saat truncation dari float -> Long
// nilai akhirnya tetap 10 hanya saja berganti tipe dari double ke byte 

// kendala 
// tidak paham fungsi dari truncation sebelumnya. karena jika kita memaksakan untuk melakukan parsing data 
// dari desimal ke bilangan bulat atau sebaliknya akan terjadi error

// solusinya
// memahami fungsi truncation lebih dalam. dikarenakan truncation berfungsi untuk menghilangkan angka pecahan ketika 
// dilakukan casting dari desimal ke bilangan bulat, bukan untuk membulatkan sebuah nilai dan pastikan nilai variabel 
// dapat memuat dari variabel yang di truncation