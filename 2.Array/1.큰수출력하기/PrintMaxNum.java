import java.util.*;

class PrintMaxNum {

  public ArrayList<Integer> solution(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();
    answer.add(arr[0]); // 첫 번째 수는 무조건 넣어주기
    for(int i = 0; i < n-1 ; i++){
      if(arr[i]<arr[i+1]){
        answer.add(arr[i+1]);
      }
    }
//    for(int i =1; i< n; i++){
//      if(arr[i]>arr[i-1]){
//        answer.add(arr[i]);
//      }
//    }

    return answer;
  }

  public static void main(String[] args) {
    PrintMaxNum T = new PrintMaxNum();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }
    for (int x : T.solution(n, arr)) {
      System.out.print(x + " ");
    }

    kb.close();
  }
}
