package gerDocs;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import static org.junit.Assert.*;

import gerDocs.Documento;
import gerDocs.HTML;
import gerDocs.JSON;
import gerDocs.MarkDown;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class DocTeste {
	Documento doc1 = new HTML("Jackeline","Estudante","jackeline.dantas@dce.ufpb.br");
	Documento doc2 = new MarkDown("Fabiano","Estudante","fabiano.ferreira@dce.ufpb.br");
	Documento doc3 = new JSON("Rosicleide","Estudante","rosicleide.franca@dce.ufpb.br");


	@Test
	public void test() {
		assertEquals("Jackeline",doc1.getNome());
		assertEquals("Estudante",doc1.getProfissao());
		assertEquals("jackeline.dantas@dce.ufpb.br",doc1.getEmail());
	}

	@Test
	public void testCriarArquivo(){
		File arquivo = doc1.criarArquivo("documento.txt");
		assertTrue(arquivo.exists());
	}

	@Test 
	public void testNomeArquivo(){
		File arquivo = doc1.criarArquivo("documento2.txt");
		assertEquals("documento2.txt", arquivo.getName());
	}

	@Test
	public void testEscreverHtml(){
		try {
			doc1.escrever("Doc.html");
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		String result = "";

		try {
			BufferedReader in = new BufferedReader(new FileReader("Doc.html"));
			String str;
			while ((str = in.readLine()) != null) {
				result += (str + "\n");
			}
		in.close();
		} catch (IOException e) {
		}

		String esperado = "<html>\n<body>\n<h1>Jackeline</h1>\n<p>Estudante</p>\n<p>jackeline.dantas@dce.ufpb.br</p>\n</body>\n</html>\n";
		assertEquals(esperado,result);
	}

	@Test
	public void testEscreverMarkDown() {
		try {
			doc2.escrever("Doc.markdown");
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		String result = "";

		try {
			BufferedReader in = new BufferedReader(new FileReader("Doc.markdown"));
			String str;
			while ((str = in.readLine()) != null) {
				result += (str + "\n");
			}
			in.close();
		} catch (IOException e) {
		}
		
		String esperado = "# Fabiano\n\nEstudante\n\nfabiano.ferreira@dce.ufpb.br\n";
		assertEquals(esperado,result);
	}

	@Test
	public void testEscreverJSON() {
		try {
			doc3.escrever("Doc.json");
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		String result = "";

		try {
			BufferedReader in = new BufferedReader(new FileReader("Doc.json"));
			String str;
			while ((str = in.readLine()) != null) {
				result += (str + "\n");
			}
			in.close();
		} catch (IOException e) {
		}
		
		String esperado = "nome: Rosicleide\n\nprofissao: Estudante\n\nemail: rosicleide.franca@dce.ufpb.br\n";
		assertEquals(esperado,result);
	}

}