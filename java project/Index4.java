public class Index4 {
    public static void main(String[] args){
        int [][] TwoDimension = new int [10][10];
        for (int i = 0; i<TwoDimension.length; i++){
            for (int j=0; j<TwoDimension.length; j++){
                TwoDimension[0][0] = 1;
                    TwoDimension[i][j] = TwoDimension[0][0] + 1;
                    System.out.print(TwoDimension[i][j]+"\t");
            }
            System.out.println();
        }
    }


}
