 class Account
{
    int accNo;
    double bal;
    public void getCurrentBal()
    {
        System.out.println("current balance is:"+bal+"rs");
    }
    public void withDraw(int amt)
 
    {
        if(bal<amt)
    {
        System.out.println("you have less amount");
        return;
    }
    bal-=amt;
    System.out.println("transcation succesful");
}
}

class Atm
{
    public static void main(String args[])
    {
        Account a1=new Account();
        a1.accNo=1001;
        a1.bal=2000;
        java.util.Scanner scn=new java.util.Scanner(System.in);
        int isContinue=0;
        do
        {
            System.out.println("1 -view current balance");
            System.out.println("2 -withdraw");
            System.out.println("type your option");
            int option=scn.nextInt();
            switch(option)
            {
                case 2:
                    System.out.println("enter amount");
                    int amt=scn.nextInt();
                    a1.withDraw(amt);
                    
                case 1:
                    a1.getCurrentBal();
                    break;
                default:
                    System.out.println("invalid input please try again");
            }
            System.out.println("1-continue; 0-stop");
            isContinue=scn.nextInt();
        }
            while(isContinue==1);
            System.out.println("thank you...");
        }
    }
              
