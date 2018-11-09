import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class GetInt {
    public static void main(String[] args) throws Exception{
        ByteBuffer byteBuffer=ByteBuffer.allocate(8);
        byteBuffer.put((byte)0x07);
        byteBuffer.put((byte)0x3b);
        byteBuffer.put((byte)0xc5);
        byteBuffer.put((byte)0x31);
        byteBuffer.put((byte)0x5e);
        byteBuffer.put((byte)0x94);
        byteBuffer.put((byte)0xd6);
        byteBuffer.put((byte)0x04);
        byteBuffer.flip();
        System.out.println(Integer.toHexString(byteBuffer.getInt(3)));
        System.out.println(byteBuffer.toString());
        SocketChannel sc=SocketChannel.open();
        sc.connect(new InetSocketAddress("localhost",10010));
        ServerSocketChannel ssc=ServerSocketChannel.open();
        ssc.socket().bind(new InetSocketAddress(100));
        DatagramChannel dgc=DatagramChannel.open();
        RandomAccessFile raf=new RandomAccessFile("/fa/","r");
        FileChannel tc=raf.getChannel();

    }
}
