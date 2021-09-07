import java.util.Random;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		while (true){
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你要猜的数字");
			int guessnumber = sc.nextInt();
			if (guessnumber > number){
				System.out.println("你输入的数字大了");
			}else if(guessnumber < number) {
				System.out.println("你输入的数字小了");
			}else {
				System.out.println("你猜中了");
                break;				
			}
		}	
   }
}