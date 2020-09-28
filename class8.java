class Averages {
    public static void averages (String args[]) {
        double total = 0 ;
        double average = 0 ; 
        for (int i = 0 ; i < args.length ; i++) {
            total += Double.parseDouble(args[i]); 
        }
        System.out.println(total);
        average = total / args.length ; 
        System.out.println(average);
    }
}
class Select extends Averages {
    public static void main(String args[]) {
        averages();
    }
}