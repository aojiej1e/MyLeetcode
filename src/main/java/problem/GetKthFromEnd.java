package problem;

import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2022-10-22 19:08
 */
public class GetKthFromEnd {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        GetKthFromEnd getKthFromEnd = new GetKthFromEnd();
        System.out.println(getKthFromEnd.getKthFromEnd(l1, 3));

    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        int count = 0;
        HashMap<Integer, ListNode> hashMap = new HashMap<>();
        while (head != null){
            count++;
            hashMap.put(count, head);
            head = head.next;
        }
        return hashMap.get(hashMap.size() - k + 1);
    }
    public boolean exist(char[][] board, String word) {
        boolean isFlag = false;
        if(board != null && board.length >0 && board[0] != null && board[0].length>0 && word != null && !"".equals(word) ) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    int[][] tCoor= new int[board.length][board[0].length];
                    if(board[i][j] == word.charAt(0) && tCoor[i][j]!=1) {
                        tCoor[i][j]=1;
                        isFlag = isFlag(board, word, i, j, 0, "",tCoor);
                        if(isFlag) {
                            return board.length * board[i].length >= word.length();
                        }
                    }
                }
            }
        }
        return isFlag;
    }

    public boolean isFlag(char[][] board,String word,int i,int j,int k,String pos,int[][] tCoor) {
        String newPos = "";
        if(k==word.length()-1) {
            return true;
        }
        if(!"up".equals(pos) ) {
            if(i>0) {
                if(board[i-1][j]==word.charAt(k+1) && tCoor[i-1][j] != 1) {
                    newPos="low";
                    tCoor[i-1][j] = 1;
                    if(isFlag(board,word,i-1,j,k+1,newPos,tCoor)){
                        return true;
                    }
                }
            }
        }
        if(!"low".equals(pos) ) {
            if(i<board.length-1) {
                if(board[i+1][j]==word.charAt(k+1) && tCoor[i+1][j] != 1) {
                    newPos="up";
                    tCoor[i + 1][j] = 1;
                    if(isFlag(board,word,i+1,j,k+1,newPos,tCoor)){
                        return true;
                    }
                }
            }
        }
        if(!"left".equals(pos)) {
            if(j>0) {
                if(board[i][j-1]==word.charAt(k+1) &&  tCoor[i][j-1] != 1) {
                    newPos="right";
                    tCoor[i][j-1] = 1;
                    if(isFlag(board,word,i,j-1,k+1,newPos,tCoor)){
                        return true;
                    }
                }
            }
        }
        if(!"right".equals(pos)) {
            if(j<board[i].length-1) {
                if(board[i][j+1]==word.charAt(k+1) && tCoor[i][j+1] != 1) {
                    newPos="left";
                    tCoor[i][j+1] = 1;
                    if(isFlag(board,word,i,j+1,k+1,newPos,tCoor)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
