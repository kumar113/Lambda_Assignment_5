import java.util.*;
import java.util.stream.Collectors; 
//Functional Interface
interface DistinctString{
    void distinctString(List<String> list);
}
//main class
public class Lambda5{
    public static void main(String[] args) {
        String text;
        Scanner ic = new Scanner(System.in);
        try{
        System.out.println("Enter String:");
        text = ic.nextLine();
        List<String> inputList = Arrays.asList(text.split("\\s+"));
        //Lambda Expression
        DistinctString obj = (List<String> List)-> { System.out.println(List.stream().sorted().distinct().collect(Collectors.toList()));};
        obj.distinctString(inputList);
        }
        finally{
            ic.close();
        }
        
    }
}