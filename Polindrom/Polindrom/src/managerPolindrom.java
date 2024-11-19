public class managerPolindrom {
    public boolean isPolindrom(String test){
        for(int i = 0; i < test.length()/2; i++){
            if(test.charAt(i) != test.charAt(test.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
