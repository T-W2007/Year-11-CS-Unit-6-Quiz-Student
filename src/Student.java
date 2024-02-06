public class Student {
    private static int age;
    private static String firstName;

    private static String lastName;

    private static int year;

    private Address address;


    public Student(int age, String firstName, String lastName, int year, Address address) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.address = address;
    }

    public Student(String belindaYu, int i, String lastName, Address address) {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(String lastName) {
        this.year = year;
    }

    public void addOneAge() {
        this.age++;
    }

    public int birthday() {
        addOneAge();
        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", age " + age + ", year " + year + ", " + address.toString();
    }

}
