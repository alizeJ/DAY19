import java.io.*;

class  LineNumberDemo
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("F:\\haha.txt");
		LineNumberReader li = new LineNumberReader(fr);
		li.setLineNumber(0);

		String line = null;
		
		while((line=li.readLine())!=null)
		{
			System.out.println(li.getLineNumber()+":"+line);
		}
	}
}
