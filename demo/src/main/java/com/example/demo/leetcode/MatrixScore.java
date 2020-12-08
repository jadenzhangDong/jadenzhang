package com.example.demo.leetcode;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class MatrixScore {

    public int matrixScore(int[][] A) {

        //先横向判断，判断1是否为第一个位置，
        for (int i = 0; i < A.length; i++) {
            if(A[i][0]!=1){
                reverse(A, 0, i);
            }
        }
        int sum = 0;
        int current = 0;
        //再纵向判断1的个数是否最多，不是则翻转
        for (int i = 1; i < A[0].length; i++) {
            sum = 0;
            for (int j = 0; j < A.length; j++){
                //为1则sum+1，为0则sum-1
                if(A[j][i]==0){
                    current = -1;
                }else{
                    current = 1;
                }
                sum = sum + current;
            }
            if(sum<0){
                reverse(A, 1, i);
            }
        }

        //计算翻转完成后的数组
        int returnNum = 0;
        StringBuffer currentString;
        for (int i = 0; i < A.length; i++) {
            currentString = new StringBuffer();
            for (int j = 0; j < A[i].length; j++) {
                currentString.append(A[i][j]);
            }
            returnNum += Integer.valueOf(currentString.toString(), 2);
        }
        return returnNum;
        }

        /**
         * solution 行 0， 列 1  / location 位置，第几行第几列
         * @param solution
         * @param location
         */
        private void reverse(int[][] A, int solution, int location){
            if(solution==0){
                for (int i = 0; i < A[location].length; i++) {
                    A[location][i] = (A[location][i]^=1);
                }
                return;
            }

            for (int i = 0; i < A.length; i++) {
                A[i][location] = (A[i][location]^=1);
            }
        }
        @Test
        public void test(){
            int[][] A = {{1,1,0,0},{1,0,1,0},{0,0,1,1}};
            System.out.println(matrixScore(A));
        }


}
