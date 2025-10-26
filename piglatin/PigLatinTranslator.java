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

fVowel=-1;
        for (int i=0; i<input.length(); i++)
    {
      String currentLetter = input.substring(i,i+1);
      if (isVowel(currentLetter))
      {
        fVowel=i;
        break;
      }
    }
String raw;
if (fVowel==0){

  raw=input + "ay";

} else if (fVowel==-1){

  raw= input+ "ay";
} else {

  raw=input.substring(fVowel)+input.substring(0, fVowel)+"ay";
}
if (Character.isUpperCase(input.charAt(0))) {

  raw= Character.toUpperCase(raw.charAt(0)) + raw.substring(1).toLowerCase();
  if(raw.length()==1){

    raw=raw.toUpperCase();
  } else {

    raw= Character.toUpperCase(raw.charAt(0))+ raw.substring(1).toLowerCase();
  }
}
return raw;    }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)
    static int fVowel;
    public static boolean isVowel(String letter)
  {
    if (letter.length() == 1)
    {
      String vowels = "aeiouy";
      if (vowels.indexOf(letter) != -1)
      {
        return true;
      }
    }
    return false;
    
  }

}
