package com.nhnacademy;

public class Main {
    public static void main(String[] args) {
        System.out.println("계산기 만들어주세요!! - 승혜: 더하기 , 승아: 나머지, 채은: 곱하기 , 동빈: 나누기 ");

        Moduler moduler =  new Moduler();
        moduler.moduler(5,10);

        Sub sub = new Sub();
        sub.sub(3,5);

        Div div = new Div();
        div.divide(5, 10);

        
    }
}
