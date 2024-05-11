package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.entities.CategoriaMeme;
import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServicoMemelandia {
    List<Usuario> listaTodosUsuarios();

    Usuario novoUsuario(Usuario usuario);

    List<CategoriaMeme> listaTodasCategorias();

    CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme);

    List<Meme> listaTodosMemes();

    Meme novoMeme(Meme meme);
}
