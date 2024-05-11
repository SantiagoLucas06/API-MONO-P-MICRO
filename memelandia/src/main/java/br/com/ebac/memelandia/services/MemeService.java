package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.repositories.RepositorioMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MemeService {
    @Autowired
    private RepositorioMeme repositorioMeme;

    public Meme novoMeme(Meme meme) {
        return repositorioMeme.save(meme);
    }

    public List<Meme> listaTodosMemes() {
        return repositorioMeme.findAll();
    }
}
