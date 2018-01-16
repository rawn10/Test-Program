class Program
{
  public static void main(String args[])
  {
    int a,b,add,sub,mul,div;
    a=Integer.parseInt(args[0]);
    b=Integer.parseInt(args[1]);
    add=a+b;
    sub=a-b;
    mul=a*b;
    div=a/b;
    System.out.println("Addition= "+add);
    System.out.println("Subtraction= "+sub);
    System.out.println("Multiplication= "+mul);
    System.out.println("Division= "+div);
  }
}