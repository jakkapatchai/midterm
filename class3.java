import java.io.*;
class inp{
    static String data[] = new String[3];
    public static void ipnum() throws IOException{
        BufferedReader numid = new BufferedReader (new InputStreamReader(System.in));
        for(int i=0;i<3;i++){
            System.out.print("enter num : ");
            data[i] = numid.readLine();   
        }
    }        
}
class plus extends inp{
    public static void plussum() {
        try {
            ipnum();
        int sum = 0 ;
        for(int i=0;i<3;i++){ 
            sum +=Integer.parseInt(data[i]);              
            }
        System.out.println("SUM = " + sum );
        } catch (Exception e) {           
        }     
    }
}
class Select extends plus {
    public static void main(String args[]) {

        plussum();
    }
}