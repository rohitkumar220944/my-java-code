public class spaceREPLACEunderscore {

    public static void main(String[] args) {
        String text="my name is rohit kumar";
        String sc=text.toUpperCase();
        System.out.println(sc);
        System.out.println(sc.replace(" ","_"));


        //problem 3

        String sentenace="Dear <|name|> thanks a lot!";
        String hi= sentenace.replace("<|name|>","rohit");
        System.out.println(hi);
    }
}
