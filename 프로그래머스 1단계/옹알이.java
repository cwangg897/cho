replace("aya", ""); 으로 할경우는 앞으단어가 aaye라면 ay가 공백으로 바껴서 ae가 가능하다면 안되기때문에 띄어쓰기로 변형해줍니다.


class Solution {
    public int solution(String[] babblings) {
        // "aya", "ye", "woo", "ma" 4가지 발음만 가능
        int answer = 0;
        for(int i = 0; i < babblings.length; i++) {
            if(babblings[i].contains("ayaaya") || babblings[i].contains("yeye") || babblings[i].contains("woowoo") || babblings[i].contains("mama")) {
                continue;
            }

            babblings[i] = babblings[i].replace("aya", " ");
            babblings[i] = babblings[i].replace("ye", " ");
            babblings[i] = babblings[i].replace("woo", " ");
            babblings[i] = babblings[i].replace("ma", " ");
            babblings[i] = babblings[i].replace(" ", "");
            if(babblings[i].isEmpty()) answer++;

        }
        return answer;
    }
}
