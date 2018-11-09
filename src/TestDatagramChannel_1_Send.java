import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class TestDatagramChannel_1_Send {
    private static final String string="Hello world"+System.currentTimeMillis();
    public static void main(String[] args) throws Exception {
        DatagramChannel datagramChannel=DatagramChannel.open();
        ByteBuffer byteBuffer=ByteBuffer.allocate(248);
        byteBuffer.put(string.getBytes());
        byteBuffer.flip();
        int send=datagramChannel.send(byteBuffer,new InetSocketAddress("localhost",61378));
        System.out.println(send);
    }
}
