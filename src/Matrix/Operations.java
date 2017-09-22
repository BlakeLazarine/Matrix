package Matrix;

public class Operations {
    public static int dotProduct(int vec1[], int vec2[]) {
        int sum = 0;
        if (vec1.length != vec2.length){
            System.out.println("Vectors not of same dimension! Returning 0");
        } else {

            for(int i = 0; i < vec1.length; i++) {
                sum += vec1[i] * vec2[i];
            }
        }
        return sum;
    }

    public static int[] addVectors(int vec1[], int vec2[]){
        if (vec1.length != vec2.length) {
            System.out.println("Vectors not of same length! returning {0}");
            return new int[]{0};
        } else {
            int result[] = new int[vec1.length];
            for(int i = 0; i< vec1.length; i++){
                result[i] = vec1[i] + vec2[i];
            }
            return result;
        }

    }
    
    public static Matrix Transpose(Matrix m)
    {
    	Matrix t = new Matrix(m.c, m.r);
    	
    	for (int i = 0; i < t.r; i++) {
        	for (int j = 0; j < t.c; j++) {
        		t.values[i][j] = m.values[j][i];
        		
        	}	
    	}
    	t.isDefined=true;
    	return t;
    }
    
	public Matrix multiplyMatrices(Matrix m1, Matrix m2)
	{
		if (m1.c != m2.r)
		{
			
		}
		return new Matrix(2,2);
	}
    
}
