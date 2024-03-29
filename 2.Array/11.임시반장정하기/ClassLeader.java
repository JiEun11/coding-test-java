import java.util.Scanner;

public class ClassLeader {

    public int solution(int n, int[][] arr){
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            int cnt = 0;    // i학생과 같은반이었던 j학생은 몇 명?
            for(int j = 1; j <= n; j++){
                for(int k =1; k<=5; k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt++;      // 같으면 카운트 증가
                        break;      // i학생 1번만 카운트니까
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        ClassLeader T = new ClassLeader();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=5; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }
}
