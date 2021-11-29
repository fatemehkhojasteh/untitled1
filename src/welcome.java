public class welcome {
    public static void main(String[] args){

        int [] array=new int[10];
        System.out.println("index" + " " + "value");
        for (int i=0; i< array.length ;i++){
            array[i]=2*i;
        }
        for(int i=0; i< array.length; i++){
            System.out.println(i + "     " + array[2]);
        }
    }
}
