class Employee {
    String name; int id; double salary;
    Employee(String n, int i, double s) { name=n; id=i; salary=s; }
    void show() { System.out.println(name+" | "+id+" | "+salary); }
}

class Manager extends Employee {
    String dept;
    Manager(String n, int i, double s, String d) { super(n,i,s); dept=d; }
    @Override void show() { super.show(); System.out.println("Dept: "+dept); }
}

public class Task2 {
    public static void main(String[] args) {
        Employee e = new Employee("Pravallika",101,50000);
        Manager m = new Manager("hansika",102,80000,"IT");
        e.show(); m.show();
    }
}
