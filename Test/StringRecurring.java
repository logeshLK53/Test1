package Test;
public class StringRecurring {
    public static void main(String[] args) {
        String str = "Harry Potter in his magical Island";
        char ch=' ';
        int max=0;
        int count[]=new int[256];
        for(int i=0;i<str.length();i++)
        {
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++)
        {
            if(count[str.charAt(i)]>max && str.charAt(i) != ' ')
            {
                max=count[str.charAt(i)];
                ch=str.charAt(i);
            }
        }
        System.out.println("The most recurring character is : "+ ch);
    }
}
