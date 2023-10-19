import java.util.List;
import java.util.Objects;

public class Employee { //immutable ,binary search using recursiion,map sort and print,



   final   int id;
   final List<String> skill;

    public Employee(int id, List<String> skill) {
        this.id = id;
        this.skill = skill;
    }

    public int getId() {
        return id;
    }

    public List<String> getSkill() {
        return skill;
    }

}
