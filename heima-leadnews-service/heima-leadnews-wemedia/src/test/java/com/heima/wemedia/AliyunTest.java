package com.heima.wemedia;

import com.heima.common.aliyun.GreenTextScanPlus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AliyunTest {

    @Autowired
    private GreenTextScanPlus greenTextScanPlus;

    /**
     * 测试文本内容审核
     */
    @Test
    public void testScanText() throws Exception {
//        Map map = greenTextScanPlus.greenTextScan("我是sb");
//        System.out.println(map);
    }

    /**
     * 测试图片审核
     */
    @Test
    public void testScanImage() {

    }
}
