package prog5;
import java.util.*;

public class Prog5 {

	public static void main(String[] args) throws Exception {
		try(Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int K = s.nextInt();
            int[] a = new int[N];
 
            for(int i = 0; i < N; i++) {
                switch (s.next().charAt(0)) {
                    case 'g': a[i] = 0; break;
                    case 'r': a[i] = 1; break;
                    case 'y': a[i] = 2; break;
                }
            }
 
            int[] temp = new int[N];
            int j = 0, r = 0;
 
            for(int i = 0; i < N; i++) {
                a[i] += j;
 
                switch (a[i] % 3) {
                    case 1: temp[i] = 2; r += 2; j += 2; break;
                    case 2: temp[i] = 1; r += 1; j += 1; break;
                    default: temp[i] = 0; break;
                }
 
                if ((i+1)-K >= 0)
                	j -= temp[i+1-K];
            }
            System.out.println(r);
        }
    }
}


