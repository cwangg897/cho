합을 계산하는 부분에서 시간초과가 나타났다
기존에는 다음과 같이 하기때문에 n*n번이지만 아래에서는 자료구조를 배열이라던지 List를 사용하면은 매번if문 검사를 뺄 수 있고 + n/2 * n/2로 줄일 수 있다

            for (int i = 1; i <= n; i++) {
                    for (int j = i+1; j <= n; j++) {
                        if (visited[i] && visited[j]) {
                            team1 += arr[i][j];
                            team1 += arr[j][i];
                        } else if(!visited[i] && !visited[j]){
                            team2 += arr[i][j];
                            team2 += arr[j][i];
                        }
                    }
            }

    public static void dfs(int idx, int count){
        if(count == n/2){
            int startTeam = 0;
            int linkTeam = 0;
            List<Integer> startList = new ArrayList<>();
            List<Integer> linkList = new ArrayList<>();

            for(int i=1; i<=n; i++){
                if(visited[i]){
                    startList.add(i);
                } else{
                    linkList.add(i);
                }
            }

            for(int i=0; i<startList.size(); i++){
                for(int j=0; j<startList.size(); j++){
                    if(i==j){
                        continue;
                    }
                    startTeam += arr[startList.get(i)][startList.get(j)];
                    linkTeam += arr[linkList.get(i)][linkList.get(j)];
                }
            }

            min = Math.min(min, Math.abs(startTeam - linkTeam));
            return;
        }

        // 이거는 먼가 i=idx+1로해도 상관업을거같은데 순서가필요없으니
        for(int i=idx; i<=n; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(i+1, count+1);
                visited[i] = false;
            }
        }


    }
}
