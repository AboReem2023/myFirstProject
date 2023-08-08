package models;

public class Student extends Person  {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public Student() {
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStudentData() {
        return "Your Name Is : "+getName()+"\n"+"Your Age Is : "
                +getAge()+"\n"+"Your Grade Is : "+getGrade();

    }
}
