모두다 큰글자로 바꾸면 더 편리하다


class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toUpperCase();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1; i< s.length(); i++){
            if(s.charAt(i-1) !=' '){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }else{
                sb.append(s.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }
}
