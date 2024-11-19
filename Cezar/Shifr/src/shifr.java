public class shifr {
    private static final String abc = "abcdefghijklmnopqrstuvwxyzabc";

    public String cezarConstr(String str){
        String res = "";
        for(int i = 1; i < str.length()+1; i++){
            if(abc.contains(str.substring(i-1, i))){
                int index = abc.indexOf(str.substring(i-1, i));
                res += abc.substring(index+2, index+3);
            }
        }
        return res;
    }



}
