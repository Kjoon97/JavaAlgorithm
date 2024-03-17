package String;

import java.util.Scanner;

public class TransformUpperLowercase {

    public String solution(String str){
        String answer="";
        for(char x: str.toCharArray()){
            if(Character.isUpperCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        TransformUpperLowercase T = new TransformUpperLowercase();
        String answer = "";
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
// x가 대문자인지 확인하기 : Character.isUpperCase(x)
// x를 대문자로 변경하기   : Character.toUpperCase(x)
// (문자열)str을 배열로 변경하기 : str.toCharArray()
