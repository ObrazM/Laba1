package ObrazM.Classes;

public class Right_Triangle {
    int length;

    public Right_Triangle() {
    }

    public Right_Triangle(int length) {  // функция, проверяет на неотрицательность
        this.setLength(length);
    }
    public void setLength(int length) {
        this.length = length > 0 ? length : 0;
    }

    public int getLength(int length) {
        return this.length;
    }

    public int GetPerimetr ()
    {
        return 3*length;
    }
    public double GetSquare ()
    { return 0.5 * Math.pow(length,2) * Math.sin(Math.PI/3); }
    /*public double AverageSquare (){
        return GetSquare()/2;
    }*/

    @Override
    public String toString() {
        return "Right_Triangle:" +
                " length=" + length +
                " Perimetr = " + GetPerimetr() +
                " Square = " + GetSquare();
    }
}