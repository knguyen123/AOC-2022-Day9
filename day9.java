import java.io.*;
import java.util.*;
public class day9{  
    public static void main(String[] args) throws FileNotFoundException{
      Scanner f = new Scanner(new File("rope.txt")); 
      Rope r = new Rope();
      while(f.hasNextLine()){
      	String s = f.next();
      	int n = Integer.parseInt(f.next());
      	for(int c = 0; c < n; c++){
      		r.move(s);		
      	}
      	
      }
      r.count();
   }
}
/*
class Rope{          
   private char[][] a = new char[1000][1000];
   private boolean[][] steps = new boolean[1000][1000];
   private int rh = 500;
   private int ch = 500;
   private int rt = 500;
   private int ct = 500;
   
   public Rope(){
      a[500][500] = 'H';
      steps[500][500] = true;
   }
  
   public void move(String s){
   
   	//diagonal right & up
      if(ct+1==ch&&rt-1==rh){
      	switch(s){
            case "U":
               hMoveUp();
               tMoveUp();
               tMoveRight();
               steps[rt][ct] = true;   
      			break;
      		case "D":
      			hMoveDown();
      			break;
            case "L":
               hMoveLeft();
      			break;
            case "R":
               hMoveRight();
               tMoveUp();
               tMoveRight();
               steps[rt][ct] = true;   
      			break;
      	}
      //diagonal left & up
      }else if(ct-1==ch&&rt-1==rh){
         switch(s){
            case "U":
               hMoveUp();
               tMoveUp();
               tMoveLeft();
               steps[rt][ct] = true;   
      			break;
      		case "D":
      			hMoveDown();
      			break;
            case "L":
            	hMoveLeft();
               tMoveUp();
               tMoveLeft();
               steps[rt][ct] = true;   
        			break;	
            case "R":
               hMoveRight();
      			break;	
         }
      
      //diagonal right & down
      }else if(ct+1==ch&&rt+1==rh){
         switch(s){
            case "U":
      			hMoveUp();
      			break;
      		case "D":
      			hMoveDown();
               tMoveDown();
               tMoveRight();  
               steps[rt][ct] = true;             	
         		break;
            case "L":
               hMoveLeft();
        			break;	
            case "R":
        			hMoveRight();
               tMoveDown();
               tMoveRight(); 
               steps[rt][ct] = true;           	   
         		break;	
         }
      //diagonal left & down
      }else if(ct-1==ch&&rt+1==rh){
         switch(s){
            case "U":
      			hMoveUp();
      			break;
      		case "D":
      			hMoveDown();
               tMoveDown();
               tMoveLeft();   
               steps[rt][ct] = true;            	
         		break;
            case "L":
               hMoveLeft();
               tMoveDown();
               tMoveLeft(); 
               steps[rt][ct] = true;    
         		break;
            case "R":
               hMoveRight();
        			break;	
         }
      //up
      }else if(rt-1==rh){
         switch(s){
            case "U":
      			hMoveUp();
               tMoveUp(); 
               steps[rt][ct] = true;   
      			break;
      		case "D":
      			hMoveDown();
         		break;
            case "L":
               hMoveLeft();
         		break;
            case "R":
               hMoveRight();
        			break;
         }	
      //down
      }else if(rt+1==rh){
         switch(s){
            case "U":
      			hMoveUp();
         		break;
      		case "D":  
               hMoveDown();
               tMoveDown();  
               steps[rt][ct] = true;          	
      			break;
            case "L":
               hMoveLeft();
         		break;
            case "R":
               hMoveRight();
        			break;
         }      
      //left
   	}else if(ct-1==ch){
   	   switch(s){
            case "U":
      			hMoveUp();
         		break;
      		case "D":  
      			hMoveDown();
         		break;
            case "L":
               hMoveLeft();
               tMoveLeft();
               steps[rt][ct] = true;     
      			break;
            case "R":
               hMoveRight();
        			break;
         }   
   	//right
   	}else if(ct+1==ch){
   	   switch(s){
            case "U":
      			hMoveUp();
         		break;
      		case "D":  
      			hMoveDown();
         		break;
            case "L":
               hMoveLeft();
        			break;
            case "R":
               hMoveRight();
               tMoveRight(); 
               steps[rt][ct] = true;    
      			break;
         }  
      //H is on T
   	}else if(ct==ch&&rt==rh){
         switch(s){
            case "U":
      			hMoveUp();
         		break;
      		case "D":  
      			hMoveDown();
         		break;
            case "L":
               hMoveLeft();
        			break;
            case "R":
               hMoveRight();
      			break;
         }   
      }
   }
   
   private void hMoveUp(){
		a[rh][ch] = ' ';
		rh--;
		a[rh][ch] = 'H';    
   }
   private void hMoveDown(){
		a[rh][ch] = ' ';
		rh++;
		a[rh][ch] = 'H';    
   }
   private void hMoveLeft(){
		a[rh][ch] = ' ';
		ch--;
		a[rh][ch] = 'H';    
   }
   private void hMoveRight(){
		a[rh][ch] = ' ';
		ch++;
		a[rh][ch] = 'H';    
   }
   private void tMoveUp(){
		a[rt][ct] = ' ';
		rt--;
		a[rt][ct] = 'T'; 
   }
   private void tMoveDown(){
		a[rt][ct] = ' ';
		rt++;
		a[rt][ct] = 'T'; 
   }
   private void tMoveLeft(){
		a[rt][ct] = ' ';
		ct--;
		a[rt][ct] = 'T';  
   }
   private void tMoveRight(){
		a[rt][ct] = ' ';
		ct++;
		a[rt][ct] = 'T';   
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
*/   
      
      
      
      
      
      