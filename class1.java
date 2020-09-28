import java.io.*;
class Accept{
    static String data[][] = new String[3][3];
    public static void AcceptData() throws IOException{
        BufferedReader numid = new BufferedReader (new InputStreamReader(System.in));
        for(int i=0;i<3;i++){
            System.out.print("enter id : ");
            data[0][i] = numid.readLine(); 
            System.out.print("enter name : ");
            data[1][i] = numid.readLine(); 
            System.out.print("enter salary : ");
            data[2][i] = numid.readLine(); 
            
        }
    }        
}
class Cal extends Accept{
    public static void calSalary() {
        try {
            AcceptData();
        int sum = 0 ;
        for(int i=0;i<3;i++){ 
            sum +=Integer.parseInt(data[2][i]);              
            }
        System.out.println("Net salary = " + ((sum*0.93)-500) + " $");
        } catch (Exception e) {           
        }     
    }
}
class Select extends Cal {
    public static void main(String args[]) {

        calSalary();
    }
}