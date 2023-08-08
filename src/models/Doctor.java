package models;

public class Doctor extends Person    {
    private double salary;


    public Doctor(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public Doctor() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getDoctorData(){
        return "Your Name Is : "+getName()+"\n"+"Your Age Is : "
                +getAge()+"\n"+"Your Salary Is : "+getSalary();
    }

}
