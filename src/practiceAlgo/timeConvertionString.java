package practiceAlgo;

public class timeConvertionString {
    public static void main(String[] args) {
        String s = "12:45:05PM";
        System.out.println(timeConversion(s));

    }
    public static String timeConversion(String s){
        char[] ch = s.toCharArray();
        String res = "";
        String check = s.substring(8,10);
        if(check.equals("PM")){
            int temp = Integer.parseInt(s.substring(0, 2));
            if(temp != 12){
                res = Integer.toString(12 + temp);
                for(int i =0; i < res.length(); i++){
                    ch[i] = res.charAt(i);
                }
            }
            res = String.valueOf(ch);
            res = res.substring(0, 8);

            return res;
        }
        else{
            int temp = Integer.parseInt(s.substring(0,2));
            if(temp == 12){
                res = "00";
                for(int i = 0; i < res.length(); i++){
                    ch[i] = res.charAt(i);
                }
            }
            res = String.valueOf(ch);
            res = res.substring(0,8);
            return res;
        }
    }
}
