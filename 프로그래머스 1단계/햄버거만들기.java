stack을 사용하는게 느껴졌다
stack은 구현체가 아마도 LinkedList이기때문에 get연산으로 뺄수있는것같다

import java.util.*;


class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i< ingredient.length; i++){
            stack.push(ingredient[i]);
            if(stack.size()>=4){
                if(stack.get(stack.size()-1) ==1 && stack.get(stack.size()-2) ==3 && stack.get(stack.size()-3)==2 
                        && stack.get(stack.size()-4)==1){
                    answer+=1;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return answer;
    }
}
