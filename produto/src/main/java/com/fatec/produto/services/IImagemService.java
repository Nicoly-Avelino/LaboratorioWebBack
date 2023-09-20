package com.fatec.produto.services;

import com.fatec.produto.model.Imagem;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import  java.util.List;
import java.util.Optional;

public interface IImagemService {
    public Optional<Imagem> salvar(MultipartFile arquivo, long id)throws IOException;
    public List<Imagem>getAll();
    public byte[] getImagem(String nomeArquivo);
    public byte[] getImagemById(Long id);
}
