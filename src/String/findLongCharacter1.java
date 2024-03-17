package String;
import java.util.*;

public class findLongCharacter1 {

    public String solution(String str){
        String answer="";
        int Max = Integer.MIN_VALUE;
        String[] s = str.split(" ");

        for(String x: s){
            if(x.length()>Max){
                Max=x.length();
                answer=x;
            }
        }

        return answer;
    }

    public static void main(String[] args){

        findLongCharacter1 T = new findLongCharacter1();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}


/*
   1. next()는 문자,문자열을 공백 기준으로 한단어 또는 한 문자씩 입력 받는다. 띄어쓰기를 한 이후의 입력은 인식하지 않는다.
      "Hello world"라는 문자열을 읽을 때, 공백 이후로는 읽지 않으므로 "Hello"까지만 읽는다.
   2. nextLine()은 문자 혹은 엔터를 치기 전까지의 문장 전체를 입력받는다. 엔터를 치기 전까지의 입력 된 모든 문장이 전부 입력된다.
      "Hello world"를 그대로 입력받는다.
    따라서 스페이스바로 띄어쓰기한 문장 전체를 읽어낼 경우에는 nextLine()을 사용해야한다.

   3. 문자열.split(" ") -> 문자열을 공백 기준으로 분류해서 배열로 저장.

   4. 제일 최솟 값. Integer.MIN_VALUE
*/