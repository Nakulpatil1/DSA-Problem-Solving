class Solution {
    public int maximumWealth(int[][] accounts) {
       int ans = Integer.MIN_VALUE; 
     for (int wealth = 0; wealth < accounts.length; wealth++) {
        int wealthsum = 0;
        for (int account = 0; account < accounts[wealth].length; account++) {
            wealthsum = wealthsum + accounts[wealth][account];
        }
        if(wealthsum > ans){
            ans = wealthsum;
        }    
        
        }
        return ans;
}

}