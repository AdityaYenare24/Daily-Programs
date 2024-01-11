import java.util.Scanner;
class Control_Statement{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        n=sc.nextInt();
        switch(n)
        {
            case 1:
            int num;
            System.out.println("Enter the number:");
            num=sc.nextInt();
            if(num%2==0){
                System.out.println("Number is Even:");
            }
            else{
                System.out.println("Number is Odd");
            }
            break;

            case 2:
            int total_marks;
            int english;
            int marathi;
            int hindi;
            int math;
            int science;
            System.out.println("Enter the Marks of English=");
            english=sc.nextInt();
            System.out.println("Enter the Marks of Marathi=");
            marathi=sc.nextInt();
            System.out.println("Enter the Marks of Hindi=");
            hindi=sc.nextInt();
            System.out.println("Enter the Marks of Math=");
            math=sc.nextInt();
            System.out.println("Enter the Marks of Science=");
            science=sc.nextInt();
            int total_obtain_marks=english+marathi+hindi+math+science;
            System.out.println("Total Obtain Marks="+total_obtain_marks);
            int per=(total_obtain_marks*100)/500;

            if(per>=80){
                System.out.println("A+ Grade");
            }
            else if(per>=60){
                System.out.println("First Class");
            }
            else if(per>=35){
                System.out.println("Pass");
            }
            else{
                System.out.println("Fail");
            }
            break;

            case 3:
            int a;
            System.out.println("Enter a number:");
            a=sc.nextInt();
            if(a%5==0){
                int cube=a*a*a;
                System.out.println("Cube of the number is="+cube);
             }
             else{
                System.out.println("Number is not divisible by 5");
             }
            break;

            case 4:
            int n1,n2,n3;
            System.out.println("Enter first number:");
            n1=sc.nextInt();
            System.out.println("Enter Second number:");
            n2=sc.nextInt();
            System.out.println("Enter third number:");
            n3=sc.nextInt();
            if(n1>n2 && n1>n3){
                System.out.println("Number 1 is greater");
            }
            else if(n2>n1 && n2>n3){
                System.out.println("Number 2 is greater ");
            }
            else{
                System.out.println("Number 3 is greater");
            }
            break;

            default:
            System.out.println("Invalid choice");
            break;
        }
    }
}