public class APLine
{
private int a;
private int b;
private int c;
  public APLine(int ax, int bx, int cx)
  {
   a = ax;
   b = bx;
   c = cx;
  }
  public double getSlope()
  {
    return -(double)a / b;
  }
  public boolean isOnLine(int x, int y)
  {
    
    if (a*x + b*x + c == 0)
      return true;
        else 
        return false;
  
  
}
}
