import java.io.*;
class four {
  public static void main(String args[]) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    int i[] = new int[5];
    int max = 0;
    int min = 999;
    double total = 0;
    double average = 0;
    for (int j = 0; j < 5; j++) {
      i[j] = Integer.parseInt(stdin.readLine());
    }
    for (int j = 0; j < 5; j++) {
      if (i[j] > max) 
      {
        max = i[j];
      }
      if (i[j] < min) 
      {
        min = i[j];
      }
      total += i[j];
    }
    average = total / 5;
    System.out.println("max = " + max);
    System.out.println("min = " + min);
    System.out.println("total = " + total);
    System.out.println("average = " + average);
  }
}