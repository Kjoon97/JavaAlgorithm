package String;

import java.util.Scanner;

public class findLongCharacter2 {

    public String solution(String str){
        String answer="";
        int max = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' ')) != -1) {//띄어쓰기를 발견 못하면 -1리턴. pos에는 공백 위치가 담김.
            String tmp = str.substring(0, pos);   //0~pos-1
            int len= tmp.length();
            if(len>max){   //같거나 크면 안됨 - 앞에 단어로 출력하기 위해서는
                max=len;
                answer=tmp;
            }
            str=str.substring(pos+1);  // str을 pos+1부터 시작하게끔 자름.
        }
        if(str.length()>max) answer=str;        //while문이 다음 공백이 없으면 실행이 안되니깐 마지막 단어는 고려안되므로 따로 추가.
        return answer;
    }

    public static void main(String[] args){

        findLongCharacter2 T = new findLongCharacter2();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}


/*
  문자열 자르기 - subString(x)  : 인덱스 x이후의 값을 가져옴.
                subString(x,y)   인덱스 x~y-1까지
  해당 문자 인덱스 위치 찾기 - str.indexOf(' ')
*/