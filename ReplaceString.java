public class ReplaceString {
    public static String replaceString(String s,char a,char b){
        if(s.length()==0){
            return s;
        }
        String smalloutput = replaceString(s.substring(1),a,b);
        if(s.charAt(0)==a){
            return b+smalloutput;
        }else{
            return s.charAt(0)+smalloutput;
        }
    }

    public static void main(String[] args) {
        System.out.println(replaceString("abcxdexfrxvcx",'x','y'));
    }

}
