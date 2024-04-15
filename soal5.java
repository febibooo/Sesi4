public class soal5 {
    public static void main(String[] args){
        int[] angka ={1,3,5,7,9,2};

        int max = angka[0];

        for (int i = 0; i < angka.length; i++) {
            if (max <= angka[i]){
                max = angka[i];
                i++;
            }
        }
        System.out.println("Angka terbesar : "+ max);

    }
}
