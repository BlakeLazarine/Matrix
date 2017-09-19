package Matrix;
//This is a test
import static Matrix.Operations.*;
public class Run {

    public static void main(String[]args) {
        Matrix m = new Matrix(3,2);
       // m.defineMatrix();
        //m.displayMatrix();
        int a[] = {1,1,1,1};
        int d[] = addVectors(a,a);
        for (int i = 0; i <d.length; i++){
            System.out.println(d[i]);
        }
    }

}
