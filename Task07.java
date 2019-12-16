import java.lang.String;

public class Task07 {

    public static void main(String[] args){
    	
        System.out.println(norm("caravaggio"));
        System.out.println(norm("VERMEER"));
        System.out.println(init("johann sebastian bach"));
        System.out.println(init("i. babeL"));
        System.out.println(init("jorge LUIS BORGES"));
        System.out.println(init("WOLFGANG a. mozart"));
        System.out.println(tr("November 2016", "abcdefghijklmnopqrstuvwyz", "ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        System.out.println(tr("abcXYZ", "aZcX", "||Cx"));

    }

    public static String norm(String name){ //returns names with first letter uppercase and the following letters lower case

        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static String init(String name){ //returns 
    	
    	String[] names = name.split(" "); // splits the string at the space
    	String result = "";
    	for(int i = 0; i < names.length; ++i) {
    		if(i != names.length -1) {
    			result += names[i].substring(0, 1).toUpperCase() + ". ";
    			continue;
    		}
    		result += norm(names[i]);
    	}
    	
    	
        return result;
    }

    public static String tr(String s, String from, String to){

    	for (int i = 0; i < s.length(); i++) {
    		char currentChar = s.charAt(i);
    	    int position = from.indexOf(currentChar);
    	    if (position > -1) {
    	      s = s.replace(currentChar, to.charAt(position));
    	    }
    	}

    	return s;
   }
}