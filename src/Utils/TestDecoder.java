package Utils;

import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

import org.apache.commons.codec.binary.Base64;

public class TestDecoder {

	public static void main(String[] args) {
	String	encodedCompressedPaRes ="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";
	encodedCompressedPaRes = encodedCompressedPaRes.replaceAll("\\s", "");

		// Decode
		byte[] compressedPaResBytes = null;
		Inflater decompresser;
		byte[] plainPaResBytes = new byte[10000];
		int resultLength = 0;
		String plainPaRes = null;

		try {
			compressedPaResBytes = Base64.decodeBase64(encodedCompressedPaRes.getBytes("UTF-8"));
			decompresser = new Inflater();
			decompresser.setInput(compressedPaResBytes, 0, compressedPaResBytes.length);
			resultLength = decompresser.inflate(plainPaResBytes);
			decompresser.end();
			// --- Make string from decompressed bytes
			plainPaRes = new String(plainPaResBytes, 0, resultLength, "UTF-8");
			System.out.println(plainPaRes);
		} catch (UnsupportedEncodingException | DataFormatException ex) {
			ex.printStackTrace();
		} 

	}

}
