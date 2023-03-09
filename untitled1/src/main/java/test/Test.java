package test;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import singleton.OkhttpUtil;

/**
 * @author oumd
 * @date 2023/3/9
 */
public class Test {

    public static void main(String[] args) {
        OkHttpClient okHttpClient1 = OkhttpUtil.getOkHttpClient();

        okHttpClient1 = okHttpClient1.newBuilder().connectTimeout(30, TimeUnit.SECONDS).build();

        OkHttpClient okHttpClient2 = OkhttpUtil.getOkHttpClient();

        okHttpClient2 = okHttpClient2.newBuilder().connectTimeout(30, TimeUnit.SECONDS).build();

    }
}
