/* 
//  everything on heap
//  file name and class name same

public class basicSyntax {
    static {
        System.out.println("static block"); // new line p jata h
        System.out.print("!"); //  new line p nhi jata
    }

    public static void main(String[] args) {
        System.out.println("main");
    }
}
// jdk -library files + jvm
*/

public class basicSyntax {
    public static void main(String[] args) {
        //  default value : 0, '\0', "", 0.0
        /*
            int - int                   // 4 bytes
            char - char                 // 2 bytes
                String - string (immutable)             // on heap
            float - float(0.3f)                 // 4 bytes
            double - double(0.3)                //  8 bytes
            long - long long int                // 8 bytes
            short - short               // 2 bytes
            byte - ?                // 1 byte
            boolean - bool              // true or false
        */
        int[] arr = new int[11];   //  arr.length
        //   for cpp : int* arr = new int[100];
        
        //  for loop
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(i + " -> " + arr[i] + i);        //  "01"
            // System.out.println(i + " -> " + (arr[i] + i));      //  "1"
            //  cout << i << " -> " << arr[i] << endl;
            /* string str = to_string(i) + " -> " + to_string(arr[i]);
            cout <<< str << endl; */
        }

        //  while
        int sz = 69;
        while (sz-- > 0) {
            // System.out.println(sz);
        }

        // for each
        for (int i : arr) {
            // if (i == 0) {
            //     System.out.println(i);
            // } else if (i == 1) {
            //     System.out.println("chetan");
            // } else {
            //     System.out.println("kartik ka papa");
            // }
        }
        
        //  label
        chetan :
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > 0; j--) {
                if (j == 5) {
                    break chetan;
                    // continue;
                    // [X] goto
                }
                System.out.println(i + " <-> " + j);
            }
        }
    }

    public static int fun(int i) {
        return i;
    }
}