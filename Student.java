 class Student {
    String name;
    int age;
    Student(){
        this.name="Shakeeb";
        this.age=25;
    }
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.Display();
            Student s2 = new Student("Chandan", 24);
            s2.Display();
            Student s3 = new Student(s2);
            s3.Display();
        }
    
}
