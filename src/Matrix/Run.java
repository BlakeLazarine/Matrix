package Matrix;
//This is a test
import static Matrix.Operations.*;
public class Run {

    public static void main(String[]args) {
       // Matrix m = new Matrix(3,2);
        //m.defineMatrix();
        //m.displayMatrix();
        int[][] a = {{1,2},{3,4},{5,6}};
        Matrix n = new Matrix(3,2,a);
        n.displayMatrix();
        Matrix t = Transpose(n);
      	t.displayMatrix();
    }

}
