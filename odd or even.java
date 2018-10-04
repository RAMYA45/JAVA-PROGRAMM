import java.util.Scanner;
class Main {
  public static void main(String[] args){
    int number;
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the number you want to check");
    number=scan.nextInt();
    scan.close();
    if(number%2==0)
      System.out.println(number+" is even");
    else
      System.out.println(number+" is odd");
    
  }
}