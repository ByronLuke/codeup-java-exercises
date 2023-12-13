public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World.");
        //1
        int myFavoriteNumber = 28;
        System.out.println(myFavoriteNumber);

        //2
        String myString = "Byron";
        System.out.println(myString);
        //3
        // myString = 'b'; I notice an error because its defined as a string
        //4
        // myString = 3.14159; I notice an error here too. Same here
        //5
        //long myNumber;
        //System.out.println(myNumber); Variable is not initialised
        //6
        //myNumber = 3.14; // I notice another error
        //7
        //myNumber = 123L;
        //8
        //myNumber = 123;
        //3.14 does not work for longs because they only compile integers not decimals
        //9 cast it or change the declaration
        //float myNumber = 3.14F;
        //10
        //int x = 5;
        //System.out.println(x++);
        //System.out.println(x);
        //int x = 5;
        //System.out.println(++x);
        //System.out.println(x);
        //we are reading the value first then increasing
        //we are increasing value and then reading it
        // System.out.println(x);
        //11
        // int class = 5; we cant use word class
        //12
        //String theNumberThree = "three";
        //Object o = theNumberThree;
        //int three = (int) o;
        //get back ClassCastException
        //int three = (int) "three";
        //object could be anything but we are passing a literal
        //13
        //int x = 4;
        //x = x + 5;
        //x+=5;
        //int x = 3;
        //int y = 4;
        //y = y * x;
        //y*=x;
        //int x = 10;
        //int y = 2;
        //x = x / y;
        //y = y - x;
        //14
        int maxInt = Integer.MAX_VALUE;
        maxInt = maxInt + 1;
        System.out.println(maxInt);
        //results in numeric overflow
    }
}
