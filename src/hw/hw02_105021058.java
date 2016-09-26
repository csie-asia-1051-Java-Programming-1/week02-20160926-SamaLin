package hw;

/*
 * Topic: 已知男生標準體重＝(身高－80 )0.7；女生標準體重＝(身高－70)0.6；
 *  試寫一個程式可以計算男生女生的標準體重。(輸入兩個數值，依序代表為身高及性別
 *  （1代表男性；2代表女性）)
 * Date: 2016/09/26
 * Author: 105021058 蕭懋霖
 */

import java.util.Scanner;
public class hw02_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入高:");
		float h=scn.nextInt();
		System.out.println("請輸入性別:(1代表男性；2代表女性)");
		int s=scn.nextInt();
		float k=0;
		if(s==1){
			k=(h-80)*0.7f;
		}else{
			k=(h-70)*0.6f;
		}
		System.out.println("體重:"+k);
	}
}