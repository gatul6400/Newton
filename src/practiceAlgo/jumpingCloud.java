package practiceAlgo;

public class jumpingCloud {
    public static void main(String[] args) {
        int arr[] = { 0, 0,1,0, 0, 1, 0};
        int index = 0;
        int count = 0;
        int len = arr.length;
        for(int i = 0; i < arr.length - 1; i++){
            if(i+2 < len){

            if(arr[i + 2] == 0){
                i++;
                count++;
            }
            else{
                count++;
            }
            }
            else{
                if(arr[i + 1] == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
