public class Binary {

    public Binary() {
    }
    
    
    public Long convertStrToInt(String str) {

        Long total = Double.valueOf(0.0).longValue();
        
        for (int i = 0; i < str.length(); i ++){
            if (str.charAt(i) == '1'){
                total += Double.valueOf(Math.pow(2, str.length() - i - 1)).longValue();
            }
        }

        return total;
    }

    public String convertIntToStr(Long num) {

        int highestPower = 0;

        while (Math.pow(2, highestPower) <= num){
            highestPower += 1;
        }

        highestPower -= 1;

        String str = "";

        for (int pow = 0; pow <= highestPower; pow ++){
            if (num >= Math.pow(2, highestPower - pow)){
                num -= Double.valueOf(Math.pow(2, highestPower - pow)).longValue();
                str += "1";
            }
            else{
                str += "0";
            }
        }

        return str;

    }

}
