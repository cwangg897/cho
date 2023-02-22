StringBuilder가 더 빠르다는사실


class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < X.length(); i++) {
            a[X.charAt(i)-48] += 1;

        }
        for (int i = 0; i < Y.length(); i++) {
            b[Y.charAt(i)-48] += 1;
        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < Math.min(a[i], b[i]); j++) {
                answer.append(i);
            }
        }
        if(answer.toString().equals("")){
            return "-1";
        } else if(answer.toString().charAt(0) == '0'){
            return "0";
        } else{
            return answer.toString();
        }

    }
}
