package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.entities.CategoriaMeme;
import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.entities.Usuario;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("servicoUsuarios")
public class ServicoUsuarios implements br.com.ebac.memelandia.services.ServicoMemelandia {
    @Override
    public List<Usuario> listaTodosUsuarios() {
        // Lógica para buscar usuários da base de dados do serviço de usuários
        return null;
    }

    @Override
    public Usuario novoUsuario(Usuario usuario) {
        // Lógica para adicionar um novo usuário na base de dados do serviço de usuários
        return null;
    }

    @Override
    public List<CategoriaMeme> listaTodasCategorias() {
        // Implementação padrão para evitar erro de compilação
        return null;
    }

    @Override
    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme) {
        // Implementação padrão para evitar erro de compilação
        return null;
    }

    @Override
    public List<Meme> listaTodosMemes() {
        // Implementação padrão para evitar erro de compilação
        return null;
    }

    @Override
    public Meme novoMeme(Meme meme) {
        // Implementação padrão para evitar erro de compilação
        return null;
    }
}
