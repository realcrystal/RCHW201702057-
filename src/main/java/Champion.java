import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Champion {
    private String name;
    private String position;
    Champion(String s1, String s2) {
        this.name = s1;
        this.position = s2;
    }

    public Object getName() {
        return name;
    }

}