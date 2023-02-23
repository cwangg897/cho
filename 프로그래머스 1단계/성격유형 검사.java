알고리즘에서 문제에서 개수를 정해줘서 규칙을 파악하지 않아도 되거나 주어진 값에 따라 n개가아닌경우는 하드코딩하도된다

import java.util.*;


class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);
        
        Map<Integer, Integer> score = new HashMap<>();
        score.put(1,3);
        score.put(2,2);
        score.put(3,1);
        score.put(5,1);
        score.put(6,2);
        score.put(7,3);
        
        
        for(int i=0; i< choices.length; i++){
            if(choices[i]<=3){
                char key = survey[i].charAt(0);
                map.put(key, map.get(key)+score.get(choices[i]));
            } else if(choices[i]>=5){
                char key = survey[i].charAt(1);
                map.put(key, map.get(key)+score.get(choices[i]));
            }
        }

        StringBuilder sb = new StringBuilder();

        if(map.get('R') < map.get('T')){
            sb.append('T');
        } else{
            sb.append('R');
        }

        if(map.get('C') < map.get('F')){
            sb.append('F');
        }else{
            sb.append('C');
        }

        if(map.get('J') < map.get('M')){
            sb.append('M');
        } else{
            sb.append('J');
        }

        if(map.get('A') < map.get('N')){
            sb.append('N');
        } else{
            sb.append('A');
        }

        answer = sb.toString();
        return answer;

    }

}
