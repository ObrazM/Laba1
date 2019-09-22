package ObrazM.Classes;
import java.util.Arrays;

public class Triangles {

    private Right_Triangle[] triangles;
    public Triangles() { triangles = new Right_Triangle[0]; }
    public Right_Triangle[] getTriangles(){ return triangles;}
    public void add(Right_Triangle triangle)
      {
       int n = 0;
       for (Right_Triangle tr : triangles)
            if (tr == null)
                break;
            else
               n++;
            if (triangles.length == n){
                Right_Triangle[] tempTriangles = Arrays.copyOf(triangles, n+1);
                triangles = tempTriangles;
                triangles[n] = triangle;}
   }
    public double getAverage() {
        double Sq = 0;
        for (int i = 0; i < triangles.length; i++) { //оптимизировать
            Sq += triangles[i].GetSquare();
        }
        return Sq / triangles.length;
    }
}