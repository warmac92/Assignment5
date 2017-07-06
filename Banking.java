
interface ROI
{
    void getRateOfInterest();
}

class ICICI implements ROI
{
   public void getRateOfInterest()
    {
      System.out.println("ROI of ICICI Bank is 2.4"); 
    } 
}

class AXIS implements ROI
{
    public void getRateOfInterest()
    {
        System.out.println("ROI of AXIS Bank is 4.5");
    }
}


public class Banking {


    public static void main(String[] args) {
        AXIS obj = new AXIS();
        obj.getRateOfInterest();
        ICICI obj1 = new ICICI();
        obj1.getRateOfInterest();
        
    }
    