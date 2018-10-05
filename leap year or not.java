import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int year;
    Scanner scan = new Scanner(System.in);
    	
    	year = scan.nextInt();
    	scan.close();
    if(year%4==0)
    System.out.println(" yes");
    else
    System.out.println(" no");
  }
}