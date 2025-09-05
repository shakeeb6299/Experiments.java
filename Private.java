class student {
    private String Name;
    private int Age;

    public void setName(String n){
        Name= n;
    }
    public void setAge(int z){
        Age= z;
    }
    public String getName() {
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public static void main (String[] args) {
        student s = new student();
        s.setName("Shakeeb");
        s.setAge(20);
        System.out.println("Student Name = "+ s.getName());
        System.out.println("Student Age = "+ s.getAge());
    }
}

