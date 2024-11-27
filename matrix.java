public class matrix {
    private int rows;
    private int cols;
    private double[][] data;

    // Constructor
    public matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new double[rows][cols];
    }

    // Method to set the value at a specific position
    public void setValue(int row, int col, double value) {
        data[row][col] = value;
    }

    // Method to get the value at a specific position
    public double getValue(int row, int col) {
        return data[row][col];
    }

    // Method for addition
    public matrix add(matrix other) {
        matrix result = new matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setValue(i, j, this.getValue(i, j) + other.getValue(i, j));
            }
        }
        return result;
    }

    // Method for subtraction
    public matrix subtract(matrix other) {
        matrix result = new matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setValue(i, j, this.getValue(i, j) - other.getValue(i, j));
            }
        }
        return result;
    }

    // Method for scalar multiplication
    public matrix scalarMultiply(double scalar) {
        matrix result = new matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setValue(i, j, this.getValue(i, j) * scalar);
            }
        }
        return result;
    }

    // Method for matrix multiplication
    public matrix multiply(matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Matrix dimensions do not match for multiplication");
        }
        matrix result = new matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                double sum = 0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.getValue(i, k) * other.getValue(k, j);
                }
                result.setValue(i, j, sum);
            }
        }
        return result;
    }

    // Method for transpose
    public matrix transpose() {
        matrix result = new matrix(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setValue(j, i, this.getValue(i, j));
            }
        }
        return result;
    }

    // Method to display the matrix
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
