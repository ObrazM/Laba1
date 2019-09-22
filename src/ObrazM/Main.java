package ObrazM;

import ObrazM.Classes.Prizmas;
import ObrazM.Classes.Right_Prizma;
import ObrazM.Classes.Right_Triangle;
import ObrazM.Classes.Triangles;

public class Main {
    public static void main(String[] args) {
        Triangles triangles = new Triangles();
        triangles.add(new Right_Triangle(3));
        triangles.add(new Right_Triangle(4));
        triangles.add(new Right_Triangle(5));
        for (int i = 0; i < triangles.getTriangles().length; i++){
            System.out.println(triangles.getTriangles()[i]);}
        System.out.println("Triangles with square < average:");
        for (int i = 0; i < triangles.getTriangles().length; i++)
            if (triangles.getTriangles()[i].GetSquare() < triangles.getAverage()){
                System.out.println(triangles.getTriangles()[i]);}

        Prizmas prizmas = new Prizmas();
        prizmas.add(new Right_Prizma(3,4));
        prizmas.add(new Right_Prizma(4,5));
        prizmas.add(new Right_Prizma(5,6));
        System.out.println("\n Prizma with max volume: "+ prizmas.maxVol());
    }
}