package Recursion;

public class numbers {
    public static void towerofHanoi(int n, String source, String helper, String destination) {
        if(n==1) {
            System.out.println("move disk"+" "+n+" from "+source+ " to "+destination);
            return;
        }
      //transfer top n-1 from source to helper using destinatino as 'helper'
        towerofHanoi(n-1,source,destination,helper);
      //transfer nth from source to destination
        System.out.println("move disk"+" "+n+" from "+source+" to "+destination);
      //transfer n-1 from helper to destination using source as 'helper'
        towerofHanoi(n-1,helper,source,destination);

    }
    public static void main(String[] args) {
        int n=4;
        towerofHanoi(n,"A","B","C");
    }
}
