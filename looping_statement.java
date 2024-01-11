import java.util.Scanner;
class looping_statement{
    public static void main(String[] args) {
        int choice,ch1,total=0;
        char ans;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to My Hotel");
        do{
            System.out.println("1:Starters\n2:Main Course\n3:Deserts\n4:Drink");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Starters:");
                System.out.println("1:item1   40Rs:");
                System.out.println("2:item2   50Rs:");
                System.out.println("3:item3   70Rs:");
                System.out.println("4:item4   20Rs:");
                ch1=sc.nextInt();
                switch(ch1){
                    case 1:
                    total=total+40;
                    System.out.println("item1="+total);
                    break;

                    case 2:
                    total=total+50;
                    System.out.println("item2="+total);
                    break;

                    case 3:
                    total=total+70;
                    System.out.println("item3="+total);
                    break;

                    case 4:
                    total=total+20;
                    System.out.println("item4="+total);
                    break;

                    default:
                    System.out.println("Invalid Choice");
                    break;

                }
                break;
            
                case 2:
                System.out.println("Main Course:");
                System.out.println("1:item1   10Rs:");
                System.out.println("2:item2   60Rs:");
                System.out.println("3:item3   30Rs:");
                System.out.println("4:item4   90Rs:");
                ch1=sc.nextInt();
                switch(ch1){
                    case 1:
                    total=total+10;
                    System.out.println("item1="+total);
                    break;

                    case 2:
                    total=total+60;
                    System.out.println("item2="+total);
                    break;

                    case 3:
                    total=total+30;
                    System.out.println("item3="+total);
                    break;

                    case 4:
                    total=total+90;
                    System.out.println("item4="+total);
                    break;

                    default:
                    System.out.println("Invalid Choice");
                    break;

                }
                break;

                case 3:
                System.out.println("Deserts:");
                System.out.println("1:item1   140Rs:");
                System.out.println("2:item2   100Rs:");
                System.out.println("3:item3   150Rs:");
                System.out.println("4:item4   200Rs:");
                ch1=sc.nextInt();
                switch(ch1){
                    case 1:
                    total=total+140;
                    System.out.println("item1="+total);
                    break;

                    case 2:
                    total=total+100;
                    System.out.println("item2="+total);
                    break;

                    case 3:
                    total=total+150;
                    System.out.println("item3="+total);
                    break;

                    case 4:
                    total=total+200;
                    System.out.println("item4="+total);
                    break;

                    default:
                    System.out.println("Invalid Choice");
                    break;

                }
                break;

                case 4:
                System.out.println("Drink:");
                System.out.println("1:item1   400Rs:");
                System.out.println("2:item2   500Rs:");
                System.out.println("3:item3   700Rs:");
                System.out.println("4:item4   200Rs:");
                ch1=sc.nextInt();
                switch(ch1){
                    case 1:
                    total=total+400;
                    System.out.println("item1"+total);
                    break;

                    case 2:
                    total=total+500;
                    System.out.println("item2"+total);
                    break;

                    case 3:
                    total=total+700;
                    System.out.println("item3"+total);
                    break;

                    case 4:
                    total=total+200;
                    System.out.println("item4"+total);
                    break;

                    default:
                    System.out.println("Invalid Choice");
                    break;

                }
                break;

                default:
                System.out.println("Invalid Choice:");
                break;
            }
            System.out.println("Do you want add any other item Y/N");
            ans=sc.next().charAt(0);

        }
        while(ans=='Y'||ans=='y');
        System.out.println("Thanks for coming\nVisit again");
        System.out.println("Bill:"+total);


    }
    
}