class DoubleCharacter
{
    static String  duplicateConsecutiveCharacter(String str)
    {
        if(str.length()<=1)
        {
            return str;
        }
        if(str.charAt(0)==str.charAt(1))
        {
            return duplicateConsecutiveCharacter((str.substring(1)));
        }
        else
        {
            return str.charAt(0)+duplicateConsecutiveCharacter(str.substring(1));
        }
    }

    public static void main(String args[])
    {
        String str = "abccddde";
        System.out.println("Original string "+str);
        System.out.println(duplicateConsecutiveCharacter("Output :- "+str));
        String str1 = "aabbbbaaa";
        System.out.println("Original string "+str1);
        System.out.println(duplicateConsecutiveCharacter("Output :- "+str1));
    }
}
