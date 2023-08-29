class Compound 
{  
  public static void main(String[] args)  
  {   
      int p = 1300, r = 12, t = 2,n=1,si,ci;
      si = (p*r*t)/100;
      System.out.println("Simple Interest is: " +si);
      ci=p*(1+r/n)^n*t;
      System.out.println("Compound Interest is:" +ci);
  }
}  
