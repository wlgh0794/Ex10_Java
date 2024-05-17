package chap10_polymorphism;

import chap11_abstraction.tv.LgTv;
import chap11_abstraction.tv.Tv;
import chap11_abstraction.tv.samsungTv;

public class _01_Ploymorphism {

	public static void main(String[] args) {

		// 11 . 다형성을 이용하여 Tv 객체 바꾸며 사용하기
		
		Tv tv = new LgTv();

		tv.powerOn();
		
		tv = new samsungTv() ;
		
		tv.powerOn() ; 
		
		tv = new LgTv() ;
		
		tv.channelDown();
		
		
	}

}
