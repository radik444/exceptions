public class Main {
    public static void main(String[] args) {
        boolean result = Check.validate("noName","H98_qa","H98_qa");
        if (result){
            System.out.println("Логин и пароль корректные");
        } else {
            System.out.println("Логин или пароль не корректные");
        }
    }
}