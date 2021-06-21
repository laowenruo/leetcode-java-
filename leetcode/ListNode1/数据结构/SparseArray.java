package leetcode.ListNode1.数据结构;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SparseArray {
    public static void main(String[] args) throws IOException {
        int chessArr[][]=new int[11][11];
        chessArr[1][2]=1;
        chessArr[2][4]=2;
        System.out.println("原始二维数组");
        for (int [] row:chessArr) {
            for (int data:row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        //稀疏数组转化
        int sum=0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr[i][j]!=0) sum++;
            }
        }
        int[][] spareArray=new int[sum+1][3];
        spareArray[0][0]=chessArr.length; //行
        spareArray[0][1]=chessArr[0].length; //列
        spareArray[0][2]=sum; //值
        int temp=1; //起始
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr[i][j]!=0) {
                    spareArray[temp][0]=i;
                    spareArray[temp][1]=j;
                    spareArray[temp][2]=chessArr[i][j];
                    temp++;
                };
            }
        }
        System.out.println("转化后的");
        for (int [] row:spareArray) {
            for (int data:row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        //恢复
        int row1=spareArray[0][0];
        int line=spareArray[0][1];
        int[][] chessArr1=new int[row1][line];
        for (int i=1;i<spareArray.length;i++){
                chessArr1[spareArray[i][0]][spareArray[i][1]]=spareArray[i][2];
        }
        System.out.println("恢复后的");
        for (int [] row:chessArr1) {
            for (int data:row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        FileOutputStream out=new FileOutputStream("D://map.data");
        OutputStreamWriter writer=new OutputStreamWriter(out);
        for (int i = 0; i < spareArray.length; i++) {
            writer.write(String.valueOf(spareArray[i][0]));
            writer.write(",");
            writer.write(String.valueOf(spareArray[i][1]));
            writer.write(",");
            writer.write(String.valueOf(spareArray[i][2]));
            writer.write("\n");

        }
        writer.close();
        out.close();
    }
}
