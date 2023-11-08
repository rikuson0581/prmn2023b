package lecture01;

import java.util.Scanner;

public class Keisan {
    int[] score;
    int sum;
    Keisan(int n){
        score =new int[n];
        for(n = 0;n<score.length;n++){
            Scanner scan = new Scanner(System.in);
            System.out.print("番号を入力:");
            score[n] = scan.nextInt();
        }
    }
    public void sum(){
        sum=0;
        for (int i : score) {
            sum += i;
        }
        System.out.println("合計値は:" + sum);
    }
    public void judge(){
        if(sum>=100){
            System.out.println("grate!!");
        }else if(sum>=50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
}
