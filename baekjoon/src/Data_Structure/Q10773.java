package Data_Structure;

/*
* sliver4
* 2022-08-08
*
* 첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)

이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며, 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.

정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.
*
*  https://www.acmicpc.net/problem/10773 */

import java.util.Scanner;
import java.util.Stack;
public class Q10773 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        stack.setSize(size);

        for(int i=0; i<size; i++) {
            System.out.print("n : ");
            int temp = scan.nextInt();

            if(temp==0)
                stack.pop();
            else
                stack.add(temp);

        }
        Integer result = 0;
        for(Integer i : stack) {
            if(i != null)
                result+=i;
        }

        System.out.println(result);


        stack.clear(); scan.close();
    }
}
