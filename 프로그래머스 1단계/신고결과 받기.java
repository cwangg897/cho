import java.util.*;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> singo = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();

        for(int i=0; i< id_list.length; i++){
            singo.put(id_list[i], new HashSet<>());
        }
        for(int i=0; i< id_list.length; i++){
            result.put(id_list[i], 0);
        }


        for(int i=0; i< report.length; i++){
            String[] split = report[i].split(" ");
            String from = split[0];
            String to = split[1];
            Set<String> set = singo.get(to);
            set.add(from);
            singo.put(to, set);
        }
        
        for(int i=0; i< id_list.length; i++){
            if(singo.get(id_list[i]).size()>=k){
//                result.put(id_list[i], result.get(id_list[i])+1);
                Set<String> set = singo.get(id_list[i]);
                Iterator<String> iterator = set.iterator();
                while(iterator.hasNext()){
                    String next = iterator.next();
                    result.put(next, result.get(next)+1);
                }
            }
        }

        for(int i=0; i<id_list.length; i++){
            answer[i] = result.get(id_list[i]);
        }


        return answer;
    }
}
