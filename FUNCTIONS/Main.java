import java.util.Scanner;
// Other imports go here
// Do NOT change the class name

public class Main {

  static void isSquare(int n){
    boolean ans=false;
    if(n==1){
      System.out.println("yes");
      return;
    }
    for(int i=2;i<=n/2;i++){
      int sqr=i*i;
      if(sqr==n){
        ans=true;
        break;
      } 
    }
    if(ans){
      System.out.println("yes");
    }
    else{
      System.out.println("no");
    }
  }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      isSquare(n);
    }
}

