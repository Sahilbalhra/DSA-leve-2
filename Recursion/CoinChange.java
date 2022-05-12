class CoinChange{
    //permutation infinate case
    public static int coinChangePermInf(int [] coins, int tar, String asf){
        if(tar == 0){
            System.out.println(asf);
            return 1;
        }
        int count = 0;
        for(int i = 0; i<coins.length; i++){
            if(tar - coins[i] >= 0){
                count += coinChangePermInf(coins, tar-coins[i], asf + coins[i]);
            }
        }
        return count;
    }
    //permutation single case
    public static int coinChangePermSingle(int [] coins, int tar, String asf){
        if(tar == 0){
            System.out.println(asf);
            return 1;
        }
        int count = 0;
        for(int i = 0; i<coins.length; i++){
            if(coins[i]>0 &&tar-coins[i]>=0){
                int val=coins[i];
                // mark
                coins[i]=-coins[i];
                count += coinChangePermSingle(coins, tar-val, asf + val);
                //ummark
                coins[i]=-coins[i];
            }
        }
        return count;
    }
    //combination
    public static int coinChangeCombInf(int [] coins, int tar,int idx, String asf){
        if(tar == 0){
            System.out.println(asf);
            return 1;
        }
        int count = 0;
        for(int i = idx; i<coins.length; i++){
            if(tar - coins[i] >= 0){
                count += coinChangeCombInf(coins, tar-coins[i],i, asf + coins[i]);
            }
        }
        return count;
    }
    //combination single 
    public static int coinChangeCombSingle(int [] coins, int tar,int idx, String asf){
        if(tar == 0){
            System.out.println(asf);
            return 1;
        }
        int count = 0;
        for(int i = idx; i<coins.length; i++){
            if(tar - coins[i] >= 0){
                count += coinChangeCombInf(coins, tar-coins[i],i, asf + coins[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []coins={2,3,5,7};
        int tar=10;
        // int ans =coinChangePermInf(coins,tar,"");
        // System.out.println("permutaion -->"+ans);
        int ans =coinChangeCombInf(coins,tar,0,"");
        System.out.println("Combination -->"+ans);
    }
}