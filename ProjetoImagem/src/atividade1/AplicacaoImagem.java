package atividade1;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AplicacaoImagem {
    public static void main(String[] args) {
        try {
            // Passo 1: Carregar a imagem existente (fotográfica)
            File arquivoEntrada = new File("imagens/imagem.jpg");
            BufferedImage imagemOriginal = ImageIO.read(arquivoEntrada);

            // Passo 2: Modificar a imagem - Aplicar um filtro
            BufferedImage imagemModificada = new BufferedImage(imagemOriginal.getWidth(), imagemOriginal.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = imagemModificada.createGraphics();
            
            // Exemplo de filtro: aplicando um filtro de escala de cinza
            for (int y = 0; y < imagemOriginal.getHeight(); y++) {
                for (int x = 0; x < imagemOriginal.getWidth(); x++) {
                    Color corOriginal = new Color(imagemOriginal.getRGB(x, y));
                    
                    // Calcular o valor de cinza (média de R, G e B)
                    int media = (corOriginal.getRed() + corOriginal.getGreen() + corOriginal.getBlue()) / 3;
                    Color corCinza = new Color(media, media, media);
                    
                    imagemModificada.setRGB(x, y, corCinza.getRGB());
                }
            }
            
            // Liberar recursos gráficos
            g2d.dispose();

            // Passo 3: Salvar a imagem modificada como JPEG
            File arquivoSaida = new File("imagens/imagem_filtrada.jpg");
            ImageIO.write(imagemModificada, "JPEG", arquivoSaida);

            System.out.println("Imagem filtrada e salva com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao processar a imagem: " + e.getMessage());
        }
    }
}
