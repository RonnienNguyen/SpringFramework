import lombok.Data;

@Data
public class Animal {
    String name;
    int age;

    public void eat(){
        System.out.println("Eat");
    }
}
