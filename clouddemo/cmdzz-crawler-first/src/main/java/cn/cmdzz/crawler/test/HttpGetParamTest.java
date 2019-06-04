package cn.cmdzz.crawler.test;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @author cmdzz
 * @date 2019/6/4 - 22:16
 * get 带参
 */
public class HttpGetParamTest {
    public static void main(String[] args) throws Exception {
        //1.创建httpClient对象
        //http://yun.itheima.com/search?keys=java
        //创建uribuilder
        URIBuilder uriBuilder = new URIBuilder("http://yun.itheima.com/search");
        //设置参数
        uriBuilder.setParameter("keys","java");
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //2.创建HttpGet对象
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        CloseableHttpResponse response = null;
        try {
            //3.发起请求，获取response
             response = httpClient.execute(httpGet);
            //4.解析响应
            if(response.getStatusLine().getStatusCode()==200){
                String content = EntityUtils.toString(response.getEntity(), "utf8");
                System.out.println(content.length());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭response
            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
