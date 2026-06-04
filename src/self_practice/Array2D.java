package self_practice;

public class Array2D {
    public static void main(String[] args){
        int[][] num = {
                {12,34,56,78},
                {34,45,23,78},
                {67,91,42,78},
                {12,23,56,98},
        };
        for(int i = 0;i<num.length;i++){
            for(int j= 0;j<num[i].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();

        }


    }

}
