import java.util.Scanner;
public class Question05{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        int temp = 0;
        int msgIndex = msg.length()-1;
        while (msgIndex>= 0 && msg.charAt(msgIndex)== ' ') {
            msgIndex--;
        }
        while (msgIndex >= 0 && msg.charAt(msgIndex)!= ' ') {
            temp++;
            msgIndex--;
        }
        System.out.println(temp);
    }
}