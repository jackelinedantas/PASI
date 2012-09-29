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

public class JSON extends Documento {

	public JSON(String nome, String profissao, String email) {
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
		saida.write(("nome: "+getNome()+ "\n\nprofissao: " + getProfissao() + "\n\nemail: " + getEmail()).getBytes());

		return st;
	}

}