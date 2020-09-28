class Pyramids {
    public static void pyramids(String args []) {
        for (int com=1; com <= 5; com++)
            {
                for (int jakkapat=1; jakkapat <= 4; jakkapat++)
                {
                    System.out.print (com);
                    System.out.print (10-com);
                }
            System.out.println();
        }
    }
}
class Select extends Pyramids {
    public static void main(String args[]) {
        pyramids();
    }
}