package piglatin;

public class PigLatinTranslator {
    public static Book translate(Book input) {
        if (input==null){
          return null;
        }
                Book translatedBook = new Book();
        translatedBook.setTitle(input.getTitle());
        for (int i = 0; i < input.getLineCount(); i++) {
            translatedBook.appendLine(translate(input.getLine(i)));
        }
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

if (input==null|| input.isEmpty()) return input;
boolean origCap = Character.isUpperCase(input.charAt(0));
int fv=-1;
for (int i=0;i<input.length();i++){

  char c= Character.toLowerCase(input.charAt(i));
  if ("aeiou".indexOf(c)>=0|| (c=='y' && i!=0)){
    fv=i;
    break;
  }
}
String raw;
if(fv==0){

  raw=input + "ay";

}else if (fv==-1){

raw=input+ "ay";
} else {

  raw=input.substring(fv)+ input.substring(0,fv)+"ay";
  raw=raw.toLowerCase();
  if (origCap) {

    raw= Character.toUpperCase(raw.charAt(0))+ raw.substring(1);
  }

}
return raw;   
 }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)
    public static boolean isVowel(String letter)
  {
    if(letter==null || letter.length()!=1) return false;
    char c= Character.toLowerCase(letter.charAt(0));
    return "aeiouy".indexOf(c)!=-1;


  }

}