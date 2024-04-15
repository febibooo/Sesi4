public class soal1 {
    public static void main(String[] args){
        int[]numbers={2,3,5,7,9};
        double median;
        int length = numbers.length;

        if(length%2==0){
            median = (double) (numbers[length/2-1]+numbers[length/2])/2;
        }else{
            median = numbers[length/2];
        }
        System.out.println("Median :"+ median);
//////////////////////////////////////////////////////////////
        int[] nomor={1,2,3,4};
        int panjang = nomor.length;
        if(panjang%2==0){
            median = (double) (nomor[panjang/2-1]+nomor[panjang/2])/2;
        }else{
            median = nomor[panjang/2];
        }
        System.out.println("Median :"+ median);



    }
}
