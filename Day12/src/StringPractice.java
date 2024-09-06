public class StringPractice {

    public static void main(String[] args) {
        // Part 1
        // System.out.println("Hi");
        // String s1= "This is a Class";
        // // s1= s1.replace("Aditya", "Ankit");
        // // s1= s1.trim();
        // System.out.println(s1.toUpperCase());

        String original= "I am Batman";
        // String rev= reverse(original);
        reverseWords(original);

        //Part 2: Regex
        // String s1= "This\sis\sa\sclass";
        // String s2= "This\tis\ta\ttab";
        // String s3= "This is line 1.\nThis is line 2.";
        // String s4= "This  is \rHey \r";
        // String s5= "Girls Rule \f";
        // char a= '\"';
        // String s6= "This is \\ Divide";
        // System.out.println(s6);

        //Part 3: Split function
        // String s1= "Hi, this is an example string.";
        // String[] arr= s1.split("\\s",4);
        // for(String i: arr)
        //     System.out.println(i);

        //Part 4: String Intern
        // String s1= "hello";
        // String s2= "hello";
        // String s3= new String("hello").intern();
        // String s4= "hello";
        // String s5= new String("hello").intern();
        // System.out.println(s5==s3);

        //Part 5: ValueOf
        double n= 5123;
        String s1= String.valueOf(n);
        s1+= "abc";
        System.out.println(s1);

    }

    static String reverse(String s1){
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2+=s1.charAt(i);
        }
        return s2;
    }
    static boolean checkPal(String s){
        int i=0, j= s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }

    static char findMaxOcc1(String s){
        int countMaxElement=0;
        char maxElement= '*';
        int countCurrElement=0;
        char currElement= '*';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=currElement){
                if(countCurrElement>countMaxElement){
                    countMaxElement= countCurrElement;
                    maxElement= currElement;
                }
                currElement= s.charAt(i);
                countCurrElement=1;
            }else{
                countCurrElement++;
            }
        }
        if(countCurrElement>countMaxElement){
            countMaxElement= countCurrElement;
            maxElement= currElement;
        }
        return maxElement;
    }

    static char findMaxOcc2(String s){
        int[] arr= new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[index]<arr[i]){
                index=i;
            }
        }
        return (char)('a'+index);
    }

    static void reverseWords(String s){
        String[] arr= s.split("\\s");
        System.out.print("!");
        String temp="";
        for(int i=arr.length-1;i>=0;i--){
            temp+=arr[i]+" ";
        }
        temp=temp.trim();
        System.out.print(temp);
        System.out.print("!");
    }

}