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

        if (input == null) return null;
        if(input.isBlank()) return "";
        String[] parts = input.split(" ", -1);
        for (int i = 0; i < parts.length; i++) {
            if (parts[i] == null || parts[i].isEmpty()) continue;
            parts[i] = translateWord(parts[i]);
        }

        return String.join(" ", parts);
    }

    private static String translateWord(String input) {
        System.out.println("  -> translateWord('" + input + "')");
String result = "";

if (input==null|| input.isEmpty()) return input;

int lastLetter=input.length()-1;
while(lastLetter>=0 && !Character.isLetter(input.charAt(lastLetter))){
  lastLetter--;
}
String word=input.substring(0,lastLetter+1);
String punctuation=input.substring(lastLetter+1);
if(word.isEmpty()) return input;
int fv=-1;
for (int i=0;i<word.length();i++){
  char c=Character.toLowerCase(word.charAt(i));
  if ("aeiou".indexOf(c)>=0|| (c=='y' && i!=0)){
    fv=i;
    break; 
  }
}
String raw;
if(fv==0){

  raw=word + "ay";

}else if (fv==-1){

raw=word+ "ay";
} else {

String core=word.substring(fv);
String moved= word.substring(0,fv).toLowerCase();
raw=core+moved+"ay";
}
 if(!word.isEmpty() && Character.isUpperCase(word.charAt(0))){
if(Character.isLowerCase(raw.charAt(0))) {
  
  raw= Character.toUpperCase(raw.charAt(0))+ raw.substring(1);
}
}
   return raw + punctuation;   
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