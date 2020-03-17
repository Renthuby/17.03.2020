public class People {
    private String name;
    private int age;
    private int height;

    public People(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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
/*
    @Override
    public int compareTo(People o) {
        return this.getName().compareTo(o.getName());
    }*/

    @Override
    public String toString() {
        return  name + ", " +
                age + ", " +
                height;
    }
}
