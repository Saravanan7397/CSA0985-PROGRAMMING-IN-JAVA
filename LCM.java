class gcd
{
    public static void main(String[] args)
    {
        int num1=12,num2=8,i,max,lcm=0;
        max = (num1 > num2) ? num1 : num2;
        for(i=max;i<=num1*num2;i++)
        {
            if(num1%i==0 && num2==0);
            lcm=i;
        }
        System.out.println("LCM:"+lcm);
    }
}
