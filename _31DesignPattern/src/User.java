//Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
public class User {
    private String name;
    private int age;

    private static User onlyInstance;


    private User() {
    }

    public static User getOnlyInstance() {
        if (onlyInstance == null) {
            onlyInstance = new User();
        }
        return onlyInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
    public void printUser() {
        System.out.println("Name: " + getName() + ", age: " + getAge());
    }
}
