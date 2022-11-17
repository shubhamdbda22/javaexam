

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args)
    {
        // Creating an array list
        ArrayList<String> languages = new
                ArrayList<>();
        languages.add("Java");
        languages.add("Javascript");
        languages.add("Python");
        System.out.println("ArrayList:"+ languages);
        //Using for loop
        System.out.println("Iterating over ArrayList using for Loop:");
        for(int i = 0; i< languages.size(); i++)
        {
            System.out.print(languages.get(i));
            System.out.print(",");
        }
    }
}
