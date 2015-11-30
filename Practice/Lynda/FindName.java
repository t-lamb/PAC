import java.util.*;

public class FindName {
    public static void main(String[] args) {
        String[][] names = {{"Mickey", "Mouse"},
            {"Donald", "Duck"},
            {"Goofy", "Pluto"},
            {"Snow", "White"},
            {"James", "Bond"},
            {"Doc", "Sneezy"},
            {"Scotty", "Jimmy"},
            {"Peggy", "Sandy"},
            {"Joe", "Sean"},
            {"Alice", "Mackenzie"},
            {"Reshmi", "Vasant"},
            {"Steve", "Rae"}};
        //ask the user to enter a name, then pass the name and array to 
        //the method to search for that name. 

        Scanner in = new Scanner(System.in);
        String input = "";
        boolean quit = false;
        while(!quit){
            System.out.println("Name to find: (q=quit)");
            input = in.next();
            if (input.equals("q")){
                quit = true;
            } else if (find(names,input)){
                System.out.println("yup");
            } else {
                System.out.println("nope");
            }
        }
    }
    public static boolean find(String[][] nameTable, String nameToFind){
        for (String nameArr[] : nameTable){
            for (String name : nameArr){
                if (name.equalsIgnoreCase(nameToFind)){
                    return true;
                }
            }
        }
        return false;
    }
}
    

