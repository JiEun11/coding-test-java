import java.util.Scanner;

public class GetGrade {

    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        int tmp;
        for(int i = 0; i < n; i++){
            int cnt = 1;
            for(int j = 0 ; j < n ; j++){
                if(arr[i] < arr[j]){
                    cnt++;
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        GetGrade T = new GetGrade();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
