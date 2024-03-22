package pdf;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


import java.util.regex.Pattern;

	
		public class EmailExtractor {

		    public static void main(String[] args) {
		        String filePath = "C:\\Users\\heman\\OneDrive\\Desktop\\Banglore IT Companies List.pdf";

		        try {
		            PDDocument pdoc = PDDocument.load(new File(filePath));
		            PDFTextStripper textStripper = new PDFTextStripper();
		            String text = textStripper.getText(pdoc);

		            String emailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
		            Pattern pattern = Pattern.compile(emailPattern);
		            Matcher matcher = pattern.matcher(text);

		            while (matcher.find()) {
		                String email = matcher.group();
		                System.out.println("Found email: " + email);
		            }

		            pdoc.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		

	}


