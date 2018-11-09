import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class TestDatagramChannel_1_Receive {
    public static void main(String[] args) throws Exception {
        DatagramChannel datagramChannel=DatagramChannel.open();
        datagramChannel.configureBlocking(true);
        datagramChannel.socket().bind(new InetSocketAddress("localhost",61378));
        ByteBuffer byteBuffer=ByteBuffer.allocate(248);
        SocketAddress socketAddress=datagramChannel.receive(byteBuffer);
        System.out.println(socketAddress.toString());
        byteBuffer.flip();
        byte[] receive=new byte[byteBuffer.limit()];
        byteBuffer.get(receive);
        String string=new String(receive,"utf-8");
        System.out.println(string);
    }
}
