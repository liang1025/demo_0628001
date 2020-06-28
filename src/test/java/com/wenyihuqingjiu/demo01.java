package com.wenyihuqingjiu;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo01 {

    @Test
    public void testEmailGenerator() {

        demo062801 dm = new demo062801();
        String email = dm.generate();

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "wenyihuqingjiu@sina.com");
        System.out.println("邮件地址是：" + email);
    }
}
