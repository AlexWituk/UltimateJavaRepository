package Unit02.Topic2_2;


public class Main {
  public class Employee {
    private String name;
    private String empId;
    private int pay;

    public Employee() {
      name = null;
      empId = null;
      pay = 0;
    }

    public Employee(String nm, String id, int py) {
      name = nm;
      empId = id;
      pay = py;
    }
  }

  Employee person1 = new Employee("Simon", "7888", 60000);
  public static void main(String[] args) {

  }
}
