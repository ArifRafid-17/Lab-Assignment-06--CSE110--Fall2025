import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String for_c2 = "";
        String cstore = "";
        String cfinal = "";
        
        for (int i = 0; i < txt.length(); i++) {
            char c1 = txt.charAt(i);
            cstore += c1;

            if (c1=='a' || c1=='A' || c1=='E' || c1=='e' || c1=='I' || c1=='i' || c1=='O' || c1=='o' || c1=='U' || c1=='u') {
                for_c2 += c1;
            }
        }

        int vIndex = for_c2.length() - 1;

        for (int x = 0; x < cstore.length(); x++) {
            char c5 = cstore.charAt(x);

            if (c5=='a' || c5=='A' || c5=='E' || c5=='e' || c5=='I' || c5=='i' || c5=='O' || c5=='o' || c5=='U' || c5=='u') {
                cfinal += for_c2.charAt(vIndex);
                vIndex--;
            } 
            else {
                cfinal += c5;
            }
        }
        System.out.print(cfinal);
    }
}
