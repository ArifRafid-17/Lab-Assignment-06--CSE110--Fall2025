import java.util.Scanner;
public class Question01{
  public static void main(String [] args){
     Scanner sc= new Scanner(System.in);
     System.out.print("Message: ");
     String msg = sc.nextLine();
     int num_ascii=0;
     
     for(int i =0; i<msg.length(); i++){
       char msg_c1= msg.charAt(i);
       int msg_c2= (int)msg_c1;
       if(msg_c2>=48 && msg_c2<=57){
       num_ascii+=msg_c2;
       }
       char num_char= (char)num_ascii;
       System.out.print(num_char);
    }
     
     //System.out.print(num_char);
  }
}