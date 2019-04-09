import java.io.File;

public class testBuilder {

	public static void main(String[] args) {
		PaperBuilder builder = new PaperBuilder();
		File f = new File("test/p.pdf");
		builder.buildPaper(f);

	}

}
