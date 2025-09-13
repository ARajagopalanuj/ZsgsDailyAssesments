package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("welcome");
        System.out.println("up move    ->8");
        System.out.println("down move  ->2");
        System.out.println("left move  ->4");
        System.out.println("right move ->6");
        Scanner scan=new Scanner(System.in);

        int[][] board=new int[4][4];

        board[3][3]=2;
        printBoard(board);


        System.out.println("Exit.. enter 5");
        while(true){

            System.out.println("Enter your move");
            int n=scan.nextInt();
            if(n==2){
                moveDown(board);
            }else if(n==8){
                moveUp(board);
            }else if(n==6){
                moveRight(board);
            }else if(n==4){
                moveLeft(board);
            } else if (n==5) {
                System.out.println("Exit.. game...");
                break;
            }
            else{
                System.out.println("Please enter the correct key");
                continue;
            }

             if(winCheck(board)){
                System.out.println("Game win");
                break;
            }else if(gameOver(board)){
                System.out.println(("Game over"));
                break;
            }
            printBoard(board);
            Thread.sleep(1000);
            getRandom(board);
            System.out.println();
            System.out.println();
            System.out.println();
            printBoard(board);

        }
    }
    static void printBoard(int[][] board){
        for(int[] row:board){
            System.out.println(Arrays.toString(row));

        }
    }
    static void moveRight(int[][] board){
        for(int i=board.length-1;i>=0;i--){
            for(int j=board[0].length-2;j>=0;j--) {

                    for(int k=j;k>=0;k--) {
                        if (board[i][j + 1] == 0) {
                        board[i][j + 1] = board[i][k];
                        board[i][k] = 0;
                        }
                        if(board[i][j+1]==board[i][k]) {
                            board[i][j + 1] += board[i][k];
                            board[i][k] = 0;
                        }
                }
            }
        }

    }

    static void  moveLeft(int[][] board){

        for(int i=0;i<board.length;i++){

            for(int j=1;j<board[0].length;j++){

                for(int k=j;k<board.length;k++) {
                    if (board[i][j- 1] == 0) {
                        board[i][j- 1] = board[i][k];
                        board[i][k] = 0;
                    }
                    if(board[i][j-1]==board[i][k]) {
                        board[i][j- 1] += board[i][k];
                        board[i][k] = 0;
                    }
                }
            }
        }

    }

    static void  moveUp(int[][] board){

        for(int i=1;i<board.length;i++){

            for(int j=0;j<board[0].length;j++){

                for(int k=i;k<board.length;k++) {
                    if(board[i-1][j]==0){
                        board[i-1][j]=board[k][j];
                        board[k][j]=0;
                    }
                    if(board[i-1][j]==board[k][j]){
                        board[i-1][j]+=board[k][j];
                        board[k][j]=0;
                    }
                }

            }
        }


    }

    static void moveDown(int[][] board){

        for(int i=board.length-2;i>=0;i--){

            for(int j=0;j<board.length;j++){
                for(int k=i;k>=0;k--) {
                    if (board[i + 1][j] == 0) {
                        board[i + 1][j] = board[k][j];
                        board[k][j] = 0;

                    }
                    if(board[i+1][j]==board[k][j]){
                        board[i+1][j]+=board[k][j];
                        board[k][j]=0;
                    }

                }
            }

        }

    }
    static  void getRandom(int[][] board){
    List<int[]> list=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==0){
                    list.add(new int[]{i,j});
                }
            }
        }
        int random=(int)(Math.random()*list.size());

        int[] arr=list.get(random);
        board[arr[0]][arr[1]]=2;
    }
    static boolean winCheck(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==32){
                    return true;
                }
            }
        }
        return false;
    }
    public static  boolean gameOver(int[][]board){
        int count0=0;
        int space=0;
        Set<Integer> set=new HashSet<>();
         for(int i=0;i<board.length;i++){
             for(int j=0;j<board[0].length;j++){
                 if(board[i][j]==0){
                     count0++;
                 }
                 set.add(board[i][j]);

             }
         }
         return count0==0||set.size()== board.length*board[0].length;

    }
}
