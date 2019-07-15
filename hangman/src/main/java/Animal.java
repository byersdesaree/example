public class Animal {
    private String type;
    private int age;
    private String name;

    public String getType() {
        return this.type;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        if (this.type.equalsIgnoreCase("dog")) {
            System.out.println("Woof");
        }
            else if (this.type.equalsIgnoreCase("cat")){
                System.out.println("Meow");
        }
    }
}



