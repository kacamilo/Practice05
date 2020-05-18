package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {
    	 /* (스태틱 필드와 메소드를 이용하여 달러와 우리나라 원화 사이의
        변환을 해주는 환율 계산기를 만들어보세요 */
 
        CConverter.setRate(1118.70);
        
        
       //100만원을 달러로 출력하기
       //CConverter 와 public static double toDoller(double won) 와 열을 맞춰 준다
       System.out.println("백만원" + CConverter.toDoller(1000000) + "달러입니다.");
           
       //100달려를 원으로 출력하기
       System.out.println("백달러" + CConverter.toKWR(100)+ "입니다.");
        

    }

}
