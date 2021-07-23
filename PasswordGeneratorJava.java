public class PasswordGeneratorJava {
    public static void main(String args[]){
        String s = "Praveen"; // Add your unique name.
        int i = 0;
        String s1 = "";
        System.out.print(powerSet(s,i,s1));
    }
    public static String powerSet(String s,int i,String s1){
        if(i == s.length()){
            System.out.print(s1);
            return s1;
        }
        powerSet(s,i+1,s1+s.charAt(i));
        return powerSet(s,i+1,s1);
    }
}
