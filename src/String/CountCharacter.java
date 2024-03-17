package String;

import java.util.*;

class CountCharacter {

    public int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for(char x: str.toCharArray()){   //문자열을 문자 배열로 하나 생성.
            if (x==c){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CountCharacter C = new CountCharacter();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        int ans = C.solution(str,c);
        System.out.print(ans);
    }
}
