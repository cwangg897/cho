n이 100000일경우도 존재한다 숫자가 빼기로 해결못하는경우 나누기를 사용하는것이다
핵심은 cycle이 존재하면 나누기를 사용하는데 이에따라 0이되도록 만들어야한다. 따라서 0이 되도록하자.




class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' '){
                sb.append(s.charAt(i));
                continue;
            }

            if (Character.isUpperCase(ch)) {
                int c = s.charAt(i) - 65;
                c = (c+n) % 26;
                c = c+'A';
                sb.append((char)c);
            } else if (Character.isLowerCase(ch)) {
                int c= s.charAt(i) - 97;
                c = (c+n) % 26;
                c = c+'a';
                sb.append((char)c);
            }
        }
        answer = sb.toString();
        return answer;
    }
}
