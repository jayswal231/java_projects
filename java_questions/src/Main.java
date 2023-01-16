import java.util.*;

public class Main {
    // swap teo values
    public static void swap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int num1= sc.nextInt();
        int num2 = sc.nextInt();

        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("The swapped number are :"+num1 +" "+"and"+" "+ num2);
    }


    // check leap year
    public  static void leapyr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int yr = sc.nextInt();

        if((yr % 400 == 0) || ((yr % 4 == 0) && (yr % 100 != 0))){
            System.out.println("This is leap year");
        }
        else {
            System.out.println("This is not leap year");
        }
    }



    //to check armstrong number
    public static void armstrong(){
        int num = 153;
        int remainder,result=0;
        int nuumber=num;

        while (nuumber !=0){
            remainder = nuumber % 10;
            result += Math.pow(remainder,3);
            nuumber /= 10;

        }
        if(num==result){
            System.out.println(num+" "+" is Armstrong  number");
        }
        else {
            System.out.println(num+" "+"is not armstrong number");
        }
    }



    // find factorial of number
    public static int factorial(int n){
        if(n==0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }



    // check prime number
    public  static void prime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        boolean flag = false;

        for(int i=2; i <=num/2 ; i++){
            if(num % i==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println(num + " "+ "is prime number.");
        }
        else {
            System.out.println(num+ " "+ "is not prime number.");
        }
    }



    //calculate fibonanci series
    public static void fibonancy(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int num= sc.nextInt();

        int  firstNum=0, secondNum=1;
        for(int i=1; i<=num; i++){
            System.out.print(firstNum + " , ");
            int nextNum= firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;
        }
    }



    // print pyramid pattern
    public static void pyramid(){
        int num =5;
        for(int i=1; i<=num; ++i){
            for(int j=1; j<i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }



    // add two matrix
    public static void matrix(){
        int rows=2, columns=3;
        int[][] firstMatrix={{2,3,4},{5,2,3}};
        int[][] secondMatrix = {{3,4,5},{5,6,7}};
        int [][] sum= new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                sum[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
            }
        }
        System.out.println("Sum of two matrix :");
        for(int[] row:sum){
            for(int column: row){
                System.out.print(column+ "   ");
            }
            System.out.println();
        }
    }



    // check vowels later
    public static void vowel(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> letter = new ArrayList<>();
        while (true){
            int count=0;
            System.out.println("Enter strings :");
            String input = sc.nextLine();
            for (int i=0; i<input.length(); i++){
                char str = input.charAt(i);
                if (str=='a' || str=='e' || str=='i' || str=='o' || str=='u') {
                    count += 1;
                    String data = Character.toString(str);
                    letter.add(data);

                }
            }
            System.out.println("Total vowel in string is :"+count);
            System.out.println("The used vowel letters are :"+letter);

            System.out.println("Do you want enter  string again ? (y/n) ");
            String reinput = sc.nextLine();
            if (!reinput.equals("y")){
                break;
            }
        }
    }
    public static void main(String[] args)
    {
        //swap();

      //  leapyr();

       // armstrong();

        //System.out.println(factorial(5));

        //prime();

       // fibonancy();

       // pyramid();

       // matrix();

        vowel();
    }
}