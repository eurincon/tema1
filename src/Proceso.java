import java.io.IOException;

public class Proceso
{
	public static void main(String[] args) throws IOException
	{
		ProcessBuilder pb = new ProcessBuilder("notepad");
		pb.start();
	}
}