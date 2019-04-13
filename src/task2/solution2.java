package task2;

public class solution2 {
    public static void main(String[] args) {

        int[] A ={2, 2, -3, -4, -3, 3, 2, 2, -1, 1, 2, 5};
        //int[] A ={2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5};
        //int[] A = {0, 1, 0,1,0,1,0,1};

        System.out.println(methode1(A));
    }

    public static int methode1(int[] B) {
        int counter = 2;
        // the castles will be on the right and left edge
        boolean flagUp = false, flagDown = false;

        for (int i = 1; i < B.length; i++) {

            if (B[i] > B[i - 1]) {
                if (flagDown){
                    flagDown = false;
                    flagUp = true;
                    counter++;
                }
                else if (flagUp){
                    continue;
                }
                else {
                    flagUp = true;
                }
            }

            else if (B[i] < B[i - 1]) {
                if (flagDown){
                    continue;
                }
                else if (flagUp){
                    flagDown = true;
                    flagUp = false;
                    counter++;
                }
                else {
                    flagDown=true;
                }
            }
        }
        return counter;
    }
}
