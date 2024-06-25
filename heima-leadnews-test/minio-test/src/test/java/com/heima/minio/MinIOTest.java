package com.heima.minio;

import com.heima.file.service.FileStorageService;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//@SpringBootTest
//@RunWith(SpringRunner.class)
public class MinIOTest {

//    @Autowired
//    private FileStorageService fileStorageService;
//
//    @Test
//    public void test() throws FileNotFoundException {
//        FileInputStream fileInputStream = new FileInputStream("G:\\list.html");
//        String path = fileStorageService.uploadHtmlFile("", "list.html", fileInputStream);
//        System.out.println(path);
//    }

    /**
     * 把list.html 文件上传到minio中，并且可以在浏览器中访问
     * @param args
     */
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("G:\\temp\\js\\index.js");

            // 1.获取minio的链接信息 创建一个minio的客户端
            MinioClient minioClient = MinioClient.builder().credentials("minio", "minio123").endpoint("http://192.168.73.128:9000").build();

            // 2.上传

            PutObjectArgs putObjectArgs = PutObjectArgs.builder()
                    .object("plugins/js/index.js") //文件名称
                    .contentType("text/js") //文件类型
                    .bucket("leadnews") // 桶名称 与minio管理界面创建的桶一致即可
                    .stream(fileInputStream, fileInputStream.available(), -1)
                    .build();

            minioClient.putObject(putObjectArgs);

            // 访问路径
//            System.out.println("http://192.168.73.128:9000/leadnews/list.html");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
