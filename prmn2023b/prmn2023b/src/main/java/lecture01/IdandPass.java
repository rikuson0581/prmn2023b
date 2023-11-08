package lecture01;

import java.util.Scanner;

public class IdandPass {
    String[][] IaP;
    IdandPass(String[][] IdPass) {
        IaP = IdPass;
    }
    public void check(){
        int n=Idcheck();
        Passcheck(n);
    }
    public int  Idcheck(){
        Scanner scan = new Scanner(System.in);
        System.out.println("学籍番号を入力してください");
        String Id =scan.next();
        for(int n =0;n<IaP.length;n++){
            if(Id.equals(IaP[n][0])){

                return n;
            }
        }
        System.out.println("error");
        System.exit(1);
        return 0;
    }
    public void Passcheck(int Id){
        Scanner scan = new Scanner(System.in);
        System.out.println("パスワードを入力してください:");
        String Pass =scan.next();

            if(Pass.equals(IaP[Id][1])){
                System.out.println("ログイン成功");
                return;
            }
        System.out.println("不正なアクセス");
            System.exit(2);
    }
}
