import java.util.*;

class BreakContinueDemo{
    public static void main(String[] args){
        outside:for(int i=0; i<3; i++){
            inside:for(int j=0; j<4; j++){
                System.out.println("i="+i);
                break inside;
            }
            
        }
    
    }
}