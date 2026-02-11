import java.util.Scanner;
public class Question03{
  public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Names of the spells: ");
   String empstr="";
   int i=0;
   int maxval=0;
   while(true){
    String spellname=sc.nextLine();
    i++;
      if(spellname.equals("stop")){
       break;
    }
      char c2;
      
      for(int j=0; j<spellname.length(); j++){
      char c1=spellname.charAt(j);
      
      if(c1>=(int)'a' && c1<=(int)'z'){
                      c2=(char)(c1-32);
                      empstr+=c2;
      }
       else if( c1>=(int)'A' &&  c1<=(int)'Z' ){
                        c2=c1;
                       empstr+=c2;
           }
            int splen= empstr.length();
            if(splen>maxval){
            maxval=splen;
            
      }
      
   }
   
   
  }
   System.out.print(maxval);
}
}