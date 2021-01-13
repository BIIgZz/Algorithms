/**
 * @program: algorithm
 * @description:
 * @author: zzh
 * @create: 2020-09-12 22:19
 **/
public class 对称矩阵的乘法 {


    public static int[][] mult1(int a[],int b[],int n){
        int c[][] = new int[n][n];
        int sum=0;
        int t1=0,t2=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                sum=0;
                for (int k = 0; k < n; k++) {
                    if (i>=k)
                        t1 = (i*(i+1)/2+k);
                    else
                        t1 = (k*(k+1)/2+i);
                    if (k>=j)
                        t2 = (k*(k+1)/2+j);
                    else
                        t2 = (j*(j+1)/2+k);
                    sum += a[t1]*b[t2];
                }
                c[i][j] = sum;
            }
        }
        return c;
    }

    public static int[][] mult2(int a[],int b[],int n){
        int sum = 0;
        int c[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += returnElem(a,i,k)*returnElem(b,k,j);
                }X
                c[i][j] = sum;
            }
        }
        return c;
    }
    public static int returnElem(int a[],int i,int j){
        if (i>=j)
            return a[i*(i+1)/2+j];
        else
            return a[j*(j+1)/2+i];
    }

    public static void main(String[] args) {
        int a[] = {1,2,1,1,3,1};
        int b[] = {1,2,1,1,3,1};
        int n=3;
        int c[][] = mult2(a,b,n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
