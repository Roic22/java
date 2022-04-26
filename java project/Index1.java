import javax.swing.*;

public class Index1 {
    //AUFGABE 1 TEIL A
    public static void main(String[] args){
        double pi = 3.148;
       String radius = JOptionPane.showInputDialog("Geben Sie den Radius der Pizza an");
        String höhe = JOptionPane.showInputDialog("please do enter the height of your pizza");
        int a = Integer.parseInt(radius);
        float z = Float.parseFloat(höhe);
        double Volumen = pi *z*z*a;
        System.out.println("Wilkommen beim Pizza Programm.");
        System.out.println("Geben Sie den Radius der Pizza an: " +  a);
        System.out.println("Geben Sie die Höhe Pizza an: " + z);
        System.out.println("dyie Pizza hat ein gerundetes Volumen von V=  " + Volumen + "Kubikzentimeter" );
        System.out.println();

        //AUFGABE 1 TEIL B;
        if(Volumen < 800){
            System.out.println("es handelt sich um eine kleine Pizza");
        }
        else if(Volumen >= 800){
            System.out.println("es handelt sich um eine mittlere Pizza");
        }
        else{
            System.out.println("es handelt sich um eine große Pizza");
        }


    }
}
