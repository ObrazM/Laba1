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
        this.high = high > 0 ? high : 0;
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
