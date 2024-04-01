package app;

import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        BufferedImage imagem = ManipulaImagem.abrirImagem("miniatura.jpg");

        ManipulaImagem.exibirImagens(
                imagem,
                OpPontuais.bandaRed(imagem),
                OpPontuais.bandaGreen(imagem),
                OpPontuais.bandaBlue(imagem),
                OpPontuais.negativo(imagem),
                OpPontuais.cinzaRed(imagem),
                OpPontuais.cinzaGreen(imagem),
                OpPontuais.cinzaBlue(imagem),
                OpPontuais.cinzaMedia(imagem),
                OpPontuais.binarizacao(imagem, 100),
                OpPontuais.aumentoTonalidade(imagem, "blue", 100),
                OpPontuais.adicionarBrilho(imagem, -100),
                OpPontuais.multiplicarBrilho(imagem, (float) 1.5),
                OpPontuais.aditivoBandaY(imagem, 100),
                OpPontuais.multiplicacaoBandaY(imagem, 2),
                OpPontuais.negativoBandaY(imagem )

        );

        ManipulaImagem.salvarImagem(imagem, "jpg", "imagess.jpg");
    }

}