import java.util.*;
class Practical {

	public static void main(String[] args) {
		int choice,num;
		System.out.println("1:Prime or not \n2:Sum of Digit \n3:Fibonacci Series \n4:Amstrong or not \n5:Greatest Number \n6:Display the month \n7: Perform Calculator");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the number:");
		    num=sc.nextInt();
			boolean flag=true;
			for(int i=2;i<=num;i++) {
				if(num%i==0){
                    flag=true;
                    break;
                }
			}
            if(!flag)
                System.out.println("Number is Prime");
            
            else
                System.out.println("Number is not Prime");
            
        break;

	    case 2:
            int sum=0;
			System.out.println("Enter the number:");
		    num=sc.nextInt();
            while(num!=0){
                sum=sum+num%10;
                num=num/10;
            }
            System.out.println("The sum of digit is:"+sum);
        break;

		case 3:
            int n1=0,n2=1,n3,j,count=10;
            System.out.println(n1+""+n2);
            for(j=2;j<count;j++){
                n3=n1+n2;
                System.out.println(""+n3);
                n1=n2;
                n2=n3;
            }
        break;

        case 4:
            int number,temp,total=0;
            System.out.println("Enter the number:");
            num=sc.nextInt();
            number=num;
            while(number!=0){
                temp=number%10;
                total=total+temp*temp*temp;
                number /=10;
            }
            if(total==num){
                System.out.println(num+"is armstrong number");
            }
            else{
                System.out.println(num+"is not armstrong number");
            }
        break;

        case 5:
            int num1,num2,num3,num4,num5;
            System.out.println("Enter Five Number:");
            num1=sc.nextInt();
            num2=sc.nextInt();
            num3=sc.nextInt();
            num4=sc.nextInt();
            num5=sc.nextInt();
            if(num1>num2&&num1>num3&&num1>num4&&num1>num5){
                System.out.println("Number 1 is Greater");
            }
            else if(num2>num1&&num2>num3&&num2>num4&&num2>num5){
                System.out.println("Number 2 is Greater");
            }
            else if(num3>num1&&num3>num2&&num3>num4&&num3>num5){
                System.out.println("Number 3 is Greater");
            }
            else if(num4>num1&&num4>num2&&num4>num3&&num4>num5){
                System.out.println("Number 4 is Greater");
            }
            else if(num5>num1&&num5>num2&&num5>num3&&num5>num4){
                System.out.println("Number 5 is Greater");
            }
        break;

        case 6:
            int n;
            Scanner mn=new Scanner(System.in);
            System.out.println("Enter the number of Month:");
            n=mn.nextInt();
            switch(n)
            {
                case 1:
                System.out.println("January");
                break;

                case 2:
                System.out.println("February");
                break;
        
                case 3:
                System.out.println("March");
                break;

                case 4:
                System.out.println("April");
                break;

                case 5:
                System.out.println("May");
                break;

                case 6:
                System.out.println("June");
                break;

                case 7:
                System.out.println("July");
                break;

                case 8:
                System.out.println("August");
                break;

                case 9:
                System.out.println("September");
                break;

                case 10:
                System.out.println("Octomber");
                break;

                case 11:
                System.out.println("November");
                break;

                case 12:
                System.out.println("December");
                break;

                default:
                System.out.println("Invalid choice");
                break;
            }
        break;

        case 7:
        int ch,number1,number2;
        Scanner cal=new Scanner(System.in);
        System.out.println("1:Addition \n2:Substraction \n3:Multiplication \n4:Division \n5:Modulas");
        System.out.println("Enter your choice:");
        ch=cal.nextInt();
        System.out.println("Enter First number:");
        number1=cal.nextInt();
        System.out.println("Enter Second number:");
        number2=cal.nextInt();
        switch(ch){
            case 1:
            int add=number1+number2;
            System.out.println("Addition is:"+add);
            break;

            case 2:
            int sub=number1-number2;
            System.out.println("Substraction is:"+sub);
            break;

            case 3:
            int mult=number1*number2;
            System.out.println("Multiplication is:"+mult);
            break;

            case 4:
            int div=number1/number2;
            System.out.println("Division is:"+div);
            break;

            case 5:
            int mod=number1%number2;
            System.out.println("Modulas is:"+mod);
            break;

            default:
            System.out.println("Invalid choice");
            break;

        }
        break;

		}
        
        
            }
        
        }
