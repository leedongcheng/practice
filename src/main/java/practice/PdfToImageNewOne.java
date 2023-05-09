package practice;

import lombok.extern.slf4j.Slf4j;
import org.icepdf.core.pobjects.Document;
import org.icepdf.core.pobjects.Page;
import org.icepdf.core.util.GraphicsRenderingHints;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

@Slf4j
public class PdfToImageNewOne {
    public static void main(String[] args) throws Exception {
        final String UPLOAD_FILE_PATH = "C:\\Users\\Fabian.Liao\\Desktop\\";
        final String PDF_PATH = "pdf/tt3.pdf";

        String originalFilename = PDF_PATH.split("/")[1];
        String dir = originalFilename.split("\\.")[0] + "\\";
        log.info(dir);
        File dirFile = new File(UPLOAD_FILE_PATH + dir);
        dirFile.mkdir();
        String fileName = UPLOAD_FILE_PATH + dir + originalFilename;
        Document document = new Document();
        document.setFile("src/main/resources/"+PDF_PATH);
        float scale = 2.5f;
        // 縮放比例
        float rotation = 0f;
        // 旋轉角度
        for (int i = 0; i < document.getNumberOfPages(); i++) {
            BufferedImage image = (BufferedImage) document.getPageImage(i, GraphicsRenderingHints.SCREEN,
                    Page.BOUNDARY_CROPBOX, rotation, scale);
            RenderedImage rendImage = image;
            try {
                File file = new File(fileName + (i+1) + ".png");
                ImageIO.write(rendImage, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            image.flush();
        }
        document.dispose();
    }
}