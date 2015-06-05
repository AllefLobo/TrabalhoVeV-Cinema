package br.ufc.vv.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import br.ufc.vv.control.FilmeControlador;
import br.ufc.vv.control.contract.IFilmeController;
import br.ufc.vv.model.connection.excecoes.ErroNaConexao;
import br.ufc.vv.model.excecoes.ErroDAO;

public class EditarListener implements ActionListener{

	private int id;
	private String titulo;
	private String sinopse;
	private String genero;
	private String estudioDeFilmagem;
	private String anoLancamento;
	private String anoFilmagem;
	
	
	public EditarListener(int id, String titulo, String sinopse, String genero, String estudioDeFilmagem, String anoLancamento, String anoFilmagem) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.titulo = titulo;
		this.sinopse = sinopse;
		this.genero = genero;
		this.estudioDeFilmagem = estudioDeFilmagem;
		this.anoFilmagem = anoFilmagem;
		this.anoLancamento = anoLancamento;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		IFilmeController controlador = new FilmeControlador();
		try {
			controlador.editarFilme(id, titulo, sinopse, genero, anoFilmagem, anoLancamento, estudioDeFilmagem);
		} catch (ErroDAO | ErroNaConexao e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
