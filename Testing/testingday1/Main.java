public class Main {
    public static void main(String[] args) {
        try{
            int myInt = Integer.parseInt("5");
        }
        catch(NumberFormatException nfe){
            System.out.println("You can't do that");
        }
        System.out.println();
    }

}
