package hw;

/*
 * Topic: 假設銅板有1元、5元、50元共三種，媽媽請小明去菜市場買水果，給了小明N元，且媽媽交待，要老闆找小明的零錢的數
 *  目要最少，而小明到了水果攤買了a1顆蘋果，a2顆柳丁，及a3顆桃子，1顆蘋果15元，1顆柳丁20元，1顆桃子30元，請問老問需
 *  找多少個1元、5元、50元，其銅板數目最少。(先輸入媽媽給小明多少錢，N，接著輸入a1, a2, a3 ， 在此n, a1, a2, a3
 *  為整數，且a115+ a220+ a3*30小於或等於N。列出共找小明多少個1元，5元及50元，若帶的錢不夠買水果，則顯示”0”)
 * Date: 2016/09/26
 * Author: 105021058 蕭懋霖
 */

import java.util.Scanner;
public class hw01_105021058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a1=scn.nextInt();
		int a2=scn.nextInt();
		int a3=scn.nextInt();
		int data[]={50,10,1};
		int data1[]=new int [3];
		if(n-(a1*15+a2*20+a3*30)>=0){
			n=n-(a1*15+a2*20+a3*30);
			data1[0]=n/data[0];
			n=n%data[0];
			data1[1]=n/data[1];
			n=n%data[1];
			
			System.out.println("50元:"+data1[0]);
			System.out.println("10元:"+data1[1]);
			System.out.println("1元:"+n);
		}else{
		System.out.println("0");}
	}

}
