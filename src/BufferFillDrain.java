import java.nio.CharBuffer;

public class BufferFillDrain {
    public static void main (String [] argv) {
        CharBuffer buffer = CharBuffer.allocate (100);
        while (fillBuffer (buffer)) {
            buffer.flip( );
            drainBuffer (buffer);
            buffer.clear( );
        }
        CharBuffer charBuffer=CharBuffer.allocate(100);
        char[] chars=new char[1000];
        charBuffer=CharBuffer.wrap(chars,5,100);
        System.out.println(charBuffer.arrayOffset());
        CharBuffer buff1=CharBuffer.wrap(chars);
        buff1.position(10).limit(21);
        CharBuffer buff_sliced=buff1.slice();

    }
    private static void drainBuffer (CharBuffer buffer) {
        while (buffer.hasRemaining( )) {
            System.out.print (buffer.get());
        }
         System.out.println (" ");
    }
    private static boolean fillBuffer (CharBuffer buffer) {
        if (index >= strings.length) {
            return (false);
        }
        String string = strings[index++];
        for (int i = 0; i < string.length(); i++) {
            buffer.put(string.charAt(i));
        }
        return  true;
    }

    private static int index = 0;
    private static String[] strings = {
            "A random string value",
            "The product of an infinite number of monkeys",
            "Hey hey we're the Monkees",
            "Opening act for the Monkees: Jimi Hendrix",
            "Scuse me while I kiss this fly"};
}
