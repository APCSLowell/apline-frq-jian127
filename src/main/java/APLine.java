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
  public double GetSlope()
  {
    return (double)-a/b;
  }
  public boolean isOnLine(x,y)
  {
    
    if (a*x + b*x + c == 0)
      return true;
        else 
        return false;
  
  
}
