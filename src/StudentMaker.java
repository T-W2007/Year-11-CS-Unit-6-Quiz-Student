public class StudentMaker {
  
  public static void main(String[] args) {
    Address address = new Address("180","Causeway Bay", "Tung Lo Wan Road");
    Student student = new Student( "Belinda Yu", 17, "year 12", address);
    student.setFirstName("Bella");
    System.out.println(student.getAge());
    int age = student.birthday();
    System.out.println(age);
    System.out.println(student);
  }
}

