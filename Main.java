import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList<String> temp = new ArrayList<>();
        String[] temp = {"Python"};
        Developer developer = new Developer(12, "HP", "Laptop", "Devices", 1000000.00, "1", temp);
        developer.updateSkill("java");
        developer.raiseSalary(24789.12);

        Developer backup = new Developer(developer, "2");
        System.out.println("Input Values:  12 HP Devices 1000000 1 \"Python\"\n");
        System.out.println("Developer- age:"+developer.getEm_age()+" Name:"+developer.getEm_name()+" Designation:"+developer.getEm_designation()+" Department:"+developer.getEm_department()+" Salary:"+developer.getEm_salary()+" DevId:"+developer.getDeveloper_id());
        System.out.println("Backup- age:"+backup.getEm_age()+" Name:"+backup.getEm_name()+" Designation:"+backup.getEm_designation()+" Department:"+backup.getEm_department()+" Salary:"+backup.getEm_salary()+" DevId:"+backup.getDeveloper_id());

    }
}
