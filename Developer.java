
public class Developer extends Employee {

    private String developer_id;
    private String[] pr_languages;

    public String getDeveloper_id() {
        return this.developer_id;
    }

    public void setDeveloper_id(String developer_id) {
        this.developer_id = developer_id;
    }

    public String[] getPr_languages() {
        return this.pr_languages;
    }

    public void setPr_languages(String[] pr_languages) {
        this.pr_languages = pr_languages;
    }


    public Developer(int em_age, String em_name, String em_designation, String em_department, double em_salary, String developer_id, String[] pr_languages) {
        super(em_age, em_name, em_designation, em_department, em_salary);
        this.developer_id = developer_id;
        this.pr_languages = pr_languages;
    }

    public Developer(Developer developer, String developer_id) {
        super(developer.getEm_age(), developer.getEm_name(), developer.getEm_designation(), developer.getEm_department(), developer.getEm_salary());
        this.developer_id = developer_id;
        this.pr_languages = developer.pr_languages;
    }

    public void updateSkill(String language) {
        int n = this.pr_languages.length;
        String[] newLanguareArray = new String[n + 1];
        for(int i = 0; i < n ; i++) {
            newLanguareArray[i] = this.pr_languages[i];
        }
        newLanguareArray[n] = language;
        setPr_languages(newLanguareArray);
    }

    public void raiseSalary(double salaryRaise) {
        double presentSalary = this.getEm_salary();
        presentSalary += salaryRaise;
        this.setEm_salary(presentSalary);
    }

    public void changeDestination(String newDestination) {
        this.setEm_designation(newDestination);
    }

    public double displaySalary() {
        return this.getEm_salary();
    }

    
}
