import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Infoway Technologies";
		Scanner sc = new Scanner(System.in);
		String revStr = "";
		String[] arr = str.split(" ");
		for (String item : arr) {
			revStr = item + " " + revStr;
		}
		System.out.println(revStr);

	}

}
