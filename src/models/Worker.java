package models;

public class Worker extends Person  {
    private String job;

    public Worker(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public Worker() {
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getWorkerData(){
        return "Your Name Is : "+getName()+"\n"+"Your Age Is : "
                +getAge()+"\n"+"Your Job Is : "+getJob();
    }
}
