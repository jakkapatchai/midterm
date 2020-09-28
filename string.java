import java.io.*;
class four {
  public static void main(String args[]) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String[] names = new String[] { "com1", "com2", "com3"};
    for (int i = 0; i < 3; i++) {
        System.out.println("names[" + i + "] = " + names[i]);
    }
  }
}
