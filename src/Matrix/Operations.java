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
}
