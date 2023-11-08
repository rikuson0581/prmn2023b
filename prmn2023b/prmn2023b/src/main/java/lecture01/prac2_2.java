package lecture01;

import java.util.Scanner;

public class prac2_2 {
    public static void main(String[] args){
        String name_1 = "千歳花子";
        int num_1 = 2110000;
        Scanner scan = new Scanner(System.in);
        Login log = new Login( name_1 , num_1 );
        System.out.print("名前を入力して下さい。");
        String name_2 = scan.next();
        System.out.print("学籍番号を入力して下さい。");
        int num_2 = scan.nextInt();
        log.message(name_2,num_2);
    }

}
