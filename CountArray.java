public class CountArray{
    public static void main(String[] args){

        char[] arr={'a','b','s','d','d'};
        int[] store=new int[256];
         for(int i=0; i<arr.length;i++){
            store[arr[i]]++;
         }
         for(int i=0;i<256;i++){
            if(store[i]>0){
                System.out.println((char)i+":"+store[i]);
            }
        
         }
    }
}