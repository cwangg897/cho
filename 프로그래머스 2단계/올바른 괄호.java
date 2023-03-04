stack문제 제일쉽게 푸는방법이다 ) 인경우만 검사를한다면 if문을 적게써서 시간을 단축시킬 수 있다.

import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) =='('){
                stack.push('(');
            } else if(s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            return false;
        }

        return answer;
    }
}
