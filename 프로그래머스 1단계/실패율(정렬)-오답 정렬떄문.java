import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] count = new int[N+1];
        for(int i=0; i< stages.length; i++){
            if(stages[i] > N){
                continue;
            }
            count[stages[i]] ++;
        }
        List<Node> list = new ArrayList<>();
        int sum = stages.length;
        for(int i=1; i<=N; i++){
            Double num = (double)count[i] / sum;
            sum -= count[i];
            list.add(new Node(i, num));
        }
        Collections.sort(list);

        for(int i=0; i<N; i++){
            answer[i] = list.get(i).stage;
        }

        return answer;
    }

    static class Node implements Comparable<Node>{
        int stage;
        double percent;

        public Node(int stage, double percent){
            this.stage = stage;
            this.percent = percent;
        }

       // comparator는 o2 - o1 은 오름차순 o1 - o2 는 내림차순 
        @Override
        public int compareTo(Node o) {
            if(o.percent > this.percent){
                return 1; // 매개변수가 크다고 생각하면 자리변경 즉 내림차순
            } 
            if(o.percent < this.percent){
                return -1; // 그대로
            } 
            return 0; // 그대로
            
        }
    }
}
