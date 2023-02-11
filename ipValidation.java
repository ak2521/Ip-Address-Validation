import java.util.*;
class ipValidation {
    static boolean dcheck=false;
    static boolean zcheck=false;
    static boolean ncheck=true;
    static int ncount=0;
    void checkDot(String a)
    {
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='.')
            {
                count++;
                if(count==3)
                {
                    dcheck=true;
                }
                else
                {
                    dcheck=false;
                }
            }
        }
    }
    void zeroCheck(String a)
    {
        if(a.charAt(0)=='0')
        {
            zcheck=false;
        }
        else
        {
            zcheck=true;
        }
    }
    void numCheck(String a)
    {
        String num="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!='.')
            {
                num=num+a.charAt(i);
                int x=Integer.parseInt(num);
                if(x>=0 && x<256)
                {
                    ncheck=true;
                }
                else
                {   ncount++;
                    ncheck=false;
                    break;
                }
            }
            else
                {
                    
                    num="";
                    ncheck=false;
                }
                if(ncheck=false)
                {
                    break;
                }
        }
    }
    public static void main(String[] args) {
        while(true)
        {
        System.out.println("Enter Ip Address :");
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        HelloWorld hw =new HelloWorld();
        hw.checkDot(ip);
        hw.zeroCheck(ip);
        hw.numCheck(ip);
        if(dcheck && zcheck && ncount==0)
        {
            System.out.println("The Ip is : "+ip+" is Valid IP");
        }
        else
        {
          System.out.println("The Ip : "+ip+" is Not Valid IP");  
        }
        System.out.println(" 1-Continue 0- Exit");
        int ch=sc.nextInt();
        if(ch==0)
        {
            System.exit(0);
        }
        else
        {
            continue;
        }
        }
    }
}