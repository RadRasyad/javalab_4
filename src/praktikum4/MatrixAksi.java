package praktikum4;

public class MatrixAksi {
    public static void main(String[] args) {
        double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };

        Matrix D = new Matrix(d);
        D.show();
        System.out.println();

        Matrix A = Matrix.random(3, 3);
        A.swap(1, 2);//template tugas
        System.out.println("   Matrix A Random");
        A.show();
        System.out.println();

        Matrix B = A.transpose();
        System.out.println("   Matrix B Transpose Matrix A");
        B.show();
        System.out.println();

        Matrix C = Matrix.identity(5);
        System.out.println("   Matrix C Matrix Identitas");
        C.show();
        System.out.println();

        System.out.println("   Matrix A + B");
        A.plus(B).show();
        System.out.println();

        System.out.println("   Matrix A x B");
        B.times(A).show();
        System.out.println();

        // shouldn't be equal since AB != BA in general
        System.out.println(A.times(B).eq(B.times(A)));
        System.out.println();

        //template tugas (5, 1)
        Matrix b = Matrix.random(3, 1);//dirubah karena N pd A itu 3
        b.show();
        System.out.println();

        Matrix x = A.solve(b);
        x.show();
        System.out.println();
        A.times(x).show();

    }
}
