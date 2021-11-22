package Task6;
/*

 */ 
import java.io.ObjectInputFilter;
import java.util.Arrays;

public class Task_6_3 implements Filter {
    public static Object[] filter(Object[] array, Filter filter){
        int offset = 0;
        for (int i=0; i<array.length; i++){
            if(!filter.apply(array[i])){
                offset++;
            } else {
                array[i-offset]= array[i];
            }
        }
        return Arrays.copyOf(array, array.length - offset-1);
    }
    @Override
    public boolean apply(Object o) {
        if (o==null)
        return false;
        else return true;
    }

    public static void main(String[] args) {
        Filter filter = new Filter() {
            @Override
            public boolean apply(Object o) {
                if (o==null)
                    return false;
                else return true;
            }
        };
        Object[] obj = new Object[]{"Sexy", null, 23, 23, null, "Hello"};
        filter(obj, filter);
        System.out.println(Arrays.toString(filter(obj, filter)));
    }
}


