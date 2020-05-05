package mon_thu_study;
class Solution2 {
  public static String solution(int n) {
       String answer = "";
      for(int i = 1; i<=n ; i++ ){
        if(i%2 == 1){
          answer = answer + "¼ö";
        }else{
          answer = answer + "¹Ú";
        }
    }
      return answer;
  }
}
public class Test02 {

	public static void main(String[] args) {
		System.out.println(Solution2.solution(3));
		System.out.println(Solution2.solution(4));

	}

}
