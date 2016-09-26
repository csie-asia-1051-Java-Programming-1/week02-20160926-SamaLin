package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 1050210XX 周永振老師
 */

import java.util.Scanner;
public class ex03_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入起始時間:(ex:10 23)");
		int h=scn.nextInt();
		int m=scn.nextInt();
		System.out.println("請輸入結束時間:(ex:15 20)");
		int h1=scn.nextInt();
		int m1=scn.nextInt();
		int t=(h1-h)*60+(m1-m);
//		System.out.println(t);
		int d=0;
		
		if(t<=120){
			d=d+(t/30)*30;
		}else if(t>120 && t<240){
			d=d+120;
			t=t-120;
			d=d+(t/30)*40;
		}else if(t>=240){
			d=d+120;
			d=d+160;
			t=t-240;
			d=d+(t/30)*60;
		}
		System.out.println(d);
	}
}