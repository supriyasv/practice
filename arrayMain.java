public class arrayMain {
        public static void main(String[] args){
            int a[];
            int[] b;

            a= new int[5];

            a[0]=10;
            a[1]=20;
            a[2]=30;
            a[3]=50;
            a[4]=60;

            for(int i=0;i<a.length;i++)
                System.out.println("value of a["+ i +"]:"+ a[i]);

            //combining declaration and memory allocation
            int c[]=new int[5] ;

            //declaration+allocation+initialization
            int d[]=new int[]{1,2,3,4,5};
            for(int i=0;i < d.length;i++)
                System.out.println("value of d["+ i +"]:"+ a[i]);


        }

}
