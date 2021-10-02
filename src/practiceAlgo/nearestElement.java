package practiceAlgo;

public class nearestElement {
    public static void main(String args[]){
        int arr[] = {4, 10, 5, 8, 20, 15, 25, 30};
        int nearestEle = -1;
        int secNearest = -1;
        int target = 20;
        for(int i = 0; i < arr.length; i++){
            if(nearestEle < arr[i]){
                System.out.print(nearestEle+ " ");
                secNearest = nearestEle;
                nearestEle = arr[i];
//                if(arr[i] == target){
//                    break;
//                }
            }
            else if (secNearest < arr[i]){
                System.out.print(secNearest + " ");
                nearestEle = arr[i];
                secNearest = nearestEle;
            }
        }
    }
}
