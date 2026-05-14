import java.util.*;
class Demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bal=45000,dep,with,ch;
        try{
        do{
            System.out.println("Enter one of the given options");
            System.out.println("1.Withdrawal");
            System.out.println("2.Deposit");
            System.out.println("3.Display Balance");
            System.out.println("enter your choice:");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter amount to withdraw:");
                    with = sc.nextInt();
                    if(with>bal)
                        System.out.println("Insufficient Balance");
                    else{
                        bal=bal-with;
                        System.out.println("Amount after Withdrawal: "+bal);
                    }
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    dep=sc.nextInt();
                    bal+=dep;
                    System.out.println("Balance after deposit: "+bal);
                    break;
                case 3:
                    System.out.println("Your balance: "+bal);
                    break;
                default:
                    System.out.println("Enter invalid choice");
                    break;
            }
        }while(ch!=4);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
