package tw.kevin;

import java.util.Scanner;

//判斷成績是否及格 to check your exam fail or not.

public class Brad07 {

	public static void main(String[] args) {
		int score;
		
//	-----------------------------------------------	
//		輸入語法 系統輸入
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Score = ");
//		score = scanner.nextInt();
//		if( score < 100) {	
//			if(score >= 60) {
//				System.out.println("Pass");
//			}
//			else {
//				System.out.println("Fail");
//			}
//		}else{	
//			System.out.println("Please enter again!! ");
//		}
//		System.out.println("---------");
//		}	
//	-----------------------------------------------	
//		亂數產生0-100的整數成績值
//		0.0 <= d1 <1.0
		
		score = (int) (Math.random()*101);  // 生命意義就是 0~100 裡面有 101個整數。
											// (int) 強制反型
		System.out.println(score);
		
// --------------巢狀if結構		
//		if(score < 100) {	
//			if(score >= 90) {
//				System.out.println("You get A ");}
//			else{
//				if(score >= 80) {
//					System.out.println("You get B ");}
//				else {
//					if(score >= 70) {
//						System.out.println("You get c ");}
//					else {
//						if(score >= 60) {
//							System.out.println("You get d ");}
//						else {
//							System.out.println("Fail");}}}}		
//		}else {	
//			System.out.println("Please enter again!! ");
//	}
//	System.out.println("---------");
//	}		
//		
//				
//}	


// 可以簡化if的寫法 但是是因為括號{} 去除 ; 
if(score < 100) {	
	if(score >= 90) { 
		System.out.println("You get A ");
	}else if(score >= 80) {
		System.out.println("You get B ");
	}else if(score >= 70) {
		System.out.println("You get c ");
	}else if(score >= 60) {
		System.out.println("You get d ");
	}else 
		System.out.println("Fail");		
	}else { 	
	System.out.println("Please enter again!! ");
	}
	System.out.println("---------");
	}				
}	