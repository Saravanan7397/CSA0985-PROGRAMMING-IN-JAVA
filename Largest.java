class largest
{
    public static void main(String[] args)
    {
        int num1=2,num2=4,num3=7;
        if(num1>num2 && num1>num3)
            System.out.println(num1+ "-Largest number");
        else if(num2>num1 && num2>num3)
            System.out.println(num2+ "-Largest number");
        else
            System.out.println(num3+ "-Largest number");
    }
}
