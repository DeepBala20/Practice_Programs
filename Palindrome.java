// 2 WAP to find whether string is palindrome or not.
public class Palindrome{
	public static void main(String[] args) {
		String s = "madam";
		String sR = "";
		for(int i=s.length()-1;i>=0;i--){
			sR = sR + s.charAt(i);
		}
		System.out.println(sR);
		if(s.equals(sR)){
			System.out.println("String is palindrom");
		}
		else{
			System.out.println("String is not palindrom");	
		}		
	}
}