package work1;

public class HomeWork1 {
	public static void main(String[] args) {
//		第一題
		int a = 12;
		int b = 6;
		int c = a + b;
		int d = a * b;
	    System.out.println("和=" + c);
	    System.out.println("積=" + d);
//		第二題 
	    int e =200 / 12;
	    int f =200 % 12;
	    System.out.println("打=" + e);
	    System.out.println("顆=" + f);
//		第三題
	    int g =256559 / 86400;
	    int h =(256559 - 86400 * 2) / 3600;
	    int i =(256559 - 86400 * 2 - 3600 * 23) / 60;
	    int j =(256559 - 86400 * 2 - 3600 * 23 - 60 * 15);
	    System.out.println("天=" + g);
	    System.out.println("小時=" + h);
	    System.out.println("分=" + i);
	    System.out.println("秒=" + j);
//		第四題
	    final double K = 3.1415;
	    double l =5 * 5 * K;
	    double m =5 * 2 * K;
	    System.out.println("圓面積=" + l);
	    System.out.println("圓周長=" + m);
//		第五題
	    
//		第六題
	    int n = 5;
	    char o = '5';
	    String p = "5";
	    
	    System.out.println("5 + 5 ="+ (n + n)); //基本運算
	    System.out.println("5 + \'5\'="+(n + o)); //字元轉換unicode為53
	    System.out.println("5 + \"5\"" +(n + p)); //數字+字串為字串
	}
}
