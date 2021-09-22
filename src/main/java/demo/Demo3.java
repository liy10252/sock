package demo;


public class Demo3 {


	public static void main(String[] args) throws Exception {

		String a = "abcd";
		String b = "";

		b = copyy(a);
		System.out.println("@@:"+b);
	}

	public static String copyy(String a){

		return a.substring(0,a.length());

	}

}
