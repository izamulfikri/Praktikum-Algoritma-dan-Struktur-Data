package Source_Code;
import java.util.Iterator;
import java.util.Stack;

public class LoopCollection {
    public static void main(String[] args) {
        // List<String> fruits = new List<>();
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("WaterMelon");
        fruits.add("Leci");
        fruits.add("Salak");
    
        for(String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n"+fruits.toString());

        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        fruits.push("Melon");
        fruits.push("Strawberry"); // untuk pertanyaan nomor 5

        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });

        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ",fruits.get(i));
        }

        // untuk pertanyaan nomor 6
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");

        // Proses sort
        fruits.sort((String a, String b)->a.compareTo(b));
        System.out.println("");
        System.out.println("Data Sesudah Sorting");
        System.out.println("--------------------------");

        for(int i=0; i<fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
}