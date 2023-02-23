

import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int move = moves[i]-1;
            for(int j=0; j< board.length; j++){
                if(board[j][move] == 0){
                    continue;
                }
                if(!stack.isEmpty()){
                    if(stack.peek() == board[j][move]){
                        stack.pop();
                        answer+=2;
                    }else{
                        stack.add(board[j][move]); // 핵심 비어있지않아도 넣어줘야하기떄문
                    }
                } else{
                    stack.add(board[j][move]);
                }
                board[j][move] = 0;
                break; // 한번뽑으면 그만둬야하기때문
            }


        }


        return answer;
    }
}
