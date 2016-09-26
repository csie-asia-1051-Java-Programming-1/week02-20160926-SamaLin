package ex;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105021058 蕭懋霖
 */
import java.util.*;
public class ex01_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入使用時間:");
		float a=scn.nextInt();
		float d=0f;
		if(a<=600){d=a*0.5f;}
		else if(a<=1200){d=a*0.5f*0.9f;}
		else{d=a*0.5f*0.79f;};
		System.out.println(d);
	}

}
