public class Index2 {

  public static void main(String[] args) {
     /* String value = JOptionPane.showInputDialog("give in the first value");
      int g = Integer.parseInt(value);
      */
      int g = 0;
      while(g < 20){
          g++;
          int pg = g * (g + 1) / 2;
          System.out.println("g= " +g + " und p_g= " +pg);

      }
      //DAS PROGRAMM KÖNNTE MAN AUCH MIT FOR-SCHLEIFE SCHREIBEN UND SO
       /*
        for(int g = 0; g<20; g++{
            int pg = g * (g + 1) / 2;
          System.out.println("g= " +g + " und p_g= " +pg);
            }
         */

    }

}
