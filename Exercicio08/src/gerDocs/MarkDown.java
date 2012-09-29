package gerDocs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MarkDown extends Documento {

	public MarkDown(String nome, String profissao, String email) {
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
		saida.write(("# "+getNome()+"\n\n"+getProfissao()+"\n\n"+getEmail()).getBytes());

		return st;
	}

}
