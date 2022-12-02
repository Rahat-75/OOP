public class TwoDArray {
    public static void main(String[] args) {
        int [][]flats=new int[2][3];
        flats[0][0]=1;
        flats[0][1]=2;
        flats[0][2]=3;
        flats[1][0]=4;
        flats[1][1]=5;
        flats[1][2]=6;
        System.out.println(flats.length);
        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
