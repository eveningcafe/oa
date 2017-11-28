package org.apache.commons.math3.linear;

public class demo {
	public static void main(String[] args) {
		double arr[][] = { { 2, -1, -1, 0, 0, 0, 0, 0, 0 }, 
							{ -1, 3, -1, 0, 0, 0, 0, -1, 0 },
							{ -1, -1, 3, -1, 0, 0, 0, 0, 0 },
							{ 0, 0, -1, 3, -1, -1, 0, 0, 0},
							{ 0, 0, 0, -1, 3, -1, -1, 0, 0},
							{ 0, 0, 0, -1, -1, 2, 0, 0, 0 },
							{ 0, 0, 0, 0, -1, 0, 3, -1, -1 },
							{ 0, -1, 0, 0, 0, 0,- 1, 3, -1 },
							{ 0, 0, 0, 0, 0, 0, -1, -1, 2 },
							};
		RealMatrix matrix = MatrixUtils.createRealMatrix(9, 9);
		for (int i = 0; i < matrix.getRowDimension(); i++) {
			
			matrix.setRow(i, arr[i]);
			
		}
		EigenDecomposition eig = new EigenDecomposition(matrix);
		for (int i = 8; i >= 0; i--) {
			System.out.println(eig.getRealEigenvalue(i));
			System.out.println("vector of this Eigenvalue:"+eig.getEigenvector(i));
		}
		
	}

}