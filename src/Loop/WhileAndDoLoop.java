package Loop;

public class WhileAndDoLoop {
    public static void main(String[] args) {
        for(int i  = 1 ; i <= 5; i++){
            System.out.println(i);
        }
        int j = 1;
        boolean isReady = false ;
        do{
            if( j > 5){
                break;
            }
            System.out.println(" this the the while loop " + j );
            j++;
            isReady = ( j > 0);
        } while(isReady);
    }
}
