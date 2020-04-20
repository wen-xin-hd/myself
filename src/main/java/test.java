
public class test {
    public static void main(String[] args) {
        getmininum();

    }


    public static void getmininum(){
        int num = 6;

        int[] type = {1,3,5,7,9};

        for(int i =1 ;i<num;i++){

            for (int j = 0; j < type.length; j++) {
                if((i+j)==6 &&  contains(i,type) ){
                    System.out.println(i +"-----"+j );
                }
            }
        }
    }

    public static boolean contains(int n,int[] type){
        boolean status =false;//不存在
        for (int i : type) {
            if(n ==i) status =true;//存在
        }
        return status;
    }
}
