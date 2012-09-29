package gerDocs;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HTML extends Documento {

	public HTML(String nome, String profissao, String email) {
		super(nome, profissao, email);
	}

	protected String escrever(String st) throws IOException {
		File arq = criarArquivo(st);
		FileOutputStream saida = null;

		try {
			saida = new FileOutputStream(arq);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		saida.write(("<html>\n<body>\n<h1>"+getNome()+ "</h1>\n<p>" + getProfissao() + "</p>\n<p>" + getEmail() + "</p>\n</body>\n</html>\n").getBytes());

		return st;
	}

}
