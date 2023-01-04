import java.io.*;
import java.util.*;
public class day9P2{  
    public static void main(String[] args) throws FileNotFoundException{
      Scanner f = new Scanner(new File("rope.txt")); 
      Rope r = new Rope();
      while(f.hasNextLine()){
      	String s = f.next();
      	int n = Integer.parseInt(f.next());
      	for(int c = 0; c < n; c++){	
            r.thing(s);
      	}
      	
      }
      r.count();
   }
}
class Rope{          
   private boolean[][] steps = new boolean[1000][1000];
   private int[] x = new int[10];
   private int[] y = new int[10];
   
   public Rope(){
      for(int i = 0; i < 10; i++){
         x[i]=500;
         y[i]=500;
      }
      steps[500][500] = true;
   }
   public void thing(String s){
      move(s, 0, 0);
      for(int i = 0; i < 9; i++){
         boolean b = true;
         int r1 = y[i];
         int r2 = y[i+1];
         int c1 = x[i];
         int c2 = x[i+1];
         if(c1==c2&&r1-2==r2){
            move("D", i+1, i+1);
            b = false;
         }
         if(c1==c2&&r1+2==r2){
            move("U", i+1, i+1);
            b = false;
         }
         if(r1==r2&&c1-2==c2){
            move("R", i+1, i+1);
            b = false;
         }
         if(r2==r1&&c1+2==c2){
            move("L", i+1, i+1);
            b = false;
         }
         if((r1-2==r2&&c1-1==c2)||(r1-1==r2&&c1-2==c2)||(r1-2==r2&&c1-2==c2)){
            move("DR", i+1, i+1);
            b = false;
         }
         if((r1+2==r2&&c1-1==c2)||(r1+1==r2&&c1-2==c2)||(r1+2==r2&&c1-2==c2)){
            move("UR", i+1, i+1);
            b = false;
         }
         if((r1-2==r2&&c1+1==c2)||(r1-1==r2&&c1+2==c2)||(r1-2==r2&&c1+2==c2)){
            move("DL", i+1, i+1);
            b = false;
         }
         if((r1+2==r2&&c1+1==c2)||(r1+1==r2&&c1+2==c2)||(r1+2==r2&&c1+2==c2)){
            move("UL", i+1, i+1);
            b = false;
         }
         if(b){
            break;
         }
      }
   }
   
   
   
   
   public void move(String s, int iX, int iY){
      switch(s){
         case "U":
            y[iY]--;
            break;
         case "D":
            y[iY]++;
            break;
         case "L":
            x[iX]--;
            break;
         case "R":
            x[iX]++;
            break;
         case "UR":
            y[iY]--;
            x[iX]++;
            break;
         case "UL":
            y[iY]--;
            x[iX]--;
            break;
         case "DR":
            y[iY]++;
            x[iX]++;
            break;
         case "DL":
            y[iY]++;
            x[iX]--;
            break;
      }
      if(iX==9){
         steps[x[iX]][y[iY]] = true;
      }
   }
   
   public void count(){
      int n = 0;
      for(int r = 0; r <1000; r++){
         for(int c = 0; c <1000; c++){
            if(steps[r][c]){
               n++;
            }
         }
      }
      System.out.print(n+"");
   }
}   
      