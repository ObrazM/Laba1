package ObrazM.Classes;
import java.util.Arrays;

public class Prizmas {
    private Right_Prizma[] prizmas;
    public Prizmas() { prizmas = new Right_Prizma[0]; }
    public Right_Prizma[] getPrizmas(){ return prizmas;}
    public void add(Right_Prizma prizma)
    {
        int n = 0;
        for (Right_Prizma pr : prizmas)
            if (pr == null)
                break;
            else
                n++;
        if (prizmas.length == n){
            Right_Prizma[] tempPrizmas = Arrays.copyOf(prizmas, n+1);
            prizmas = tempPrizmas;
            prizmas[n] = prizma;}
    }
    public Right_Prizma maxVol(){
        double maxVol=0;
        int i=0;
        for (i=0; i<prizmas.length-2; i++){
            if (prizmas[i].GetVolume() < prizmas[i+1].GetVolume()){
                maxVol = prizmas[i+1].GetVolume();
                if (i==prizmas.length){
                    System.out.println("Prizma with max Volume: "+ prizmas[i+1]);}
            }
        }
        return prizmas[i+1];
    }
}
