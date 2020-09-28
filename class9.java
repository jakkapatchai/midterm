class Mins {
    public static void mins (String args[]) {
        int min = 99 ; 
        for (int i = 1 ; i < args.length ; i++) {
            if (min >= Integer.parseInt(args[i])) {
                min = Integer.parseInt(args[i]) ;
            }
        }
        System.out.println(min);
    }
}
class Select extends Mins {
    public static void main(String args[]) {
        mins();
    }
}