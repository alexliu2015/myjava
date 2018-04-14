import java.util.*;

class ForFOrTest2{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int y=i;y<=5;y++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}