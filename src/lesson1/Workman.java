package lesson1;

public class Workman {
    public String name;
    public String post;
    public String email;
    public String phone;
    public int wage;
    public int age;


    public Workman(String name, String post, String email, String phone, int wage, int age) {


        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.wage = wage;
        this.age = age;
    }

    public int getAge() {
        return age;


    }


    public Workman(String name, String post, String email, String phone, int wage) {
        this(name, post, email, phone, wage, 0);
    }


    public Workman(String name, String post, String email, String phone) {
        this(name, post, email, phone, 0);
    }


    public Workman(String name, String post, String email) {
        this(name, post, email, null);
    }


    public Workman(String name, String post) {
        this(name, post, null);
    }


    public Workman(String name) {
        this(name, null);
    }


    public Workman() {
        this(null);
    }


    public void name() {
        System.out.println(name);
    }


    public void workman() {
        System.out.println(name + ", " + post + ", " + email + ", " + phone + ", " + wage + ", " + age);
    }


    @Override
    public String toString() {
        return "Workman{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", wage=" + wage +
                ", age=" + age +
                '}';
    }

}
