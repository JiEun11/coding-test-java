import java.util.Scanner;

public class Mentoring {

    public int solution(int n, int m, int[][] arr){
        int answer = 0;
        for(int i = 1; i <= n; i++){        // n명의 학생 멘토
            for(int j = 1; j<=n; j++){      // n명의 학생 멘티
                int cnt = 0;
                for(int k = 0; k < m; k++){     // 0부터 m개의 테스트 전
                    int pi = 0, pj = 0;
                    for(int s = 0; s < n; s++){     // 0부터 n명의 학생 전
                        if(arr[k][s]==i) pi = s;
                        if(arr[k][s]==j) pj = s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==m){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Mentoring T = new Mentoring();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for(int i =0; i < m; i++){
            for(int j = 0; j < n ; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, m, arr));
    }
}
