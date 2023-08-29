class Compound 
{  
  public static void main(String[] args)
  {
      int num1=1,num2=3,result=0;
      char operator='*';
      switch(operator)
      {
          case'+':
              result=num1+num2;
              break;
          case'-':
              result=num1-num2;
              break;
          case'*':
              result=num1*num2;
              break;
          case'/':
              result=num1/num2;
              break;
              default:
              System.out.println("Error:Invalid operator");
      }
      System.out.println("Result:"+result);
  }
} 
