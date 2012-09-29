package log;

import java.io.File;
import java.io.IOException;

/**
*
* @author Jackeline Dantas, Fabiano Ferreira
* 
*/

public class Log {
	private String mensagem = "";
	private static Log log;

	private Log() {
		
	}

	public static Log getInstance() {
		if (log == null)
			log = new Log();
		return log;
	}

	public void gravar(String msg) {
		this.mensagem += msg +";\n";
	}

	public File criarArquivo(String nome) {
		File arq = new File(nome);

		try {
			arq.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arq;
	}

	public String mostrarMensagens() {
		return mensagem;
	}

	public void limpar() {
		this.mensagem = "";
	}

}