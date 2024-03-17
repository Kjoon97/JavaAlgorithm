package PracticeJava;

import PracticeJava.model.Hero;
import PracticeJava.model.Person;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args){

        //출력문
        System.out.println("Hello World!");


        //변수 초기화
        int x1 = 30;
        System.out.println(x1);
        System.out.println(x1+20);
        x1=40;
        System.out.println(x1);


        //상수 선언
        final int y1 = 30;


        //데이터 타입
        //정수
        int x = 30;
        long l =30L;   //int보다 long이 더 큰수를 담을 수 있음.
        short s = 30;
        byte b = 30;

        //실수
        float ff = 30.0f;
        double dd = 30.0;   //double이 더 큰 수를 담을 수 있음.


        //강제 형변환 (큰 값을 작은 변수에 넣을 때)
        int i1 = (int) 30L;

        //자동 형변환 (작은 값을 큰 변수에 넣을 때)
        long ll = 30;


        //참거짓
        boolean isMarried = true;
        isMarried = false;
        boolean isMan = false;


        //문자(한 글자) 작은 따옴표 사용 (char은 거의 안씀)
        char c = 'a';
        char cc = '한';


        //문자열 큰 따옴표 사용.
        String str1 = "여러 글자";


        //문자열 포멧
        System.out.printf("저는 %s입니다 나이는 %d살이고 키는 %fcm입니다 \n", "홍길동", 25, 175.5);
        String str2 = String.format("저는 %s입니다. 나이는 %d살이고 키는 %fcm입니다", "홍길동", 20, 173.5);
        System.out.println(str2);


        //Math 클래스
        System.out.println(Math.max(10,30));
        System.out.println(Math.min(10,30));
        System.out.println(Math.abs(-30));


        //문자열 -> 숫자 변환
        String str3 = "100";
        int i2 = Integer.parseInt(str3);
        long l2 = Long.parseLong(str3);


        //숫자 -> 문자열 변환
        String str4 = String.valueOf(i2);


        //Random 클래스
        Random random = new Random();
        int rand1 = random.nextInt(10);  //0~9 랜덤 출력
        System.out.println(rand1);

        int rand2 = random.nextInt(4) + 5; //5~9랜덤 출력.
        System.out.println(rand2);


        //문자열 입력
        Scanner scanner = new Scanner(System.in);
        String str5 = scanner.next();  //문자열 입력
        int i3 = scanner.nextInt();    // 정수 입력
        long l3 = scanner.nextLong();  //실수 입력.


        //if문
        int i4 = 10;
        if (i4 < 5){
            System.out.println("참");
        } else if (i4 >3) {
            System.out.println("거짓");
        } else{
            System.out.println("나머지");
        }

        // &&:AND, ||: OR
        if (isMarried && isMan){
            System.out.println("결혼 했고 남자다");
        }else{
            System.out.println("결혼 안했다");
        }


        //삼항 연산자
        String str6 = isMarried ? "결혼 했다" : "결혼 안했다";  //isMarried가 true이면 결혼 했다, false이면 결혼 안했다.
        System.out.println(str6);


        //switch문
        String str8 = "결혼 했다";
        switch (str8){
            case "결혼 했다":
                System.out.println("O");
                break;
            case "결혼 안했다":
                System.out.println("X");
                break;
            default:
                System.out.println("?");
        }

        //반복문
        for (int i=0; i<10; i++){
            System.out.println(i);
            if (i==6) {
                continue;  //continue, break 사용 가능.
            }
        }

        int i =0;
        while (i<10){
            System.out.println(i);
            i++;
        }

        i=0;
        do{
            System.out.println(i);
            i++;
        }while (i<10);


        //배열
        int[] arr1 = new int[5];  //5칸 int 타입 배열 [0,0,0,0,0] 으로 초기화 됨.
        int len = arr1.length;    //배열 길이 : 5
        arr1[0] =10;
        System.out.println(arr1[0]);

        //배열 선언 동시에 초기화
        int[] arr2 = {10, 20, 30, 40, 50};

        //문자열 배열
        String[] arr3 = new String[2]; //2칸 String 타입 배열 [null, null]으로 초기화 됨.
        String[] arr4 = {"홍길동", "이순신"};


        //ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(10);
        list1.add(10);

        //리스트 크기
        System.out.println(list1.size());  //3 출력됨.

        //인덱스로 값 구하기
        System.out.println(list1.get(0));

        //2번째 인덱스에 200을 삽입하기.
        list1.add(2, 200);

        //2번째 인덱스 값 지우기
        list1.remove(2);

        //출력.
        System.out.println(list1);

        //메소드 사용.
        System.out.println(add(50,30));
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
        System.out.println(add(10,20,30,40,50));

        //클래스 사용
        Person person1 = new Person();
        Person person2 = new Person("홍길동",10);

        System.out.println(person1);
        System.out.println(person2);

        Hero hero1 = new Hero("슈퍼맨");
        Hero hero2 = new Hero("베트맨");
        hero1.attack(hero2);

    }

    //메소드 선언
    public static int add(int x, int y){
        return x+y;
    }

    //메소드 오버로드
    public static int add(int x, int y, int z){
        return x+y+z;
    }

    //메소드 오버로드
    public static int add(int... numbers){  // int 타입의 매개변수 0개부터 원하는 개수까지 numbers 배열에 저장됨.
        int sum=0;
        for (int i=0; i<numbers.length; i++){
            sum = sum+numbers[i];
        }
        return sum;
    }
}