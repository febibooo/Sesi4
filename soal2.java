public class soal2 {
    public static void main(String[] args){
        int[][] numbers={
                {1,3,4},
                {2},
                {3,7,10}
        };
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                total += numbers[i][j];
            }
        }
        System.out.println("Total Array Numbers:"+total);

        ///////////////////////////////
        int[][] numbers2={
                {2,9},
                {0,3,10},
                {1,9}
        };
        int total2 = 0;

        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length ; j++) {
                total2 += numbers2[i][j];
            }
        }
        System.out.println("Total Array Numbers:"+total2);
    }
}
