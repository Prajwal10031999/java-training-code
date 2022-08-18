public class Employee {

    private int em_age;
    private String em_name;
    private String em_designation;
    private String em_department;
    private double em_salary;


    public Employee(int em_age, String em_name, String em_designation, String em_department, double em_salary) {
        this.em_age = em_age;
        this.em_name = em_name;
        this.em_designation = em_designation;
        this.em_department = em_department;
        this.em_salary = em_salary;
    }

    public int getEm_age() {
        return this.em_age;
    }

    public void setEm_age(int em_age) {
        this.em_age = em_age;
    }

    public String getEm_name() {
        return this.em_name;
    }

    public void setEm_name(String em_name) {
        this.em_name = em_name;
    }

    public String getEm_designation() {
        return this.em_designation;
    }

    public void setEm_designation(String em_designation) {
        this.em_designation = em_designation;
    }

    public String getEm_department() {
        return this.em_department;
    }

    public void setEm_department(String em_department) {
        this.em_department = em_department;
    }

    public double getEm_salary() {
        return this.em_salary;
    }

    public void setEm_salary(double em_salary) {
        this.em_salary = em_salary;
    }

    public Employee(Employee employee) {
        this.em_age = employee.em_age;
        this.em_name = employee.em_name;
        this.em_designation = employee.em_designation;
        this.em_department = employee.em_department;
        this.em_salary = employee.em_salary;
    }



}