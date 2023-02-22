약수의 개수를 구할때 자기자신의 수까지안가고 곱을해서 원래의수의 루트를한곳까지만 세버려서 시간을 줄임
단 반복되기때문에 count +=1 이 핵심 나머지는 2만큼하고 

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    count += 1;
                } else if (i % j == 0) {
                    count += 2;
                }
            }
            if (count > limit) {
                arr[i] = power;
            } else {
                arr[i] = count;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}
