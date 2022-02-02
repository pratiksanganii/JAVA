import java.util.ArrayList;
import java.util.List;

// import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class Backtrackings {

    public void printPerm(String s,String perm,int idx){
        // Time Complexity : O(n*n!)
        if(s.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String ns=s.substring(0, i)+s.substring(i+1, s.length());
            printPerm(ns, perm+c, idx+1);
        }
    }

    public static void saveBoard(char[][] Board,List<List<String>> allBoards){
        String row="";
        List<String> newBoard = new ArrayList<>();
        for(int i=0;i<Board.length;i++){
            row="";
            for(int j=0;j<Board[0].length;j++){
                if(Board[i][j]=='Q'){
                    row+='Q';
                }else{
                    row+='.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public static void helper(char[][] Board,List<List<String>> allBoards,int col){
        if(col==Board.length){
            saveBoard(Board,allBoards);
            return;
        }
        for(int row=0;row<Board.length;row++){
            if(isSafe(row,col,Board)){
                Board[row][col] = 'Q';
                helper(Board, allBoards, col+1);
                Board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(int row,int col,char[][] Board){
        for(int j=0;j<Board.length;j++){
            if(Board[row][j]=='Q'){
                return false;
            }
        }
        for(int i=0;i<Board.length;i++){
            if(Board[i][col]=='Q'){
                return false;
            }
        }

        
        int r=row;
        for(int c=col;r>=0 && c<Board.length;c++,r--){
            if(Board[r][c]=='Q'){
                return false;
            }
        }
        
        r=row;
        for(int c=col;r>=0&&c>=0;r--,c--){
            if(Board[r][c]=='Q'){
                return false;
            }
        }
        r=row;
        for(int c=col;c>=0 && r<Board.length;r++,c--){
            if(Board[r][c]=='Q'){
                return false;
            }
        }

        r=row;
        for(int c=col;c<Board.length && r<Board.length;c++,r++){
            if(Board[r][c]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] Board = new char[n][n];
        helper(Board,allBoards,0);
        return allBoards;
    }





    public static List<List<Integer>> permuteArrList(List<Integer> nums){
        List<List<Integer>> ansList = new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            
        }
        return ansList;
    }
   
    

    public static void main(String[] args) {
        // String s="ABC";
        // printPerm(s, "", 0);
        List<Integer> nums = new ArrayList<>();
        // List<Integer> help = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(permuteArrList(nums));
    }
}