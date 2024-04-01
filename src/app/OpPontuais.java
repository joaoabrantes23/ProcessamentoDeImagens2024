package app;

import java.awt.*;
import java.awt.image.BufferedImage;

public class OpPontuais {

    public static BufferedImage bandaRed(BufferedImage img) {
        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                Color cor = new Color(img.getRGB(w, h));
                Color novaCor = new Color(cor.getRed(), 0, 0);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }

    public static BufferedImage bandaGreen(BufferedImage img) {
        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = img.getRGB(w, h);
                Color cor = new Color(rgb);
                int green = cor.getGreen();
                Color novaCor = new Color(0, green, 0);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }

    public static BufferedImage bandaBlue(BufferedImage img) {
        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = img.getRGB(w, h);
                Color cor = new Color(rgb);
                int blue = cor.getBlue();
                Color novaCor = new Color(0, 0, blue);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }

    public static BufferedImage negativo(BufferedImage img) {
        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = img.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                Color novaCor = new Color(255 - red, 255 - green,255 - blue);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }

    public static BufferedImage cinzaRed(BufferedImage img) {
        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = img.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                Color novaCor = new Color(red, red, red);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }


    public static BufferedImage cinzaGreen(BufferedImage img) {
        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = img.getRGB(w, h);
                Color cor = new Color(rgb);
                int green = cor.getGreen();

                Color novaCor = new Color(green, green, green);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }


    public static BufferedImage cinzaBlue(BufferedImage img) {
        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = img.getRGB(w, h);
                Color cor = new Color(rgb);
                int blue = cor.getBlue();

                Color novaCor = new Color(blue, blue, blue);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }


    public static BufferedImage cinzaMedia(BufferedImage img) {
        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = img.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                int mediaCor = (red+green+blue)/3;

                Color novaCor = new Color(mediaCor, mediaCor, mediaCor);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }


    public static BufferedImage binarizacao(BufferedImage img, int limiar) {
        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = img.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();
                int color = 0;

                int mediaCor = (red+green+blue)/3;
                if(mediaCor > limiar){
                    color = 255;
                }
                else{
                    color = 0;
                }

                Color novaCor = new Color(color, color, color);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }


    public static BufferedImage aumentoTonalidade(BufferedImage img, String color, int alteracao) {
        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = img.getRGB(w, h);
                Color cor = new Color(rgb);
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                switch (color) {
                    case "red":
                        red += alteracao;
                        red = limitCor(red);
                        break;
                    case "green":
                        green += alteracao;
                        green = limitCor(green);
                        break;
                    case "blue":
                        blue += alteracao;
                        blue = limitCor(blue);
                        break;
                    default:
                        System.out.println("COR INVALIDA!!!");
                        break;
                }


                Color novaCor = new Color(red, green, blue);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }

    private static int limitCor(int cor){
        if(cor > 255){
            cor = 255;
        } else if (cor < 0) {
            cor = 0;
        }
        return cor;
    }

    public static BufferedImage adicionarBrilho(BufferedImage img, int alteracao) {

        if(alteracao == 0)
            throw new IllegalArgumentException();

        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = img.getRGB(w, h);
                Color cor = new Color(rgb);

                int red = limitCor((cor.getRed() + alteracao));
                int green = limitCor((cor.getGreen() + alteracao));
                int blue = limitCor((cor.getBlue() + alteracao));

                Color novaCor = new Color(red, green, blue);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }

    public static BufferedImage multiplicarBrilho(BufferedImage img, float alteracao) {

        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = img.getRGB(w, h);
                Color cor = new Color(rgb);

                int red = limitCor((int) (cor.getRed() * alteracao));
                int green = limitCor((int) (cor.getGreen() * alteracao));
                int blue = limitCor((int) (cor.getBlue() * alteracao));

                Color novaCor = new Color(red, green, blue);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }


    public static BufferedImage aditivoBandaY(BufferedImage img, int alteracao) {

        if(alteracao == 0)
            throw new IllegalArgumentException();

        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = img.getRGB(w, h);
                Color cor = new Color(rgb);

                //pegar banda RGB
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                //converter para YIQ
                float Y = (float) (0.299 * red + 0.587 * green + 0.114 * blue);
                float I = (float) (0.596 * red - 0.275 * green - 0.321 * blue);
                float Q = (float) (0.212 * red - 0.528 * green + 0.311 * blue);

                //fazer aditivo na banda Y
                Y += alteracao;

                //converter para RGB
                red = limitCor((int) (Y + 0.956 * I + 0.621 * Q));
                green = limitCor((int) (Y - 0.272 * I - 0.647 * Q));
                blue = limitCor((int) (Y - 1.106 * I + 1.703 * Q));


                Color novaCor = new Color(red, green, blue);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }

    public static BufferedImage multiplicacaoBandaY(BufferedImage img, float alteracao) {

        if(alteracao == 0)
            throw new IllegalArgumentException();

        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = img.getRGB(w, h);
                Color cor = new Color(rgb);

                //pegar banda RGB
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                //converter para YIQ
                float Y = (float) (0.299 * red + 0.587 * green + 0.114 * blue);
                float I = (float) (0.596 * red - 0.275 * green - 0.321 * blue);
                float Q = (float) (0.212 * red - 0.528 * green + 0.311 * blue);

                //fazer multiplicação na banda Y
                Y *= alteracao;

                //converter para RGB
                red = limitCor((int) (Y + 0.956 * I + 0.621 * Q));
                green = limitCor((int) (Y - 0.272 * I - 0.647 * Q));
                blue = limitCor((int) (Y - 1.106 * I + 1.703 * Q));


                Color novaCor = new Color(red, green, blue);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }

    public static BufferedImage negativoBandaY(BufferedImage img) {

        int largura = img.getWidth();
        int altura = img.getHeight();
        BufferedImage imagemSaida = new BufferedImage(largura, altura, img.getType());

        for (int h = 0; h < altura; h++) {
            for (int w = 0; w < largura; w++) {
                int rgb = img.getRGB(w, h);
                Color cor = new Color(rgb);

                //pegar banda RGB
                int red = cor.getRed();
                int green = cor.getGreen();
                int blue = cor.getBlue();

                //converter para YIQ
                float Y = (float) (0.299 * red + 0.587 * green + 0.114 * blue);
                float I = (float) (0.596 * red - 0.275 * green - 0.321 * blue);
                float Q = (float) (0.212 * red - 0.528 * green + 0.311 * blue);

                //fazer negativo na banda Y
                Y -= 255;

                //converter para RGB
                red = limitCor((int) (Y + 0.956 * I + 0.621 * Q));
                green = limitCor((int) (Y - 0.272 * I - 0.647 * Q));
                blue = limitCor((int) (Y - 1.106 * I + 1.703 * Q));


                Color novaCor = new Color(red, green, blue);
                imagemSaida.setRGB(w, h, novaCor.getRGB());
            }
        }
        return imagemSaida;
    }

}


