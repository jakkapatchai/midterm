import java.io.*;
class inp{
    static String data[] = new String[3];
    public static void ipnum() throws IOException{
        BufferedReader numid = new BufferedReader (new InputStreamReader(System.in));
        int sum = 0 ;
        for(int i=0;i<3;i++){
            System.out.print("enter num : ");
            data[i] = numid.readLine();   
        }
        for(int i=0;i<3;i++){ 
        sum = sum / (Integer.parseInt(data[i]));              
        }
        System.out.println("SUM = " + sum );
    }        
}
