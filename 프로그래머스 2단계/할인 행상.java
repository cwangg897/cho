Map과 check 를 항상 초기화 시켜주는것과 범위 설정에 대해서 범위가 넘어가기 전까지만 진행하면된다


import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        for(int i=0; i< discount.length; i++){
            int check = 0;
            Map<String, Integer> map = new HashMap<>();
            for(int k=0; k<want.length; k++){
                map.put(want[k], number[k]);
            }

            for(int j=i; j<i+10; j++){
                if(j>= discount.length){
                    break;
                }

                if(map.containsKey(discount[j])){
                    map.put(discount[j], map.get(discount[j])-1);
                }
            }

            for(int j=0; j<want.length; j++){
                if(map.get(want[j]) == 0){
                    check +=1;
                }
            }

            if(check == want.length){
                answer+=1;
            }
        }





        return answer;
    }
}
