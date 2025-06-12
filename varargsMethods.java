public class varargsMethods {
    public static void main(String[] args) {
        //varargs allow methods to accept a varying # of arguments, java will pack these args into an array
        System.out.println(add(1,2,3,4,5)); 
        System.out.println(average(5,5,5,5,5));
    }
    //... allows "infinite" args of the same type
    static int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    static double average(double... numbers) {
        double avg , sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        avg = sum / numbers.length;
        return avg;
    }
}