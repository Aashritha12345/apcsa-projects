package piglatin;

public class PigLatinTranslator {
    public static Book translate(Book input) {
        Book translatedBook = new Book();

        // TODO: Add code here to populate translatedBook with a translation of the
        // input book.
        // Curent do-nothing code will return an empty book.
        // Your code will need to call translate(String input) many times.

        return translatedBook;
    }

    public static String translate(String input) {
        System.out.println("  -> translate('" + input + "')");

        
        String result = translateWord(input);

        return result; 
    }

    private static String translateWord(String input) {
        System.out.println("  -> translateWord('" + input + "')");
String result = "";
         if (input.startsWith("a")|| input.startsWith("e")||input.startsWith("i")||input.startsWith("o")||input.startsWith("u")||input.startsWith("y"))   {


           return input + "ay";

         }      
        
        if (!(input.charAt(1).equals('a'))|| !(input.charAt(1).equals('e'))||!(input.charAt(1).equals('i'))||(input.charAt(1).equals('o'))||(input.charAt(1).equals('u'))||(input.charAt(1).equals('y'))){
        
            return input.substring(2) + input.substring(0,2) + 'ay';


        } else {

            return input.substring(1)+ input.substring (0,1) + 'ay';
        }
        
        
        
         // TODO: Replace this code to correctly translate a single word.
        // Start here first!
       // String vowels = "aeiouy";
       // if (vowels.indexOf(test)!=-1)
        //for (int i=0;i<input.length(); i++)
      //  {
       //        System.out.println(test + "is a vowel");
       // }
        //char a;
        //a.isuUppercase()
        //Pig 
        //g Pi ay
        //G pi ay
        //if (input.charAt(0).isuUppercase()){
            //the input have first char capped 
        //}
        // TODO: translate a string input, store in result.
        // The input to this function could be any English string.
        // It may be made up of many words.
        // This method must call translateWord once for each word in the string.
        
        // This is the first place to work.

        return result;
    }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)

}
