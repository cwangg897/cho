https://school.programmers.co.kr/learn/courses/30/lessons/12915

import java.util.*;


class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<Node> list = new ArrayList<>();
        for(int i=0; i< strings.length; i++){
            list.add(new Node(strings[i], strings[i].charAt(n)));
        }
        Collections.sort(list);
        for(int i=0; i< answer.length; i++){
            answer[i] = list.get(i).string;
        }
        return answer;
    }

    static class Node implements Comparable<Node>{
        String string;
        char c;

        public Node(String string, char c){
            this.string = string;
            this.c = c;
        }


        @Override
        public int compareTo(Node o) {
            if(c == o.c){
                return string.compareTo(o.string);
            }
            
            if(c > o.c){
                return 1;
            }
            if(c<o.c){
                return -1;
            }
            
            return 0;
        }
    }
}
