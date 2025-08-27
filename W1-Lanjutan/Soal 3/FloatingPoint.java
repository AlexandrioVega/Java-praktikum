class FloatingPoint{
    public static void main(String[] args) {
        double x = 92.98;
        int nx = (int) Math.round(x);
        System.out.println("nilai nx " + nx);
    }
}

// tanpa math.round

// 1. Pada kasus berikut jelaskan nilai nx setelah digunakan Math.round(x);
// nilai nx 93

// 2. Kenapa dibutuhkan cast (int) dalam penggunaan Math.round(x) ?
// karena default desimal di java menggunakan double, jadi Math.round(x) akan mengembalikan nilai long
// karena Math.round(double) -> long. Berhubung variabel nx adalah integer, akan terjadi sebuah error.
// karena variabel integer tidak dapat menampung bilangan long

// Kendala ketika ingin me run class FloatingPoint, dikarenakan error yang disebabkan oleh
// keyword untuk class di java pakai huruf kecil, tidak diawali dengan huruf kapital
// Alex sedikit kebingungan disini, karena tidak terbiasa dengan format program di java
// yang beragam mulai dari class, variabel/method, Constant.

// solusi Alex cukup mengganti huruf awalnya dengan lowercase