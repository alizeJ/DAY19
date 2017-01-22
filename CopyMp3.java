import java.io.*;

class CopyMp3
{
	public static void main(String[] args) throws IOException
	{
		copyMP3();
	}

	public static void copyMP3() throws IOException
	{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\xlou.mp3"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\copy_1.mp3"));

		int num = 0;
		byte[] buf = new byte[1024*2];
		while((num=bis.read(buf))!=-1)
		{
			bos.write(buf,0,num);
		}
		bos.close();
		bis.close();
	}
}
