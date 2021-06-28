package tw.kevin;

public class Brad01 {

	public static void main(String[] args) {	
		//強行別 需要先宣告 型別不變
		// [a-zA-Z$_][a-zA-Z0-9$_] 變數名稱
		byte var1; //未完成初始化，所以print不出來
		byte var2 =123;
		byte var22 = 123;
		byte $_$$_$ = 55 , var4 , var5;
		byte var6 = 123, var7, var8;	
		int var11  =200;
		System.out.println(var11);
		System.out.println("--------");
//		var2 = var1 +3; // 沒有初始化的不能拿來計算
//		short shortexample2 = var11 +var6 ; //不能使用短於 組成的型別
//		byte 2^8 short 2^16 int 2^32 long 2^64		
		
		long longexample2 = var11 +var6; 
		System.out.println(var2+var11);
	}

}
