import java.util.Random;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		while (true){
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�µ�����");
			int guessnumber = sc.nextInt();
			if (guessnumber > number){
				System.out.println("����������ִ���");
			}else if(guessnumber < number) {
				System.out.println("�����������С��");
			}else {
				System.out.println("�������");
                break;				
			}
		}	
   }
}