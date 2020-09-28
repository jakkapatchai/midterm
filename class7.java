class Maxs {
    public static void maxs (String args[]) {
        int max = 0 ; 
        for (int i = 1 ; i < args.length ; i++) {
            if (max <= Integer.parseInt(args[i])) {
            max = Integer.parseInt(args[i]) ;
            }
        }
        System.out.println(max);
    }
}
class Select extends Maxs {
    public static void main(String args[]) {
        maxs();
    }
}