package lecture01;

public class prac3 {
    public static void main(String[] args) {
        String[][] ip = new String[5][2];
        for(int n = 0; n<ip.length;n++){
            ip[n][0] ="a"+n+n+n;
            ip[n][1] ="b"+n+n+n;
        }
            IdandPass IP =new IdandPass(ip);
        IP.check();
    }
}
