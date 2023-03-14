public class mazepath {
    public static void main(String[] args) {
        int sr = 0;
        int sc = 0;
        int er = 2;
        int ec = 2;
        int nop = mazepath01(sr,sc,er,ec,"");
        System.out.println("number of paths to reach from ["+sr+","+sc+"] to ["+er+","+ec+"] is "+nop);
    }

    private static int  mazepath01(int sr, int sc, int er, int ec, String psf) {
        if(sr==er && sc==ec){
            System.out.println(psf);
            return 1;
        } 

        int count = 0;
        if(sr+1<=er) count += mazepath01(sr+1, sc, er, ec, "V"+psf) ;
        if(sc+1<=ec) count += mazepath01(sr, sc+1, er, ec, "H"+psf) ;
        
        return count;

    }
}
