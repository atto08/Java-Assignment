public class Main {
    public static void main(String[] args){
        //문제1
        System.out.println("**********문제1**********");
        double var1 = 5;                            // 실수형 5 ==> 5.0이라고 인식
        int var2 = 2;                               // 정수형 2
        double var3 = var1/var2;                    // 실수 var1을 정수 var2로 나누어 실수형 var3 = 2.5
        int var4 = (int) (var3*var2);               // 실수 var3과 정수 var2를 곱하고 ()로 묶어 곱한 결과 값을 int형으로 선언
        System.out.println(var4);                   // 4가 아닌 5를 출력.


        //문제2
        System.out.println("**********문제2**********");
        int x=10;
        int y=20;
        int z = (++x) + (y--);                      // x는 먼저 +1을 한 후 z에 x(x=11)를 대입, y는 먼저 z에 y(y=20)을 대입 후 y에 -1
        System.out.println(z);                      // 즉, z = 11 + 20 이지만, x = 11, y = 19로 바뀌었다는 것이다.


        //문제3
        System.out.println("**********문제3**********");
        System.out.println("시작");
        while(true){                                // while문이 true이면 무한루프.
            int dice1 = (int)(Math.random()*6 +1);  // 1~6 사이에 정수를 랜덤으로 출력 하는 주사위1
            int dice2 = (int)(Math.random()*6 +1);  // 1~6 사이에 정수를 랜덤으로 출력 하는 주사위2
            if (dice1+dice2==5){                    // 주사위1과 주사위2의 합이 5일때
                System.out.println("끝");
                break;                              // while의 loop를 종료.
            } else{                                 // 주사위1과 주사위2의 합이 5가 아닌 모든경우
                System.out.println("(" + dice1 + "," +dice2 + ")");   //주사위의 합을 출력.
            }
        }

    }
}