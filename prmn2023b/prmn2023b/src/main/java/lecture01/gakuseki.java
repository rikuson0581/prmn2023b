package lecture01;

import java.util.Objects;
import java.util.Scanner;

public class gakuseki {
    String num ="B2221790";
    public void check(){
        Scanner in = new Scanner(System.in);
        String pnum =in.next();
        if(Objects.equals(pnum, num)){
            System.out.println("complete");
        }else{
            System.out.println("error");
        }
    }

}
