핵심은 123S이렇게 나올때다 만약 이전에가 0보다 크고 숫자였을때를 체크해줘야합니다.

import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if(Character.isDigit(c)){
                if(i>0 && Character.isDigit(dartResult.charAt(i-1))){
                    int before = stack.pop();
                    before *=10;
                    int num = Character.getNumericValue(c);
                    stack.add(before+num);
                } else{
                    int num = Character.getNumericValue(c);
                    stack.add(num);
                }
            }
            if (c == 'S') {
                int num = stack.pop();
                num = (int) Math.pow(num, 1);
                stack.add(num);
            }
            if (c == 'D') {
                int num = stack.pop();
                num = (int) Math.pow(num, 2);
                stack.add(num);
            }
            if (c == 'T') {
                int num = stack.pop();
                num = (int) Math.pow(num, 3);
                stack.add(num);
            }

            if (c == '*') {
                if (stack.size() == 1) {
                    int num = stack.pop();
                    num *= 2;
                    stack.add(num);
                } else if (stack.size() >= 2) {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    num1 *= 2;
                    num2 *= 2;
                    stack.add(num2);
                    stack.add(num1);
                }
            }
            if (c == '#') {
                int num = stack.pop();
                num *= -1;
                stack.add(num);
            }

        }

        while (!stack.isEmpty()) {
            int num = stack.pop();
            answer += num;
//            System.out.println(num);
        }


        return answer;
    }
}
