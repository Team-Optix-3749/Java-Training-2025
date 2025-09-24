public class Information {
    // 🔒 Private variables
    private String name;
    private int age;
    private String gender;

    // Constructor
    public Information(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Boolean getter for age above 21
    public boolean isAbove21() {
        return age > 21;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create two instances
        Information person1 = new Information("Alice", 25, "Female");
        Information person2 = new Information("Bob", 19, "Male");

        // Print info with above 21 check
        System.out.println(person1.getName() + " (" + person1.getGender() + ") is above 21: " + person1.isAbove21());
        System.out.println(person2.getName() + " (" + person2.getGender() + ") is above 21: " + person2.isAbove21());
    }
}
