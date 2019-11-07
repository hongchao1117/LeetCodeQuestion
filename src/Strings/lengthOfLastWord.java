package Strings;

public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s==null || s.length()==0)    return 0;
        String[] strings = s.split(" ");

        if (strings.length==0)
            return 0;
        else
          return  strings[strings.length-1].length();



    }
}
