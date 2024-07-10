package com.heima.tess4j;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Application {

    /**
     * 识别图片中的文字
     * @param args
     */
    public static void main(String[] args) throws TesseractException {
        // 创建实例
        ITesseract iTesseract = new Tesseract();

        // 设置字体库路径
        iTesseract.setDatapath("F:\\tessdata_fast-master");

        // 设置语言 --> 简体中文
        iTesseract.setLanguage("chi_sim");

        File file = new File("C:\\Users\\admin\\Desktop\\QQ截图20240710171744.png");

        // 识别图片
        String result = iTesseract.doOCR(file);
        System.out.println("识别的结果为：" + result.replace("\\r|\\n", "-"));
    }
}
