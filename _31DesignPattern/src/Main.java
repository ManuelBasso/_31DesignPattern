public class Main {
    public static void main(String[] args) {

        User a = User.getOnlyInstance();
        a.printUser();

        User b = User.getOnlyInstance();
        b.setName("Marco");
        b.setAge(33);
        b.printUser();


    }
}