package task3;

public class solution3 {
    public static void main(String[] args) {
      int  A = 65536;
      int  B = 70000;
        System.out.println(square(A,B));
    }

    public static int square(int A, int B) {

        int tempSqrtCounter = 0;
        int sqrtCounter = 0;
        for (int i = A; i <= B; i++) {
            double result = Math.sqrt(i);
            if (result == Math.round(result)) {
                tempSqrtCounter++;
                while (true) {
                    result = Math.sqrt(result);
                    if(result== Math.round(result)) {
                        tempSqrtCounter++;
                }else {
                    break;}
                }
                if(tempSqrtCounter > sqrtCounter){
                    sqrtCounter = tempSqrtCounter;
                }
                tempSqrtCounter = 0;
            }
        }
        return sqrtCounter;
    }
}
