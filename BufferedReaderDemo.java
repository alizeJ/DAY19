import java.io.*;

class  BufferedReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("F:\\Java ДњТы\\day19\\haha.txt");
		BufferedReader br = new BufferedReader(fr);

		String str = null;
		while ((str= br.readLine())!=null)
		{
			System.out.println(str);
		}

		br.close();
	}
}
