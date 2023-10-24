import java.util.ArrayList;
import java.util.List;
import java.util.*; 

public class AH4{
    List <Integer> array = new ArrayList<>();
    List <Integer> arrayFive = new ArrayList<>();
    Scanner scan = new Scanner(System.in); 
    int i, x;
    public List Sortfive(){
       for(x=0; x<10; x++){
        System.out.println("Enter number");
        if (scan.nextInt()!=5){
        array.add(scan.nextInt()); 
        }
        else{
        arrayFive.add(scan.nextInt());}
        Collections.sort(array);
        }
        array.addAll(arrayFive);
        return array;
    } 
    public static void main(String[] args){
        AH4 obj = new AH4();
        System.out.println(obj.Sortfive());
    }
}