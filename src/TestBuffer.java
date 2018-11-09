import java.nio.ByteBuffer;
import java.util.Arrays;

public class TestBuffer {
    public static void main(String[] args){
        ByteBuffer buffer=ByteBuffer.allocate(10);
        buffer.put((byte)'A').put((byte)'B').put((byte)'C');
        buffer.put(0,(byte)'a').put((byte)'D');
//        System.out.println(buffer.get());
        System.out.println(buffer.toString());
    }
}
