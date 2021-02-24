package Array;

public class setZeroes {
    public void setZeroes(int[][] matrix) {
        int lenX = matrix.length,lenY = matrix[0].length;
        boolean[] rows = new boolean[lenX],cols = new boolean[lenY];
        for (int i = 0; i < lenX; i++) {
            for (int j = 0; j < lenY; j++) {
                if (matrix[i][j]==0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < lenX; i++) {
            for (int j = 0; j < lenY; j++) {
                if (rows[i]||cols[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
