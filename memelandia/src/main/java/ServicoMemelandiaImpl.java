import br.com.ebac.memelandia.entities.CategoriaMeme;
import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.entities.Usuario;
import br.com.ebac.memelandia.services.ServicoMemelandia;

import java.util.List;

public class ServicoMemelandiaImpl implements ServicoMemelandia {
    @Override
    public List<Usuario> listaTodosUsuarios() {
        return List.of();
    }

    @Override
    public Usuario novoUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public List<CategoriaMeme> listaTodasCategorias() {
        return List.of();
    }

    @Override
    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme) {
        return null;
    }

    @Override
    public List<Meme> listaTodosMemes() {
        return List.of();
    }

    @Override
    public Meme novoMeme(Meme meme) {
        return null;
    }
}
