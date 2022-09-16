package Module02;

public class HocSinh {
        private String name;
        private int age;
        private String homeTown;

    public HocSinh(String name, int age, String homeTown) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
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

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public  String toString() {

        return "Name: " + getName()+"\nAge: " + getAge()+"\nHome Town: " + getHomeTown();
    }
}
