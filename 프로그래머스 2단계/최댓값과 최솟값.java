중요한건 스페이스바는 char로 파악안하고 그리고 공백이라서 2자리나 3자리 숫자가 존재할수도있음 그래서 split을 사용해야한다

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < split.length; i++) {
            int numericValue = Integer.parseInt(split[i]);
            max = Math.max(max, numericValue);
            min = Math.min(min, numericValue);
        }
        answer = min + " " + max;
        return answer;
    }

}
