package ss10_DSA.ArrayList;

public class MyArrayListTest {
    private static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Student() {

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "A_Thao");
        Student student2 = new Student(2, "B_Thao");
        Student student3 = new Student(3, "C_Thao");
        Student student4 = new Student(4, "D_Thao");
        Student student5 = new Student(5, "E_Thao");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5);

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];

            System.out.println(student.getId());
            System.out.println(student.getName());
        }

    }
}


