public class mathAndPrintf {
    public static void main(String[] args) {
         /*
         * Math Class and functions
         */
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double power = Math.pow(2, 5);
        power = Math.abs(-power);
        power = Math.sqrt(power);
        power = Math.round(Math.PI);//rounds to the nearest whole int
        power = Math.ceil(Math.PI);//rounds up
        power = Math.floor(3.99);//rounds down
        power = Math.max(10,20); //finds the max/greater
        power = Math.min(10,20);//finds the min/lesser value


         //this uses a placeholder %f for a double/floating point number and uses %d for an int
        //using .# before the f in the %f sets the precision for that number
        //+ = outputs a plus
        //, = commma grouping separator
        // ( = negative number
        // space = display a minus if negative, space if positve
        //0 = zero padding
        // number = right justified padding
        // negative number = left justified padding
        int pos = 10, neg = -10;
        //%[flags][width][.percision][specifier-character]
        System.out.printf("Positive equals %+d\n", pos);
        System.out.printf("Negative equals % d", neg);
    }
    
}
