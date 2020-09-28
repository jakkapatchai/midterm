import java.io.*;
class Inp{
    static String data[][] = new String[3][3];
    public static void Inname() throws IOException{
        BufferedReader numid = new BufferedReader (new InputStreamReader(System.in));
        for(int i=0;i<3;i++){
            System.out.print("enter id : ");
            data[0][i] = numid.readLine(); 
            System.out.print("enter name : ");
            data[1][i] = numid.readLine(); 
            System.out.print("enter salary : ");
            data[2][i] = numid.readLine();  
        }
        for(int i=0;i<3;i++){
            System.out.print(" id : " + data[0][i]); 
            System.out.print(" name : " + data[1][i]);
            System.out.print(" salary : " + data[2][i]);
        }
    }        
}

class Select extends Cal {
    public static void main(String args[]) {

        Inname();
    }
}