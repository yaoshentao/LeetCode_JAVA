package cn.ques914;

//循环的极致！！！什么都是循环
public class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] res=new int[1000];
        for(int i=0;i<deck.length;i++){
            res[deck[i]]++;
        }
        int g=-1;
        for(int j=0;j<1000;j++){
            if(res[j]>0){
                if(g==-1){
                    g=res[j];
                }else{
                    g=gcd(g,res[j]);
                }
            }
        }
        return g>=2;
    }
    public int gcd(int x,int y){
        return x==0?y:gcd(y%x,x);
    }
}
