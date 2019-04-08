package task1;

import java.util.Arrays;
/*Write a function that, given an integer N(1<=N<=100), return san array containing N unique integers that sum up to 0.
  The function can return any such array.
  For example, given N=4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
  The answer [1, -1, 1, 3] would be oncorrect (because value 1 occurs twice). For N=3 one of the possible answer is [-1, 0, 1] (but there ar emany more correct answers).
*/
public class solution1 {
    public static void main(String[] arg) {
        int N = 4;
        int S =0;
        int[] tab2 = calculate(N);
        System.out.println(Arrays.toString(tab2));
        for (int j=0; j<N; j++){
          S =  S + tab2[j];
    }
        System.out.println("powinno być zero "+ S);
    }

    public static int[] calculate(int N) {
        int[] tab = new int[N];
        if (N % 2 == 1) {
            for (int i = 0; i < N; i++) {
                tab[i] = N / 2 - i;
            }
        } else {
            for (int i = 0; i < N; i++) {
                tab[i] = N / 2 - i;
                if(tab[i]<=0){
                    tab[i]--;
                }
            }
        }
        return tab;
    }
}