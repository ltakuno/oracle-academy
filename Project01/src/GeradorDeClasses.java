import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeClasses {
	private static FileWriter writer;

	public static void main(String[] args) throws IOException {
		String filename;
		File f = new File("metaspace");
		if (!f.exists()) f.mkdirs();
		for (int i = 0; i < 1000; i++) {
			filename = "metaspace/Hello" + String.format("%04d", i) + ".java";
			f = new File(filename);
			writer = new FileWriter(f);
			writer.write("public class Hello" + i + " {\n\tpublic void sayHello() {\n\t\tSystem.out.println(\"Hello world" + i
					+ "\");\n\t}\n}");
			writer.close();
			
		}
	}
}
