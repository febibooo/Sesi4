public class soal3 {
    public static void main(String[] args){
        int[] numbers1 = {1,3,9,27,81};
        boolean isNumbers1Geometri = true;
        if (numbers1.length >= 2) {
            double ratio = (double) numbers1[1] / numbers1[0];
            for (int i = 2; i < numbers1.length; i++) {
                if ((double) numbers1[i] / numbers1[i - 1] != ratio) {
                    isNumbers1Geometri = false;
                    break;
                }
            }
        }
        System.out.println(isNumbers1Geometri);
////////////////////////////////////////////////////
        int[] numbers2 = {2,4,8,16,32};
        boolean isNumbers2Geometri = true;
        if (numbers2.length >= 2) {
            double ratio = (double) numbers2[1] / numbers2[0];
            for (int i = 2; i < numbers2.length; i++) {
                if ((double) numbers2[i] / numbers2[i - 1] != ratio) {
                    isNumbers2Geometri = false;
                    break;
                }
            }
        }
        System.out.println(isNumbers2Geometri);
        /////////////////////
        int[] numbers3 = {2,4,6,8};
        boolean isNumbers3Geometri = true;
        if (numbers3.length >= 2) {
            double ratio = (double) numbers3[1] / numbers3[0];
            for (int i = 2; i < numbers3.length; i++) {
                if ((double) numbers3[i] / numbers3[i - 1] != ratio) {
                    isNumbers3Geometri = false;
                    break;
                }
            }
        }
        System.out.println(isNumbers3Geometri);
        /////////////////////
        int[] numbers4 = {2,6,18,54};
        boolean isNumbers4Geometri = true;
        if (numbers4.length >= 2) {
            double ratio = (double) numbers4[1] / numbers4[0];
            for (int i = 2; i < numbers4.length; i++) {
                if ((double) numbers4[i] / numbers4[i - 1] != ratio) {
                    isNumbers4Geometri = false;
                    break;
                }
            }
        }
        System.out.println(isNumbers4Geometri);
        /////////////////////////////////
        int[] numbers5 = {1,2,3,4,7,9};
        boolean isNumbers5Geometri = true;
        if (numbers5.length >= 2) {
            double ratio = (double) numbers5[1] / numbers5[0];
            for (int i = 2; i < numbers5.length; i++) {
                if ((double) numbers5[i] / numbers5[i - 1] != ratio) {
                    isNumbers5Geometri = false;
                    break;
                }
            }
        }
        System.out.println(isNumbers5Geometri);

    }
}
