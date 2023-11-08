package lecture01;

import java.util.Scanner;

public class prog2_1 {
    static String name1 = "千歳太郎";
    static int num = 2001000;
    public static void main(String[] args){
        System.out.printf("現在の氏名：%s , 学籍番号：b%d", name1 ,num);
        System.out.println("氏名を変更しますか:y/n");
        if(TorF()){
            Scanner scan = new Scanner(System.in);
            System.out.print("氏名を入力:");
            name1 = scan.next();
        }
        System.out.printf("氏名：%s , 学籍番号：b%d", name1 ,num);

    }
    static boolean TorF(){
        Scanner scan = new Scanner(System.in);
        while(true){
            String q = scan.next();
            if(q.equals("y")){
                return true;
            }else if(q.equals("n")){
                return false;
            }
            System.out.println("yかnを入力してください");
        }
    }
}
