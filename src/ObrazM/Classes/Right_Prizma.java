package ObrazM.Classes;

public class Right_Prizma extends Right_Triangle {
    int high;

    public Right_Prizma() {
    }

    public Right_Prizma(int length, int high) {
        super(length);
        this.setHigh(high);
    }
  public void setHigh(int high) {
        if (high > 0){ this.high=high;}
        else{
            System.out.println("Error, set high > 0");
            this.high = 0;
        }
    }
    public void setLength(int length) {
        if (length > 0){ this.length=length;}
        else{
            System.out.println("Error, set length > 0");
            this.length = 0;
        }
    }

    public int getHigh() {
        return high;
    }

    @Override
    public double GetSquare() {
        return super.GetSquare();
    }

    public double GetVolume(){
        return GetSquare() * high;
    }

    @Override
    public String toString() {
        return " Right Prizma" + " high=" + high + " Volume:"+ GetVolume();
    }
}
