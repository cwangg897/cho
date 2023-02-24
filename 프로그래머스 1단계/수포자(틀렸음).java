이유는 나도모름 runtime error 즉 이렇게하는게 코드로 깔끔하다 핵심은 max를 정렬이아니라 Math.max이다

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] one = new int[] {1, 2, 3, 4, 5};
        int[] two = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] arr = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) {
                arr[0] ++;
            }
            if (answers[i] == two[i % two.length]) {
                arr[1] ++;
            }
            if (answers[i] == three[i % three.length]) {
                arr[2] ++;
            }
        }
        int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
        List<Integer> list = new ArrayList<>();
        if(max == arr[0]) list.add(1);
        if(max == arr[1]) list.add(2);
        if(max == arr[2]) list.add(3);
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

}
