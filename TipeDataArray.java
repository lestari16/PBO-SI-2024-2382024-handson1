public class TipeDataArray {
    public static void min(String[] args){
        //array - kumpulan dari sebuah data dengan tipe data yang sama
        int[] KumpulanAngka = new int[3];
        KumpulanAngka[0] = 10;
        KumpulanAngka[1] = 40;
        KumpulanAngka[2] = 50;
        System.out.println(KumpulanAngka[2]);

        //Array multi-dimension
        int[][] kumpulanAngkaMultiDimension = new int [3][3];
        kumpulanAngkaMultiDimension[0]=KumpulanAngka;

        System.out.println(kumpulanAngkaMultiDimension [0][2]);

        
    }
}
