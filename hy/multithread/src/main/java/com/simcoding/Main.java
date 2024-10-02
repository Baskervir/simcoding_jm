package com.simcoding;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int a = 1;
        int b = 2;
        int c= a+b;

        /**
         *
         * PCB(
         * 0-4byte a
         * 4-8byte b         =>      프로그램은 8-12 사이의 변수를 알려줘 => (2,2) 영역에 있으니까 가져와
         * 8-12byte c
         *)
         *
         * 실제(PHYSICAL MEMORY)
         * O O X X X X X
         * X X X X O X X
         * X X 0 X O X X
         *
         * **/
        /** 가상 메모리 영역
         * 0 - 100. 로그인 창(게임 시작에 필수)
         * 100 - 200 . act1
         * 201 - 300 . act2
         * 301 - 400 . ac3
         *
         *
        /** 물리 메모리 영역(기본 페이지 크기가 5)
         * 1.  act2
         * 20개의 페이지를 할당 -> act3 (페이징 방식으로)
         *
         * **/
    }
}
