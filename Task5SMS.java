import java.util.*;

class Student {
 int id; String name; String course;
 Student(int id, String name, String course) {
 this.id = id; this.name = name; this.course = course;
 }
 void show() { System.out.println(id+" | "+name+" | "+course); }
}

class StudentManagement {
 List<Student> students = new ArrayList<>();

 void addStudent() {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter ID, Name, Course: ");
 int id = sc.nextInt(); String name = sc.next(); String course = sc.next();
 students.add(new Student(id, name, course));
 System.out.println("Student added!");
 }

 void viewStudents() {
 if (students.isEmpty()) System.out.println("No students found.");
 else students.forEach(Student::show);
 }

 void removeStudent() {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter ID to remove: ");
 int id = sc.nextInt();
 students.removeIf(s -> s.id == id);
 System.out.println("Student removed if existed.");
 }

 void searchStudent() {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter ID to search: ");
 int id = sc.nextInt();
 for (Student s : students) {
 if (s.id == id) { s.show(); return; }
 }
 System.out.println("Student not found.");
 }

 void updateStudent() {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter ID to update: ");
 int id = sc.nextInt();
 for (Student s : students) {
 if (s.id == id) {
 System.out.print("Enter new Name and Course: ");
 s.name = sc.next(); s.course = sc.next();
 System.out.println("Student updated!");
 return;
 }
 }
 System.out.println("Student not found.");
 }
}

public class Task5SMS {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 StudentManagement sm = new StudentManagement();

 while (true) {
 System.out.println("\n1.Add 2.View 3.Remove 4.Search 5.Update 6.Exit");
 int ch = sc.nextInt();
 switch (ch) {
 case 1: sm.addStudent(); break;
 case 2: sm.viewStudents(); break;
 case 3: sm.removeStudent(); break;
 case 4: sm.searchStudent(); break;
 case 5: sm.updateStudent(); break;
 case 6: System.out.println("Goodbye!"); return;
 default: System.out.println("Invalid choice!");
 }
 }
 }
}
