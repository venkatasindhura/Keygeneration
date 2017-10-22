package keygen;

import java.io.FileInputStream;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;

public class Logoonprintpage {
	

		public static void main(String args[]) throws Exception {

		PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
		pras.add(new Copies(5));


		PrintService pss = PrintServiceLookup.lookupDefaultPrintService();

		System.out.println("Printing to " + pss);

		DocPrintJob job = pss.createPrintJob();

		FileInputStream fin = new FileInputStream("D:/Users/SindhuLucky/Pictures/logo.png");
		Doc doc = new SimpleDoc(fin, DocFlavor.INPUT_STREAM.GIF, null);

		job.print(doc, pras);



		fin.close();
		}
		}



